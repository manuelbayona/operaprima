package com.operaprima.services.dao.persons;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
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
@Repository
@Mock
public class PersonsDaoMock implements IPersonsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		person.setId(UUID.randomUUID().toString());
		return person;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonsIntDto listPersons() {
		final PersonIntDto person = new PersonIntDto();
		person.setName("Pepelu");

		final List<PersonIntDto> persons = new ArrayList<>();
		persons.add(person);

		final PersonsIntDto personsDto = new PersonsIntDto();
		personsDto.setPersons(persons);
		return personsDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		return new PersonIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		return person;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupsIntDto listGroupsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionsIntDto listSessionsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillsIntDto listBillsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendancesIntDto listAttendancesByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
