package com.operaprima.services.dao.persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.service.business.dtos.PhoneIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.facade.dtos.enums.UserStateEnum;
import com.operaprima.services.facade.dtos.enums.UserTypeEnum;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class PersonsDao implements IPersonsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#addPerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		person.setId(UUID.randomUUID().toString());
		return person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#listPersons()
	 */
	@Override
	public PersonsIntDto listPersons() {
		final PersonsIntDto personsIntDto = new PersonsIntDto();
		personsIntDto.setPersons(new ArrayList<PersonIntDto>());
		personsIntDto.getPersons().add(getPerson(UUID.randomUUID().toString()));
		personsIntDto.getPersons().add(getPerson(UUID.randomUUID().toString()));
		personsIntDto.getPersons().add(getPerson(UUID.randomUUID().toString()));
		personsIntDto.getPersons().add(getPerson(UUID.randomUUID().toString()));

		return personsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#getPerson(java.lang.String)
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		final PhoneIntDto tfno1 = new PhoneIntDto();
		tfno1.setNumber("123456789");

		final PhoneIntDto tfno2 = new PhoneIntDto();
		tfno2.setNumber("987654321");

		final List<PhoneIntDto> lista = new ArrayList<PhoneIntDto>();
		lista.add(tfno1);
		lista.add(tfno2);

		final PersonIntDto personaInterior = new PersonIntDto();
		personaInterior.setId("1234");
		personaInterior.setName("Manolo");
		personaInterior.setLastName("Bayona");
		final byte[] array = new byte[3];
		Arrays.fill(array, (byte) 1);
		personaInterior.setAvatar(array);
		personaInterior.setBirthDate(new DateTime());
		personaInterior.setType(UserTypeEnum.ADMIN);
		personaInterior.setPhones(lista);
		personaInterior.setState(UserStateEnum.ACTIVE);
		return personaInterior;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#updatePerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		return person;
	}

	@Override
	public GroupsIntDto listGroupsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
