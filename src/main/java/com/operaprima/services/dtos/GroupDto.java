package com.operaprima.services.dtos;

import java.io.Serializable;
import java.util.List;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class GroupDto implements Serializable {

	private static final long serialVersionUID = -4648193946790819031L;

	private String id;
	private String name;
	private String description;
	private PersonDto teacher;
	private List<PersonDto> students;
	private BoardDto board;
	private List<SessionDto> sessions;
	private ScheduleDto schedule;
	private DateTime unusualDates;
	private PriceDto price;

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
	 * @return the board
	 */
	public BoardDto getBoard() {
		return board;
	}

	/**
	 * @param board
	 *            the board to set
	 */
	public void setBoard(final BoardDto board) {
		this.board = board;
	}

	/**
	 * @return the sessions
	 */
	public List<SessionDto> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions
	 *            the sessions to set
	 */
	public void setSessions(final List<SessionDto> sessions) {
		this.sessions = sessions;
	}

	/**
	 * @return the schedule
	 */
	public ScheduleDto getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(final ScheduleDto schedule) {
		this.schedule = schedule;
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
	public PriceDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceDto price) {
		this.price = price;
	}

}
