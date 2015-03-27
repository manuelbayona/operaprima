package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "classes")
public class ClassesDto implements Serializable {

	private static final long serialVersionUID = -6869244284550197700L;

	@XmlElement(name = "classes")
	private List<ClassesDto> classes;

	/**
	 * @return the classes
	 */
	public List<ClassesDto> getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(final List<ClassesDto> classes) {
		this.classes = classes;
	}
}
