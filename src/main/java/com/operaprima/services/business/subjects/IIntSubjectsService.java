package com.operaprima.services.business.subjects;

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author adesis
 *
 */
public interface IIntSubjectsService {

	/**
	 * @param subject
	 * @return
	 */
	SubjectIntDto addSubject(SubjectIntDto subject);

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
	SubjectIntDto updateSubject(SubjectIntDto subject);

}
