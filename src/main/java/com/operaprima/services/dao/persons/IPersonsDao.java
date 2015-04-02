package com.operaprima.services.dao.persons;

import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Stormtroopers
 * 
 */
public interface IPersonsDao {

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

	/**
	 * @param id
	 * @return
	 */
	SessionsIntDto listSessionsByPerson(String id);

	/**
	 * @param id
	 * @return
	 */
	BillsIntDto listBillsByPerson(String id);

	/**
	 * @param id
	 * @return
	 */
	AttendancesIntDto listAttendancesByPerson(String id);
}
