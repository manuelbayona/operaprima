package com.operaprima.services.business.persons;

import com.operaprima.services.business.dtos.GroupsIntDto;
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
	PersonIntDto addPerson(final PersonIntDto person);

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
	PersonIntDto updatePerson(PersonIntDto person);

	/**
	 * @param GroupsIntDto
	 * @return String
	 */
	GroupsIntDto listGroupsByPerson(String id);

}
