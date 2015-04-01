package com.operaprima.commons.utils.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.operaprima.commons.utils.exceptions.OperaPrimaException;

@Aspect
public class LoggingAspect {

	final static Logger logger = Logger.getLogger(LoggingAspect.class);

	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	public void isRepository() {
	}

	@Before("isRepository()")
	public void logBefore(final JoinPoint joinPoint) {
		logger.info("logBefore() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("******");
	}

	@After("isRepository()")
	public void logAfter(final JoinPoint joinPoint) {
		logger.info("logAfter() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("******");
	}

	@Around("execution(* com.operaprima..*(..))")
	public Object captureException(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (final Exception e) {
			logger.error("Error en : " + pjp.getClass().getName() + " - " + pjp.getSignature().getName() + "with args " + pjp.getArgs());
			throw new OperaPrimaException(e);
		}
	}

	@AfterReturning(pointcut = "isRepository()", returning = "result")
	public void logAfterReturning(final JoinPoint joinPoint, final Object result) {
		logger.info("logAfterReturning() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("Method returned value is : " + result);
		logger.info("******");
	}

	@AfterThrowing(pointcut = "execution(* com.operaprima.services..*(..))", throwing = "error")
	public void logAfterThrowing(final JoinPoint joinPoint, final Throwable error) {
		logger.error("logAfterThrowing() is running!");
		logger.error("hijacked : " + joinPoint.getSignature().getName());
		logger.error("Exception : " + error);
		logger.error("******");
	}
}
