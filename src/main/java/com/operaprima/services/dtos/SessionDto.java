package com.operaprima.services.dtos;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class SessionDto implements Serializable {

	private static final long serialVersionUID = -6417158778873489011L;

	private String id;
	private DateTime date;
	private String note;

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

}
