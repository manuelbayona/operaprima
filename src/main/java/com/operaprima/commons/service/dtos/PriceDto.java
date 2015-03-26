package com.operaprima.commons.service.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class PriceDto implements Serializable {

	private static final long serialVersionUID = 3773473366758876453L;

	private AmountDto amount;
	private AmountDto specialAmount;

	/**
	 * @return the amount
	 */
	public AmountDto getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(final AmountDto amount) {
		this.amount = amount;
	}

	/**
	 * @return the specialAmount
	 */
	public AmountDto getSpecialAmount() {
		return specialAmount;
	}

	/**
	 * @param specialAmount
	 *            the specialAmount to set
	 */
	public void setSpecialAmount(final AmountDto specialAmount) {
		this.specialAmount = specialAmount;
	}

}
