package com.operaprima.commons.utils.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.log4j.Logger;

import com.operaprima.commons.utils.ErrorDto;

/**
 * @author Stormtroopers
 *
 */
public class OperaPrimaExceptionHandler implements ExceptionMapper<OperaPrimaException> {

	final static Logger logger = Logger.getLogger(OperaPrimaExceptionHandler.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(final OperaPrimaException exception) {
		final ErrorDto error = exception.getError();
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
