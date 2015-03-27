package com.operaprima.services.business.persons;

import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntPersonsService {

	/**
	 * @param PersonIntDto
	 * @return String
	 */
	String addPerson(final PersonIntDto person);

	/**
	 * @return PersonsIntDto
	 */
	PersonsIntDto listPersons();

	/**
	 * @param String
	 * @return PersonIntDto
	 */
	PersonIntDto getPerson(final String id);

	/**
	 * @param PersonIntDto
	 * @return String
	 */
	String updatePerson(PersonIntDto person);

}
