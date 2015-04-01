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
	 * @param person
	 * @return PersonIntDto
	 */
	PersonIntDto addPerson(final PersonIntDto person);

	/**
	 * @return PersonsIntDto
	 */
	PersonsIntDto listPersons();

	/**
	 * @param id
	 * @return PersonIntDto
	 */
	PersonIntDto getPerson(final String id);

	/**
	 * @param person
	 * @return id
	 */
	PersonIntDto updatePerson(final PersonIntDto person);

	/**
	 * @param id
	 * @return GroupsIntDto
	 */
	GroupsIntDto listGroupsByPerson(String id);

}
