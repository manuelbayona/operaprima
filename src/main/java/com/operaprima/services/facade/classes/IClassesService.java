package com.operaprima.services.facade.classes;

import com.operaprima.services.facade.dtos.ClassDto;
import com.operaprima.services.facade.dtos.ClassesDto;

/**
 * @author Adesis
 *
 */
public interface IClassesService {

	/**
	 * @param classDto
	 * @return ClassDto
	 */
	ClassDto addClass(final ClassDto classdto);

	/**
	 * @return ClassesDto
	 */
	ClassesDto listClasses();

	/**
	 * @param id
	 * @return ClassDto
	 */
	ClassDto getClass(String id);

	/**
	 * @param classDto
	 * @return ClassDto
	 */
	ClassDto updateClass(ClassDto classdto);

}
