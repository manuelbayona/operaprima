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

import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.persons.IIntPersonsService;
import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.PersonsDto;

/**
 * @author Adesis
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
	@PUT
	@Path("/")
	public PersonDto updatePerson(final PersonDto person) {
		final PersonIntDto map = mapper.map(person, PersonIntDto.class);
		final PersonIntDto updatePerson = iIntPersonsService.updatePerson(map);
		return mapper.map(updatePerson, PersonDto.class);
	}

}
