package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "price")
public class PriceDto implements Serializable {

	private static final long serialVersionUID = 3773473366758876453L;

	@XmlElement(name = "amount")
	private AmountDto amount;

	@XmlElement(name = "specialAmount")
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
