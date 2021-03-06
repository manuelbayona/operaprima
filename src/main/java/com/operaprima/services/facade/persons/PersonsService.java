package com.operaprima.services.facade.persons;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.business.persons.IIntPersonsService;
import com.operaprima.services.facade.dtos.AttendancesDto;
import com.operaprima.services.facade.dtos.BillsDto;
import com.operaprima.services.facade.dtos.GroupsDto;
import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.PersonsDto;
import com.operaprima.services.facade.dtos.SessionsDto;

/**
 * @author Stormtroopers
 *
 */
@Service("personsService")
@Path("V01/persons")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class PersonsService implements IPersonsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntPersonsService iIntPersonsService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonService#addPerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	@Override
	@POST
	@Path("/")
	public PersonDto addPerson(final PersonDto person) {
		final PersonIntDto map = mapper.map(person, PersonIntDto.class);
		final PersonIntDto addPerson = iIntPersonsService.addPerson(map);
		return mapper.map(addPerson, PersonDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonService#listPersons()
	 */
	@Override
	@GET
	@Path("/")
	public PersonsDto listPersons() {
		final PersonsIntDto listPersons = iIntPersonsService.listPersons();
		return mapper.map(listPersons, PersonsDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonService#getPerson(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public PersonDto getPerson(@PathParam("id") final String id) {
		final PersonIntDto person = iIntPersonsService.getPerson(id);
		return mapper.map(person, PersonDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonService#updatePerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	@Override
	@PUT
	@Path("/")
	public PersonDto updatePerson(final PersonDto person) {
		final PersonIntDto map = mapper.map(person, PersonIntDto.class);
		final PersonIntDto updatePerson = iIntPersonsService.updatePerson(map);
		return mapper.map(updatePerson, PersonDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonsService#listGroupsByPerson(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}/groups")
	public GroupsDto listGroupsByPerson(@PathParam("id") final String id) {
		final GroupsIntDto listGroupsByPerson = iIntPersonsService.listGroupsByPerson(id);
		return mapper.map(listGroupsByPerson, GroupsDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonsService#listSessionsByPerson(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}/sessions")
	public SessionsDto listSessionsByPerson(@PathParam("id") final String id) {
		final SessionsIntDto listSessionsByPerson = iIntPersonsService.listSessionsByPerson(id);
		return mapper.map(listSessionsByPerson, SessionsDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonsService#listBillsByPerson(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}/bills")
	public BillsDto listBillsByPerson(@PathParam("id") final String id) {
		final BillsIntDto listBillsByPerson = iIntPersonsService.listBillsByPerson(id);
		return mapper.map(listBillsByPerson, BillsDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.persons.IPersonsService#listAttendancesByPerson(java.lang.String)
	 */
	@Override
	@Path("/{id}/attendances")
	public AttendancesDto listAttendancesByPerson(@PathParam("id") final String id) {
		final AttendancesIntDto listAttendancesByPerson = iIntPersonsService.listAttendancesByPerson(id);
		return mapper.map(listAttendancesByPerson, AttendancesDto.class);
	}

}
