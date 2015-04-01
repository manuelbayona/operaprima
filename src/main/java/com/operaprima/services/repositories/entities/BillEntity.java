package com.operaprima.services.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bills")
public class BillEntity {

	@Id
	private ObjectId id;
	private AmountEntity amount;
	private DateTime paymentDay;
	private String concept;

	@DBRef
	private PersonEntity owner;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

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
	 * @return the concept
	 */
	public String getConcept() {
		return concept;
	}

	/**
	 * @param concept
	 *            the concept to set
	 */
	public void setConcept(final String concept) {
		this.concept = concept;
	}

	/**
	 * @return the owner
	 */
	public PersonEntity getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(final PersonEntity owner) {
		this.owner = owner;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof BillEntity)) {
			return false;
		}
		final BillEntity castOther = (BillEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(amount, castOther.amount).append(paymentDay, castOther.paymentDay)
				.append(concept, castOther.concept).append(owner, castOther.owner).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(amount).append(paymentDay).append(concept).append(owner).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("amount", amount).append("paymentDay", paymentDay)
				.append("concept", concept).append("owner", owner).toString();
	}

}
