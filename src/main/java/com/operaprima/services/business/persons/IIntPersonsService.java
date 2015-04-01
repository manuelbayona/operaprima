package com.operaprima.services.business.persons;

import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

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
	 *
	 * @param String
	 * @return SessionsDto
	 */
	SessionsIntDto listSessionsByPerson(final String id);

	/**
	 *
	 * @param id
	 * @return
	 */
	BillsIntDto listBillsByPerson(final String id);

	/**
	 *
	 * @param id
	 * @return GroupsDto
	 */
	GroupsIntDto listGroupsByPerson(final String id);

	/**
	 *
	 * @param String
	 * @return AttendancesDto
	 */
	AttendancesIntDto listAttendancesByPerson(final String id);

}
