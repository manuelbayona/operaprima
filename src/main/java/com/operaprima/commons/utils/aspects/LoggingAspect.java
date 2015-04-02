package com.operaprima.commons.utils.aspects;

import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.operaprima.commons.utils.ErrorDto;
import com.operaprima.commons.utils.enums.ErrorEnum;
import com.operaprima.commons.utils.exceptions.OperaPrimaException;

/**
 * @author Stormtroopers
 *
 */
@Aspect
public class LoggingAspect {

	@Autowired
	ObjectMapper objectMapper;

	final static Logger logger = Logger.getLogger(LoggingAspect.class);

	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	public void isRepository() {
	}

	/**
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(* com.operaprima.services.facade..*(..))")
	public Object captureException(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (final Exception e) {
			logger.error("[ERROR] : " + pjp.getSignature().getName() + " CAUSED BY : " + e.getMessage());
			if (e instanceof OperaPrimaException) {
				throw handleOperaPrimaException((OperaPrimaException) e);
			} else {
				throw new OperaPrimaException(new ErrorDto());
			}
		}
	}

	/**
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(* org.apache.cxf.jaxrs.utils..*(..))")
	public Object notFoundException(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (final Exception e) {
			logger.error("[ERROR] : " + pjp.getSignature().getName() + " CAUSED BY : " + e.getMessage());
			final ErrorDto error = new ErrorDto();
			error.setCause(ErrorEnum.NO_DATA);
			throw new OperaPrimaException(ErrorEnum.NOT_FOUND);
		}
	}

	/**
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(* com.operaprima.services.dao..*(..))")
	public Object captureDaoException(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (final Exception e) {
			logger.error("[ERROR] : " + pjp.getSignature().getName() + " CAUSED BY : " + e.getMessage());
			final ErrorDto error = new ErrorDto();
			error.setCause(ErrorEnum.INEXISTENT_ENTITY);
			error.setMessage("La entidad " + objectMapper.writeValueAsString(pjp.getArgs()) + " no existe");
			error.setTrace(e.getMessage());
			error.setDate(new Date());
			throw new OperaPrimaException(error);
		}
	}

	/**
	 * @param joinPoint
	 * @param result
	 * @throws JsonProcessingException
	 */
	@AfterReturning(pointcut = "isRepository()", returning = "result")
	public void logAfterReturning(final JoinPoint joinPoint, final Object result) throws JsonProcessingException {
		logger.info("[INFO-REPOSITORY] : " + joinPoint.getSignature().getName() + " : ["
				+ objectMapper.writeValueAsString(joinPoint.getArgs()) + "] RETURNS :  [" + objectMapper.writeValueAsString(result) + "]");
	}

	/**
	 * @param joinPoint
	 * @param error
	 */
	@AfterThrowing(pointcut = "execution(* com.operaprima.services..*(..))", throwing = "error")
	public void logAfterThrowing(final JoinPoint joinPoint, final Throwable error) {
		logger.error(error);
	}

	/**
	 * @param e
	 * @return
	 * @throws Exception
	 */
	private OperaPrimaException handleOperaPrimaException(final OperaPrimaException e) throws Exception {
		if (e.getError() != null) {
			return e;
		} else {
			final ErrorDto errorDto = new ErrorDto();
			errorDto.setTrace(e.getMessage());
			errorDto.setDate(new Date());
		}
		return e;
	}
}
