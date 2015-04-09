package com.operaprima.services.facade.dtos;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "session")
@XmlAccessorType(XmlAccessType.FIELD)
public class SessionDto implements Serializable {

	private static final long serialVersionUID = -6417158778873489011L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@NotNull
	@NotEmpty
	@NotBlank
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "date")
	private DateTime date;

	@Size(min = 1, max = 140)
	@XmlElement(name = "note")
	private String note;

	@NotNull
	@Valid
	@XmlElement(name = "group")
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
