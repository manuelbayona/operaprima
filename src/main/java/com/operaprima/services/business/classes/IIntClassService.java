package com.operaprima.services.business.classes;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntClassService {

	/**
	 * @param ClassDto
	 * @return String
	 */
	ClassIntDto addClass(final ClassIntDto classdto);

	/**
	 * @return ClassesDto
	 */
	ClassesIntDto listClasses();

	/**
	 * @param String
	 * @return ClassDto
	 */
	ClassIntDto getClass(String id);

	/**
	 * @param ClassDto
	 * @return String
	 */
	ClassIntDto updateClass(ClassIntDto classdto);

}
