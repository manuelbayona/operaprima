package com.operaprima.services.dtos;

import java.io.Serializable;

import org.joda.time.DateTime;

import com.operaprima.commons.dtos.AmountDto;

/**
 * @author Adesis
 *
 */
public class BillDto implements Serializable {

	private static final long serialVersionUID = -1173756596149776348L;

	private String id;
	private AmountDto amount;
	private DateTime paymentDay;
	private PersonDto owner;
	private String concept;

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
	 * @return the owner
	 */
	public PersonDto getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(final PersonDto owner) {
		this.owner = owner;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
