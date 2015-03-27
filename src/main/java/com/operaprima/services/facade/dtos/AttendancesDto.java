package com.operaprima.services.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "attendances")
@XmlAccessorType(XmlAccessType.FIELD)
public class AttendancesDto implements Serializable {

	private static final long serialVersionUID = 5306949025171703942L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "attend")
	private Boolean attend;

	@XmlElement(name = "note")
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
