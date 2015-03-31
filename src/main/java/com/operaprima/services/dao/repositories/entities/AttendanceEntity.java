package com.operaprima.services.dao.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "attendances")
public class AttendanceEntity {

	@Id
	private ObjectId id;

	private Boolean attend;

	private String note;

	@DBRef
	private PersonEntity student;

	@DBRef
	private SessionEntity session;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
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

	public PersonEntity getStudent() {
		return student;
	}

	public void setStudent(final PersonEntity student) {
		this.student = student;
	}

	public SessionEntity getSession() {
		return session;
	}

	public void setSession(final SessionEntity session) {
		this.session = session;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof AttendanceEntity)) {
			return false;
		}
		final AttendanceEntity castOther = (AttendanceEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(attend, castOther.attend).append(note, castOther.note)
				.append(student, castOther.student).append(session, castOther.session).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(attend).append(note).append(student).append(session).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("attend", attend).append("note", note).append("student", student)
				.append("session", session).toString();
	}

}
