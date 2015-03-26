package com.operaprima.services.business.dtos;

import java.io.Serializable;

/**
 * @author Adesis
 *
 */
public class AttendancesIntDto implements Serializable {

	private static final long serialVersionUID = 5306949025171703942L;

	private String id;
	private Boolean attend;
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
	 * @return the attend
	 */
	public Boolean getAttend() {
		return attend;
	}

	/**
	 * @param attend
	 *            the attend to set
	 */
	public void setAttend(final Boolean attend) {
		this.attend = attend;
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
