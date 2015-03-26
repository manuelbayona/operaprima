package com.operaprima.services.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class AmountDto implements Serializable {

	private static final long serialVersionUID = -2612896823259419677L;

	private String amount;
	private String currency;

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
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(final String currency) {
		this.currency = currency;
	}

}
