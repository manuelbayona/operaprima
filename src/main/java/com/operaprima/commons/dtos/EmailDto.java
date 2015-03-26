package com.operaprima.commons.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class EmailDto implements Serializable {

	private static final long serialVersionUID = 715826128558945308L;

	private String address;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}
}
