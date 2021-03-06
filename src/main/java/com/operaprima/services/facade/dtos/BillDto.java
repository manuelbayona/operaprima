package com.operaprima.services.facade.dtos;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import com.operaprima.commons.service.facade.dtos.AmountDto;
import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "bill")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillDto implements Serializable {

	private static final long serialVersionUID = -1173756596149776348L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@NotNull
	@Valid
	@XmlElement(name = "amount")
	private AmountDto amount;

	@NotNull
	@NotEmpty
	@NotBlank
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "paymentDay")
	private DateTime paymentDay;

	@NotNull
	@Valid
	@XmlElement(name = "owner")
	private PersonDto owner;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 140)
	@XmlElement(name = "concept")
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
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

}
