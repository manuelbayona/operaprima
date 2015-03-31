package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class SubjectIntDto {

	private String id;
	private String description;
	private List<ClassIntDto> classes;
	private Boolean active;

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

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
	}

}
