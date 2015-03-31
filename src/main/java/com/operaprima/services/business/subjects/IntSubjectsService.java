package com.operaprima.services.business.subjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;
import com.operaprima.services.dao.subjects.ISubjectsDao;

/**
 * @author adesis
 *
 */
@Service
@Mockeable
public class IntSubjectsService implements IIntSubjectsService {

	@Autowired
	private ISubjectsDao iSubjectDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.subjects.IIntSubjectsService#addSubject(com.operaprima.services.business.dtos.SubjectIntDto)
	 */
	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subject) {
		return iSubjectDao.addSubject(subject);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.subjects.IIntSubjectsService#listSubjects()
	 */
	@Override
	public SubjectsIntDto listSubjects() {
		return iSubjectDao.listSubjects();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.subjects.IIntSubjectsService#getSubject(java.lang.String)
	 */
	@Override
	public SubjectIntDto getSubject(final String id) {
		return iSubjectDao.getSubject(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.subjects.IIntSubjectsService#updateSubject(com.operaprima.services.business.dtos.SubjectIntDto)
	 */
	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subject) {
		return iSubjectDao.updateSubject(subject);
	}

}
