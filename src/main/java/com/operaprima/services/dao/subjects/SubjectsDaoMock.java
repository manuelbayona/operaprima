package com.operaprima.services.dao.subjects;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Mock
public class SubjectsDaoMock implements ISubjectsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subject) {
		subject.setId(UUID.randomUUID().toString());
		return subject;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectsIntDto listSubjects() {
		final SubjectsIntDto subjectsIntDto = new SubjectsIntDto();
		subjectsIntDto.setSubjects(new ArrayList<SubjectIntDto>());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		return subjectsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectIntDto getSubject(final String id) {
		return new SubjectIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subject) {
		return subject;
	}

}
