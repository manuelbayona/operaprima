package com.operaprima.services.dtos;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class BillDto implements Serializable {

	private static final long serialVersionUID = -1173756596149776348L;

	private String amount;
	private DateTime paymentDay;
	private PersonDto owner;

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(final String amount) {
		this.amount = amount;
	}

	/**
	 * @return the paymentDay
	 */
	public DateTime getPaymentDay() {
		return paymentDay;
	}

	/**
	 * @param paymentDay
	 *            the paymentDay to set
	 */
	public void setPaymentDay(final DateTime paymentDay) {
		this.paymentDay = paymentDay;
	}

	/**
	 * @return the owner
	 */
	public PersonDto getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(final PersonDto owner) {
		this.owner = owner;
	}

}
