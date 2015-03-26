package com.operaprima.services.facade.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class PersonsDto {

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
