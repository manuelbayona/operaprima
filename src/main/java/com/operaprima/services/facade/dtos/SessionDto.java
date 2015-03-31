package com.operaprima.services.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "session")
@XmlAccessorType(XmlAccessType.FIELD)
public class SessionDto implements Serializable {

	private static final long serialVersionUID = -6417158778873489011L;

	@XmlElement(name = "id")
	private String id;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "date")
	private DateTime date;

	@XmlElement(name = "note")
	private String note;

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
	 * @param group the group to set
	 */
	public void setGroup(GroupDto group) {
		this.group = group;
	}

}
