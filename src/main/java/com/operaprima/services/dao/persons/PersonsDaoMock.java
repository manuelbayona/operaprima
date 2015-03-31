package com.operaprima.services.dao.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;

@Repository
@Mock
public class PersonsDaoMock implements IPersonsDao {

	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

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

	@Override
	public PersonIntDto getPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

}
