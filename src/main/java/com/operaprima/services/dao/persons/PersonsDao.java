package com.operaprima.services.dao.persons;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.repositories.IAttendancesRepository;
import com.operaprima.services.repositories.IBillsRepository;
import com.operaprima.services.repositories.IPersonsRepository;
import com.operaprima.services.repositories.entities.AttendanceEntity;
import com.operaprima.services.repositories.entities.BillEntity;
import com.operaprima.services.repositories.entities.PersonEntity;

/**
 * @author Stormtroopers
 * 
 */
@Repository
@Primary
public class PersonsDao implements IPersonsDao {

	@Autowired
	private IPersonsRepository personsRepository;

	@Autowired
	private IBillsRepository billsRepository;

	@Autowired
	private IAttendancesRepository attendancesRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto addPerson(final PersonIntDto person) {
		PersonEntity entity = (PersonEntity) dozerUtils.classMapper(person, PersonEntity.class);
		entity = personsRepository.save(entity);
		person.setId(entity.getId().toString());
		return person;
	}

	/**
	 * {@inheritDoc}
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto getPerson(final String id) {
		final PersonEntity personEntity = personsRepository.findOne(new ObjectId(id));
		final PersonIntDto person = (PersonIntDto) dozerUtils.classMapper(personEntity, PersonIntDto.class);
		return person;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonIntDto updatePerson(final PersonIntDto person) {
		final PersonEntity entity = (PersonEntity) dozerUtils.classMapper(person, PersonEntity.class);
		personsRepository.save(entity);
		return person;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupsIntDto listGroupsByPerson(final String id) {
		final PersonIntDto person = getPerson(id);
		final GroupsIntDto groups = new GroupsIntDto();
		groups.setGroups(person.getGroups());
		return groups;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionsIntDto listSessionsByPerson(final String id) {
		final GroupsIntDto groupsIntDto = listGroupsByPerson(id);
		final List<SessionIntDto> sessions = new ArrayList<>();
		final SessionsIntDto sessionsIntDto = new SessionsIntDto();
		for (final GroupIntDto group : groupsIntDto.getGroups()) {
			sessions.addAll(group.getSessions());
		}
		sessionsIntDto.setSessions(sessions);
		return sessionsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public BillsIntDto listBillsByPerson(final String id) {
		final PersonEntity personEntity = personsRepository.findOne(new ObjectId(id));
		final List<BillEntity> listDB = (List<BillEntity>) billsRepository.findByOwner(personEntity);
		final BillsIntDto billsIntDto = new BillsIntDto();
		billsIntDto.setBills((List<BillIntDto>) dozerUtils.listMapper(listDB, BillIntDto.class));
		return billsIntDto;

	}

	@Override
	@SuppressWarnings("unchecked")
	public AttendancesIntDto listAttendancesByPerson(final String id) {
		final PersonEntity personEntity = personsRepository.findOne(new ObjectId(id));
		final List<AttendanceEntity> listDB = (List<AttendanceEntity>) attendancesRepository.findByStudent(personEntity);
		final AttendancesIntDto attendancesIntDto = new AttendancesIntDto();
		attendancesIntDto.setAttendances((List<AttendanceIntDto>) dozerUtils.listMapper(listDB, AttendanceIntDto.class));
		return attendancesIntDto;
	}

}
