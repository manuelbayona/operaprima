package com.operaprima.services.facade.classes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Service;

import com.operaprima.services.facade.dtos.ClassDto;
import com.operaprima.services.facade.dtos.ClassesDto;

/**
 * @author Adesis
 *
 */
@Service("classesService")
@Path("V01/classes")
public class ClassesServices implements IClassesServices {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#addClass(com.operaprima.services.facade.dtos.ClassDto)
	 */
	@POST
	@Path("/")
	public ClassDto addClass(final ClassDto classdto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#listClasses()
	 */
	@GET
	@Path("/")
	public ClassesDto listClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#getClass(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public ClassDto getClass(@PathParam("id") final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#updateClass(com.operaprima.services.facade.dtos.ClassDto)
	 */
	@PUT
	@Path("/")
	public ClassDto updateClass(final ClassDto classdto) {
		// TODO Auto-generated method stub
		return null;
	}

}
