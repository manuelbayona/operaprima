package com.operaprima.services.dao.repositories.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PhoneEntity {

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
