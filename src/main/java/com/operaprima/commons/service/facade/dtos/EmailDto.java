package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "email")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmailDto implements Serializable {

	private static final long serialVersionUID = 715826128558945308L;

	@XmlElement(name = "address")
	private String address;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}
}
