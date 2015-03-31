package com.operaprima.services.business.dtos;

import java.util.List;

import com.operaprima.commons.service.business.dtos.PriceIntDto;

/**
 * @author Adesis
 *
 */
public class ClassIntDto {

	private String id;
	private String note;
	private List<GroupIntDto> groups;
	private PriceIntDto price;
	private Boolean active;
	private SubjectIntDto subject;

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
	public List<GroupIntDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupIntDto> groups) {
		this.groups = groups;
	}

	/**
	 * @return the price
	 */
	public PriceIntDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceIntDto price) {
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
	public SubjectIntDto getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(final SubjectIntDto subject) {
		this.subject = subject;
	}

}
