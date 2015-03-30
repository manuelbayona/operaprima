package com.operaprima.services.business.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.dao.persons.IPersonsDao;

/**
 * @author Adesis
 *
 */
@Service
@Mockeable
public class IntPersonsService implements IIntPersonsService {

	@Autowired
	private IPersonsDao personsDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#addPerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	public PersonIntDto addPerson(final PersonIntDto person) {
		return personsDao.addPerson(person);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#listPersons()
	 */
	public PersonsIntDto listPersons() {
		return personsDao.listPersons();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#getPerson(java.lang.String)
	 */
	public PersonIntDto getPerson(final String id) {
		return personsDao.getPerson(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#updatePerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	public PersonIntDto updatePerson(final PersonIntDto person) {
		return personsDao.updatePerson(person);
	}

}
