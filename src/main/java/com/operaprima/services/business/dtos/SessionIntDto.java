package com.operaprima.services.business.dtos;

import org.joda.time.DateTime;

import com.operaprima.services.facade.dtos.GroupDto;

/**
 * @author Stormtroopers
 *
 */
public class SessionIntDto {

	private String id;
	private DateTime date;
	private String note;
	private GroupDto group;

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
	 * @return the date
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(final DateTime date) {
		this.date = date;
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
	 * @return the group
	 */
	public GroupDto getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(final GroupDto group) {
		this.group = group;
	}

}
