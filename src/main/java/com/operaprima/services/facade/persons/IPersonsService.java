package com.operaprima.services.facade.persons;

import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.PersonsDto;

/**
 * @author Adesis
 *
 */
public interface IPersonsService {

	/**
	 * Servicio de negocio encargado de dar de alta una nueva persona
	 *
	 * @param PersonDto
	 * @return String
	 */
	String addPerson(final PersonDto person);

	/**
	 * Servicio de negocio que consulta todas las personas
	 *
	 * @return PersonsDto
	 */
	PersonsDto listPersons();

	/**
	 * Servicio de negocio que consulta una persona
	 *
	 * @param String
	 * @return PersonDto
	 */
	PersonDto getPerson(final String id);

	/**
	 * Servicio de negocio que actualiza una persona
	 * 
	 * @param PersonDto
	 * @return String
	 */
	String updatePerson(final PersonDto person);

}
