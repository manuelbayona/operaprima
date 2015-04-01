package com.operaprima.services.facade.persons;

import com.operaprima.services.facade.dtos.GroupsDto;
import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.PersonsDto;

/**
 * @author Stormtroopers
 *
 */
public interface IPersonsService {

	/**
	 * Servicio de negocio encargado de dar de alta una nueva persona
	 *
	 * @param person
	 * @return PersonDto
	 */
	PersonDto addPerson(final PersonDto person);

	/**
	 * Servicio de negocio que consulta todas las personas
	 *
	 * @return PersonsDto
	 */
	PersonsDto listPersons();

	/**
	 * Servicio de negocio que consulta una persona
	 *
	 * @param id
	 * @return PersonDto
	 */
	PersonDto getPerson(final String id);

	/**
	 * Servicio de negocio que actualiza una persona
	 *
	 * @param id
	 * @return PersonDto
	 */
	PersonDto updatePerson(final PersonDto person);

	/**
	 * Servicio de negocio que devuelve los grupos a los que pertenece una persona
	 *
	 * @param id
	 * @return GroupsDto
	 */
	GroupsDto listGroupsByPerson(final String id);

}
