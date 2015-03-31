package com.operaprima.services.dao.subjects;

import java.util.List;

import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;

/**
 * @author Adesis
 *
 */
public interface ISubjectsDao {

	SubjectIntDto addSubject(SubjectIntDto subjectIntDto);

	SubjectIntDto updateSubject(SubjectIntDto subjectIntDto);

	List<SubjectsIntDto> listSubjects();

	SubjectIntDto getSubject(String id);

}
