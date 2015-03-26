package com.operaprima.commons.business.dtos;


/**
 * @author Adesis
 *
 */
public class PriceIntDto {

	private AmountIntDto amount;
	private AmountIntDto specialAmount;

	/**
	 * @return the amount
	 */
	public AmountIntDto getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(final AmountIntDto amount) {
		this.amount = amount;
	}

	/**
	 * @return the specialAmount
	 */
	public AmountIntDto getSpecialAmount() {
		return specialAmount;
	}

	/**
	 * @param specialAmount
	 *            the specialAmount to set
	 */
	public void setSpecialAmount(final AmountIntDto specialAmount) {
		this.specialAmount = specialAmount;
	}

}
