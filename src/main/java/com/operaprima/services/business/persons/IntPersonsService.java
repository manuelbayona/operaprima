package com.operaprima.services.business.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.dao.persons.IPersonsDao;

/**
 * @author Stormtroopers
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
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		return personsDao.addPerson(person);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#listPersons()
	 */
	@Override
	public PersonsIntDto listPersons() {
		return personsDao.listPersons();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#getPerson(java.lang.String)
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		return personsDao.getPerson(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#updatePerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		return personsDao.updatePerson(person);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.persons.IIntPersonsService#listGroupsByPerson(java.lang.String)
	 */
	@Override
	public GroupsIntDto listGroupsByPerson(final String id) {
		return personsDao.listGroupsByPerson(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.persons.IIntPersonsService#listSessionsByPerson(java.lang.String)
	 */
	@Override
	public SessionsIntDto listSessionsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.persons.IIntPersonsService#listBillsByPerson(java.lang.String)
	 */
	@Override
	public BillsIntDto listBillsByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.persons.IIntPersonsService#listAttendancesByPerson(java.lang.String)
	 */
	@Override
	public AttendancesIntDto listAttendancesByPerson(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
