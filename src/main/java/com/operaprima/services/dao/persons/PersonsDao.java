package com.operaprima.services.dao.persons;

import java.util.List;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.dao.repositories.IPersonsRepository;
import com.operaprima.services.dao.repositories.entities.PersonEntity;

/**
 * @author Adesis
 * 
 */
@Repository
@Primary
public class PersonsDao implements IPersonsDao {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IPersonsRepository personsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#addPerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		PersonEntity entity = mapper.map(person, PersonEntity.class);
		entity = personsRepository.save(entity);
		person.setId(entity.getId().toString());
		return person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#listPersons()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public PersonsIntDto listPersons() {
		final List<PersonEntity> listDB = (List<PersonEntity>) personsRepository.findAll();

		if (listDB == null) {
			return null;
		}

		final PersonsIntDto personsIntDto = new PersonsIntDto();
		personsIntDto.setPersons((List<PersonIntDto>) dozerUtils.listMapper(listDB, PersonIntDto.class));
		return personsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#getPerson(java.lang.String)
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		final PersonEntity personEntity = personsRepository.findOne(new ObjectId(id));
		final PersonIntDto person = mapper.map(personEntity, PersonIntDto.class);
		return person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.persons.IPersonsDao#updatePerson(com.operaprima.services.business.dtos.PersonIntDto)
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		final PersonEntity entity = mapper.map(person, PersonEntity.class);
		personsRepository.save(entity);
		return person;

	}

	@Override
	public GroupsIntDto listGroupsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
