package com.operaprima.services.facade.dtos;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "persons")
public class PersonsDto {

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
