package com.operaprima.commons.service.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class PhoneDto implements Serializable {

	private static final long serialVersionUID = -5261627429407811274L;

	private String number;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(final String number) {
		this.number = number;
	}

}
