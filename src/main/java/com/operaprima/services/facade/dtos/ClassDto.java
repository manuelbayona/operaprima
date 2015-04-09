package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.operaprima.commons.service.facade.dtos.PriceDto;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "class")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClassDto implements Serializable {

	private static final long serialVersionUID = 5535803118011605983L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@Max(value = 140)
	@XmlElement(name = "note")
	private String note;

	@Valid
	@XmlElement(name = "groups")
	private List<GroupDto> groups;

	@NotNull
	@Valid
	@XmlElement(name = "price")
	private PriceDto price;

	@XmlElement(name = "active")
	private Boolean active;

	@NotNull
	@Valid
	@XmlElement(name = "subject")
	private SubjectDto subject;

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
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(final String note) {
		this.note = note;
	}

	/**
	 * @return the groups
	 */
	public List<GroupDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupDto> groups) {
		this.groups = groups;
	}

	/**
	 * @return the price
	 */
	public PriceDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceDto price) {
		this.price = price;
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

	/**
	 * @return the subject
	 */
	public SubjectDto getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(final SubjectDto subject) {
		this.subject = subject;
	}

}
