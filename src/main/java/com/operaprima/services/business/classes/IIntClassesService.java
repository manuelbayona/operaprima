package com.operaprima.services.business.classes;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntClassesService {

	/**
	 * @param ClassDto
	 * @return ClassIntDto
	 */
	ClassIntDto addClass(final ClassIntDto classdto);

	/**
	 * @return ClassesIntDto
	 */
	ClassesIntDto listClasses();

	/**
	 * @param String
	 * @return ClassIntDto
	 */
	ClassIntDto getClass(String id);

	/**
	 * @param ClassIntDto
	 * @return ClassIntDto
	 */
	ClassIntDto updateClass(ClassIntDto classdto);

}
