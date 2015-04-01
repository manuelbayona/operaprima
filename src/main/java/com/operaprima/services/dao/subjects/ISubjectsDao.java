package com.operaprima.services.dao.subjects;

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Dartboard
 *
 */
public interface ISubjectsDao {

	/**
	 * @param subject
	 * @return
	 */
	SubjectIntDto addSubject(final SubjectIntDto subject);

	/**
	 * @return
	 */
	SubjectsIntDto listSubjects();

	/**
	 * @param id
	 * @return
	 */
	SubjectIntDto getSubject(String id);

	/**
	 * @param subject
	 * @return
	 */
	SubjectIntDto updateSubject(final SubjectIntDto subject);

}
