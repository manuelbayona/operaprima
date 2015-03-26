package com.operaprima.commons.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class PriceDto implements Serializable {

	private static final long serialVersionUID = 3773473366758876453L;

	private String id;
	private AmountDto amount;
	private AmountDto specialAmount;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

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
