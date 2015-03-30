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
	public PersonIntDto addPerson(PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonsIntDto listPersons() {
		PersonIntDto person = new PersonIntDto();
		person.setName("Pepelu");
		
		List<PersonIntDto> persons = new ArrayList<>();
		persons.add(person);
		
		PersonsIntDto personsDto = new PersonsIntDto();
		personsDto.setPersons(persons);
		return personsDto;
	}

	@Override
	public PersonIntDto getPerson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonIntDto updatePerson(PersonIntDto person) {
		// TODO Auto-generated method stub
		return null;
	}

}
