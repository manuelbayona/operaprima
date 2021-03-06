package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonsDto implements Serializable {

	private static final long serialVersionUID = -9132409827022305363L;

	@XmlElement(name = "persons")
	private List<PersonDto> persons;

	/**
	 * @return the persons
	 */
	public List<PersonDto> getPersons() {
		return persons;
	}

	/**
	 * @param persons
	 *            the persons to set
	 */
	public void setPersons(final List<PersonDto> persons) {
		this.persons = persons;
	}

}
