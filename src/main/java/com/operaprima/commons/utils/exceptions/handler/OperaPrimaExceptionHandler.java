package com.operaprima.commons.utils.exceptions.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.log4j.Logger;

import com.operaprima.commons.utils.ErrorDto;

/**
 * @author Stormtroopers
 *
 */
public class OperaPrimaExceptionHandler implements ExceptionMapper<Exception> {

	final static Logger logger = Logger.getLogger(OperaPrimaExceptionHandler.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(final Exception arg0) {
		final ErrorDto error = new ErrorDto();
		error.setTrace(arg0.getStackTrace().toString());
		error.setMessage(arg0.getMessage());
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}
}
