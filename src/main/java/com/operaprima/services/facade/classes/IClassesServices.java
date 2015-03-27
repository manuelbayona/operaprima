package com.operaprima.services.facade.classes;

import com.operaprima.services.facade.dtos.ClassDto;
import com.operaprima.services.facade.dtos.ClassesDto;

/**
 * @author Adesis
 *
 */
public interface IClassesServices {

	/**
	 * @param ClassDto
	 * @return String
	 */
	ClassDto addClass(final ClassDto classdto);

	/**
	 * @return ClassesDto
	 */
	ClassesDto listClasses();

	/**
	 * @param String
	 * @return ClassDto
	 */
	ClassDto getClass(String id);

	/**
	 * @param ClassDto
	 * @return String
	 */
	ClassDto updateClass(ClassDto classdto);

}
