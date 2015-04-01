package com.operaprima.services.dao.subjects;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class SubjectsDaoMock implements ISubjectsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.subjects.ISubjectsDao#addSubject(com.operaprima.services.business.dtos.SubjectIntDto)
	 */
	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subject) {
		subject.setId(UUID.randomUUID().toString());
		return subject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.subjects.ISubjectsDao#listSubjects()
	 */
	@Override
	public SubjectsIntDto listSubjects() {
		final SubjectsIntDto subjectsIntDto = new SubjectsIntDto();
		subjectsIntDto.setSubjects(new ArrayList<SubjectIntDto>());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		return subjectsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.subjects.ISubjectsDao#getSubject(java.lang.String)
	 */
	@Override
	public SubjectIntDto getSubject(final String id) {
		return new SubjectIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.subjects.ISubjectsDao#updateSubject(com.operaprima.services.business.dtos.SubjectIntDto)
	 */
	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subject) {
		return subject;
	}

}
