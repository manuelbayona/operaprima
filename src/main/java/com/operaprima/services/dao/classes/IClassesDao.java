package com.operaprima.services.dao.classes;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface IClassesDao {

	/**
	 * @param ClassIntDto
	 * @return ClassIntDto
	 */
	ClassIntDto addClass(final ClassIntDto classdto);

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

	/**
	 * @return
	 */
	ClassesIntDto listClasses();
}
