package com.operaprima.services.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author Adesis
 * 
 */
public class PriceEntity {

	private AmountEntity amount;
	private AmountEntity specialAmount;

	/**
	 * @return the amount
	 */
	public AmountEntity getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(final AmountEntity amount) {
		this.amount = amount;
	}

	/**
	 * @return the specialAmount
	 */
	public AmountEntity getSpecialAmount() {
		return specialAmount;
	}

	/**
	 * @param specialAmount
	 *            the specialAmount to set
	 */
	public void setSpecialAmount(final AmountEntity specialAmount) {
		this.specialAmount = specialAmount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof PriceEntity)) {
			return false;
		}
		final PriceEntity castOther = (PriceEntity) other;
		return new EqualsBuilder().append(amount, castOther.amount).append(specialAmount, castOther.specialAmount).isEquals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(amount).append(specialAmount).toHashCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("amount", amount).append("specialAmount", specialAmount).toString();
	}

}
