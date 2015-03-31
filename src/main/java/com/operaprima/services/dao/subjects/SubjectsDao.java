package com.operaprima.services.dao.subjects;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class SubjectsDao implements ISubjectsDao {

	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectsIntDto listSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectIntDto getSubject(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subject) {
		// TODO Auto-generated method stub
		return null;
	}

}
