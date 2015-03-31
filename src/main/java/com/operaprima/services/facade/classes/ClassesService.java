package com.operaprima.services.facade.classes;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.classes.IIntClassService;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.facade.dtos.ClassDto;
import com.operaprima.services.facade.dtos.ClassesDto;

/**
 * @author Adesis
 *
 */
@Service("classesService")
@Path("V01/classes")
@Consumes("application/json")
@Produces("application/json")
public class ClassesService implements IClassesService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntClassService iIntClassService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#addClass(com.operaprima.services.facade.dtos.ClassDto)
	 */
	@POST
	@Path("/")
	public ClassDto addClass(final ClassDto classdto) {
		final ClassIntDto map = mapper.map(classdto, ClassIntDto.class);
		final ClassIntDto addClass = iIntClassService.addClass(map);
		return mapper.map(addClass, ClassDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#listClasses()
	 */
	@GET
	@Path("/")
	public ClassesDto listClasses() {
		final ClassesIntDto listClasses = iIntClassService.listClasses();
		return mapper.map(listClasses, ClassesDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#getClass(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public ClassDto getClass(@PathParam("id") final String id) {
		final ClassIntDto getClass = iIntClassService.getClass(id);
		return mapper.map(getClass, ClassDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#updateClass(com.operaprima.services.facade.dtos.ClassDto)
	 */
	@PUT
	@Path("/")
	public ClassDto updateClass(final ClassDto classdto) {
		final ClassIntDto map = mapper.map(classdto, ClassIntDto.class);
		final ClassIntDto updateClass = iIntClassService.updateClass(map);
		return mapper.map(updateClass, ClassDto.class);
	}

}
