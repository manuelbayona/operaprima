package com.operaprima.services.facade.subjects;

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

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;
import com.operaprima.services.business.subjects.IIntSubjectsService;
import com.operaprima.services.facade.dtos.SubjectDto;
import com.operaprima.services.facade.dtos.SubjectsDto;

/**
 * @author Adesis
 *
 */
@Service("subjectsService")
@Path("v01/subjects")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class SubjectsService implements ISubjectsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntSubjectsService iIntSubjectsService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.subjects.ISubjectsService#addSubject(com.operaprima.services.facade.dtos.SubjectDto)
	 */
	@Override
	@POST
	@Path("/")
	public SubjectDto addSubject(final SubjectDto subject) {
		final SubjectIntDto map = mapper.map(subject, SubjectIntDto.class);
		final SubjectIntDto addSubjects = iIntSubjectsService.addSubject(map);
		return mapper.map(addSubjects, SubjectDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.subjects.ISubjectsService#listSubjects()
	 */
	@Override
	@GET
	@Path("/")
	public SubjectsDto listSubjects() {
		final SubjectsIntDto listSubjects = iIntSubjectsService.listSubjects();
		return mapper.map(listSubjects, SubjectsDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.subjects.ISubjectsService#getSubject(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public SubjectDto getSubject(@PathParam("id") final String id) {
		final SubjectIntDto getSubject = iIntSubjectsService.getSubject(id);
		return mapper.map(getSubject, SubjectDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.subjects.ISubjectsService#updateSubject(com.operaprima.services.facade.dtos.SubjectDto)
	 */
	@Override
	@PUT
	@Path("/")
	public SubjectDto updateSubject(final SubjectDto subject) {
		final SubjectIntDto map = mapper.map(subject, SubjectIntDto.class);
		final SubjectIntDto updateSubject = iIntSubjectsService.updateSubject(map);
		return mapper.map(updateSubject, SubjectDto.class);
	}

}
