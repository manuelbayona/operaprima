package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class PersonsIntDto {

	private List<PersonIntDto> persons;

	/**
	 * @return the persons
	 */
	public List<PersonIntDto> getPersons() {
		return persons;
	}

	/**
	 * @param persons
	 *            the persons to set
	 */
	public void setPersons(final List<PersonIntDto> persons) {
		this.persons = persons;
	}

}
