package com.operaprima.services.dao.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class PersonsDaoMock implements IPersonsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#addPerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#listPersons()
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#getPerson(java.lang.String)
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#updatePerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

}
