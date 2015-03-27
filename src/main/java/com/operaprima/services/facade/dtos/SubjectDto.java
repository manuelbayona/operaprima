package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "subject")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectDto implements Serializable {

	private static final long serialVersionUID = -4648193946790819031L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "classes")
	private List<ClassDto> classes;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the classes
	 */
	public List<ClassDto> getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(final List<ClassDto> classes) {
		this.classes = classes;
	}

}
