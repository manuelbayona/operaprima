package com.operaprima.commons.utils.aspects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

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
	@Around("execution(* com.operaprima.services.dao..*(..))")
	public Object captureDaoException(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (final Exception e) {
			logger.error("[ERROR] : " + pjp.getSignature().getName() + " CAUSED BY : " + e.getMessage());
			throw e;
		}
	}

	/**
	 * @param joinPoint
	 * @param result
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@AfterReturning(pointcut = "isRepository()", returning = "result")
	public void logAfterReturning(final JoinPoint joinPoint, final Object result) throws JsonGenerationException, JsonMappingException,
			IOException {
		logger.info("[INFO-REPOSITORY] : " + joinPoint.getSignature().getName() + " : ["
				+ objectMapper.writeValueAsString(joinPoint.getArgs()) + "] RETURNS :  [" + objectMapper.writeValueAsString(result) + "]");
	}

}
