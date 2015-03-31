package com.operaprima.services.dao.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof PhoneEntity)) {
			return false;
		}
		final PhoneEntity castOther = (PhoneEntity) other;
		return new EqualsBuilder().append(number, castOther.number).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(number).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("number", number).toString();
	}

}
