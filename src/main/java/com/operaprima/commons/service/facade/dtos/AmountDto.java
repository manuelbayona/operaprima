package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "amount")
public class AmountDto implements Serializable {

	private static final long serialVersionUID = -2612896823259419677L;

	@XmlElement(name = "amount")
	private String amount;

	@XmlElement(name = "currency")
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
