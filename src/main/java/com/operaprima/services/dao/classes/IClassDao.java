package com.operaprima.services.dao.classes;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Adesis
 *
 */
public interface IClassDao {

	/**
	 * @param ClassDto
	 * @return String
	 */
	String addClass(final ClassIntDto classdto);

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
	String updateClass(ClassIntDto classdto);

}
