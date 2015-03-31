package com.operaprima.services.business.subjects;

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntSubjectsService {

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
	SubjectIntDto getSubject(final String id);

	/**
	 * @param subject
	 * @return
	 */
	SubjectIntDto updateSubject(final SubjectIntDto subject);

}
