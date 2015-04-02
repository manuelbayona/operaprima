package com.operaprima.commons.utils;

import java.io.Serializable;
import java.util.Date;

import com.operaprima.commons.utils.enums.ErrorEnum;

/**
 * @author Stormtroopers
 *
 */
public class ErrorDto implements Serializable {

	private static final long serialVersionUID = 6051089386377936740L;

	private String trace;
	private ErrorEnum cause;
	private String message;
	private Date date;

	/**
	 * @return the trace
	 */
	public String getTrace() {
		return trace;
	}

	/**
	 * @param trace
	 *            the trace to set
	 */
	public void setTrace(final String trace) {
		this.trace = trace;
	}

	/**
	 * @return the cause
	 */
	public ErrorEnum getCause() {
		return cause;
	}

	/**
	 * @param cause
	 *            the cause to set
	 */
	public void setCause(final ErrorEnum cause) {
		this.cause = cause;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

}
