package com.operaprima.services.facade.classes;

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

import com.operaprima.services.business.classes.IIntClassesService;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.facade.dtos.ClassDto;
import com.operaprima.services.facade.dtos.ClassesDto;

/**
 * @author Stormtroopers
 *
 */
@Service("classesService")
@Path("V01/classes")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class ClassesService implements IClassesService {
	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntClassesService iIntClassService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.classes.IClassesServices#addClass(com.operaprima.services.facade.dtos.ClassDto)
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
	@PUT
	@Path("/")
	public ClassDto updateClass(final ClassDto classdto) {
		final ClassIntDto map = mapper.map(classdto, ClassIntDto.class);
		final ClassIntDto updateClass = iIntClassService.updateClass(map);
		return mapper.map(updateClass, ClassDto.class);
	}

}
