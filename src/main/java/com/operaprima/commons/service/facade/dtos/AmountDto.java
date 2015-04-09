package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "amount")
@XmlAccessorType(XmlAccessType.FIELD)
public class AmountDto implements Serializable {

	private static final long serialVersionUID = -2612896823259419677L;

	@NotNull
	@NotEmpty
	@NotBlank
	@XmlElement(name = "amount")
	private BigDecimal amount;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 1)
	@XmlElement(name = "currency")
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
