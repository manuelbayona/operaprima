package com.operaprima.commons.service.business.dtos;

import java.math.BigDecimal;

/**
 * @author Stormtroopers
 *
 */
public class AmountIntDto {

	private BigDecimal amount;
	private String currency;

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(final BigDecimal amount) {
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
