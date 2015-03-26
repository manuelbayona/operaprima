package com.operaprima.services.facade.persons;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Service;

import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.PersonsDto;

/**
 * @author Adesis
 *
 */
@Service("personsService")
@Path("V01/persons")
public class PersonsService implements IPersonsService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonService#addPerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	@POST
	@Path("/")
	public String addPerson(final PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonService#listPersons()
	 */
	@GET
	@Path("/")
	public PersonsDto listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonService#getPerson(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public PersonDto getPerson(@PathParam("id") final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.persons.IPersonService#updatePerson(com.operaprima.services.facade.dtos.PersonDto)
	 */
	@PUT
	@Path("/")
	public String updatePerson(final PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

}
