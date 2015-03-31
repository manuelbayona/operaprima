package com.operaprima.services.dao.subjects;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

@Repository
@Mock
public class SubjectsDaoMock implements ISubjectsDao {

	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subject) {
		subject.setId(UUID.randomUUID().toString());
		return subject;
	}

	@Override
	public SubjectsIntDto listSubjects() {
		final SubjectsIntDto subjectsIntDto = new SubjectsIntDto();
		subjectsIntDto.setSubjects(new ArrayList<SubjectIntDto>());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		subjectsIntDto.getSubjects().add(new SubjectIntDto());
		return subjectsIntDto;
	}

	@Override
	public SubjectIntDto getSubject(final String id) {
		return new SubjectIntDto();
	}

	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subject) {
		return subject;
	}

}
