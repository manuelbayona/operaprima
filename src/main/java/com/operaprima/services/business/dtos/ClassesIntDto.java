package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Stormtroopers
 *
 */
public class ClassesIntDto {

	private List<ClassIntDto> classes;

	/**
	 * @return the classes
	 */
	public List<ClassIntDto> getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(final List<ClassIntDto> classes) {
		this.classes = classes;
	}
}
