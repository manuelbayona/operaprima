package com.operaprima.services.business.dtos;

/**
 * @author Stormtroopers
 *
 */
public class AttendanceIntDto {

	private String id;
	private Boolean attend;
	private String note;
	private PersonIntDto student;
	private SessionIntDto session;

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
	 * @return the student
	 */
	public PersonIntDto getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(final PersonIntDto student) {
		this.student = student;
	}

	/**
	 * @return the session
	 */
	public SessionIntDto getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(final SessionIntDto session) {
		this.session = session;
	}

}
