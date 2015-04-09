package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "subject")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectDto implements Serializable {

	private static final long serialVersionUID = -4648193946790819031L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@NotNull
	@Size(min = 1, max = 140)
	@XmlElement(name = "description")
	private String description;

	@NotNull
	@Valid
	@XmlElement(name = "classes")
	private List<ClassDto> classes;

	@XmlElement(name = "active")
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
