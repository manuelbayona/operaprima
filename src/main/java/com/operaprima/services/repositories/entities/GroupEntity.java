package com.operaprima.services.repositories.entities;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groups")
public class GroupEntity {
	@Id
	private ObjectId id;
	private String name;
	private String description;

	private DateTime unusualDates;
	private PriceEntity price;
	private String equipments;
	private Boolean active;

	@DBRef
	private PersonEntity teacher;

	@DBRef
	private BoardEntity board;

	@DBRef
	private List<SessionEntity> sessions;

	private List<ScheduleEntity> schedules;

	@DBRef
	private List<PersonEntity> students;

	@DBRef
	private ClassEntity sClass;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the teacher
	 */
	public PersonEntity getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(final PersonEntity teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the students
	 */
	public List<PersonEntity> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(final List<PersonEntity> students) {
		this.students = students;
	}

	/**
	 * @return the board
	 */
	public BoardEntity getBoard() {
		return board;
	}

	/**
	 * @param board
	 *            the board to set
	 */
	public void setBoard(final BoardEntity board) {
		this.board = board;
	}

	/**
	 * @return the sessions
	 */
	public List<SessionEntity> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions
	 *            the sessions to set
	 */
	public void setSessions(final List<SessionEntity> sessions) {
		this.sessions = sessions;
	}

	/**
	 * @return the schedules
	 */
	public List<ScheduleEntity> getSchedules() {
		return schedules;
	}

	/**
	 * @param schedules
	 *            the schedules to set
	 */
	public void setSchedules(final List<ScheduleEntity> schedules) {
		this.schedules = schedules;
	}

	/**
	 * @return the unusualDates
	 */
	public DateTime getUnusualDates() {
		return unusualDates;
	}

	/**
	 * @param unusualDates
	 *            the unusualDates to set
	 */
	public void setUnusualDates(final DateTime unusualDates) {
		this.unusualDates = unusualDates;
	}

	/**
	 * @return the price
	 */
	public PriceEntity getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceEntity price) {
		this.price = price;
	}

	/**
	 * @return the equipments
	 */
	public String getEquipments() {
		return equipments;
	}

	/**
	 * @param equipments
	 *            the equipments to set
	 */
	public void setEquipments(final String equipments) {
		this.equipments = equipments;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	public ClassEntity getSClass() {
		return sClass;
	}

	public void setSClass(final ClassEntity sClass) {
		this.sClass = sClass;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof GroupEntity)) {
			return false;
		}
		final GroupEntity castOther = (GroupEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(name, castOther.name).append(description, castOther.description)
				.append(unusualDates, castOther.unusualDates).append(price, castOther.price).append(equipments, castOther.equipments)
				.append(active, castOther.active).append(teacher, castOther.teacher).append(board, castOther.board)
				.append(sessions, castOther.sessions).append(schedules, castOther.schedules).append(students, castOther.students)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(description).append(unusualDates).append(price).append(equipments)
				.append(active).append(teacher).append(board).append(sessions).append(schedules).append(students).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("description", description)
				.append("unusualDates", unusualDates).append("price", price).append("equipments", equipments).append("active", active)
				.append("teacher", teacher).append("board", board).append("sessions", sessions).append("schedules", schedules)
				.append("students", students).toString();
	}

}
