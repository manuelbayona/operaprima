package com.operaprima.services.dtos;

import java.io.Serializable;
import java.util.List;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class SessionDto implements Serializable {

	private static final long serialVersionUID = -6417158778873489011L;

	private String id;
	private PersonDto teacher;
	private List<PersonDto> students;
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
	 * @return the teacher
	 */
	public PersonDto getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(final PersonDto teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the students
	 */
	public List<PersonDto> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(final List<PersonDto> students) {
		this.students = students;
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
