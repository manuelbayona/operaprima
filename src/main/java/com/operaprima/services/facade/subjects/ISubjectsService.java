package com.operaprima.services.facade.subjects;

import com.operaprima.services.facade.dtos.SubjectDto;
import com.operaprima.services.facade.dtos.SubjectsDto;

/**
 * @author Adesis
 *
 */
public interface ISubjectsService {

	/**
	 * Servicio de negocio encargado de añadir una asignatura
	 *
	 * @param SubjectDto
	 * @return SubjectDto
	 */
	SubjectDto addSubject(final SubjectDto subject);

	/**
	 * Servicio de negocio encargado de obtener todas las asignaturas
	 *
	 * @param SubjectDto
	 * @return SubjectDto
	 */
	SubjectsDto listSubjects();

	/**
	 * Servicio de negocio encargado de obtener una asignatura
	 *
	 * @param SubjectDto
	 * @return SubjectDto
	 */
	SubjectDto getSubject(final String id);

	/**
	 * Servicio de negocio encargado de actualizar una asignatura
	 *
	 * @param SubjectDto
	 * @return SubjectDto
	 */
	SubjectDto updateSubject(final SubjectDto subject);

}
