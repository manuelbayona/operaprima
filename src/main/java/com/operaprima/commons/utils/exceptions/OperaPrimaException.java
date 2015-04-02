package com.operaprima.commons.utils.exceptions;

import com.operaprima.commons.utils.ErrorDto;
import com.operaprima.commons.utils.enums.ErrorEnum;

/**
 * @author Stormtroopers
 *
 */
public class OperaPrimaException extends RuntimeException {

	private static final long serialVersionUID = -1031270007747289048L;

	private ErrorDto error;

	public OperaPrimaException(final ErrorDto error) {
		this.setError(error);
	}

	public OperaPrimaException(final ErrorEnum cause, final Object... params) {
		setError(new ErrorDto());
		getError().setCause(cause);
	}

	/**
	 * @return the error
	 */
	public ErrorDto getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(final ErrorDto error) {
		this.error = error;
	}
}
