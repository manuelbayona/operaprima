package com.operaprima.commons.utils.exceptions.handler;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.operaprima.commons.utils.ErrorDto;

/**
 * @author StormTrooper
 *
 */
public class ConstraintViolationExceptionHandler implements ExceptionMapper<ConstraintViolationException> {

	private static final String SLASH_CH = " - ";
	private static final char SEPARATOR_CH = '.';

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(final ConstraintViolationException arg0) {
		final ErrorDto error = new ErrorDto();
		final Set<ConstraintViolation<?>> constraintViolations = arg0.getConstraintViolations();

		for (final Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator(); iterator.hasNext();) {
			final ConstraintViolation<?> constraint = iterator.next();
			final String propertyPath = constraint.getPropertyPath().toString();
			error.setMessage(propertyPath.substring(propertyPath.lastIndexOf(SEPARATOR_CH) + 1) + SLASH_CH + constraint.getMessage());
		}
		return Response.status(Status.BAD_REQUEST).entity(error).build();
	}
}
