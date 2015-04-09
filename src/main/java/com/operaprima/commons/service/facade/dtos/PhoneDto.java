package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;

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
@XmlRootElement(name = "phone")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneDto implements Serializable {

	private static final long serialVersionUID = -5261627429407811274L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 9, max = 9)
	@XmlElement(name = "number")
	private String number;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(final String number) {
		this.number = number;
	}

}
