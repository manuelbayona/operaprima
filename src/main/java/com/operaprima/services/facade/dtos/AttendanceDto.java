package com.operaprima.services.facade.dtos;

import java.io.Serializable;

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
@XmlRootElement(name = "attendances")
@XmlAccessorType(XmlAccessType.FIELD)
public class AttendanceDto implements Serializable {

	private static final long serialVersionUID = 5306949025171703942L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "attend")
	private Boolean attend;

	@Size(min = 1, max = 140)
	@XmlElement(name = "note")
	private String note;

	@NotNull
	@Valid
	@XmlElement(name = "student")
	private PersonDto student;

	@NotNull
	@Valid
	@XmlElement(name = "session")
	private SessionDto session;

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

	/**
	 * @return the session
	 */
	public SessionDto getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(final SessionDto session) {
		this.session = session;
	}

}
