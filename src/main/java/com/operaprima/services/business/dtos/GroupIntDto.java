package com.operaprima.services.business.dtos;

import java.util.List;

import org.joda.time.DateTime;

import com.operaprima.commons.service.business.dtos.PriceIntDto;
import com.operaprima.commons.service.business.dtos.ScheduleIntDto;

/**
 * @author Stormtroopers
 *
 */
public class GroupIntDto {

	private String id;
	private String name;
	private String description;
	private PersonIntDto teacher;
	private List<PersonIntDto> students;
	private BoardIntDto board;
	private List<SessionIntDto> sessions;
	private List<ScheduleIntDto> schedules;
	private DateTime unusualDates;
	private PriceIntDto price;
	private String equipments;
	private Boolean active;
	private ClassIntDto sClass;

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
	public PersonIntDto getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(final PersonIntDto teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the students
	 */
	public List<PersonIntDto> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(final List<PersonIntDto> students) {
		this.students = students;
	}

	/**
	 * @return the board
	 */
	public BoardIntDto getBoard() {
		return board;
	}

	/**
	 * @param board
	 *            the board to set
	 */
	public void setBoard(final BoardIntDto board) {
		this.board = board;
	}

	/**
	 * @return the sessions
	 */
	public List<SessionIntDto> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions
	 *            the sessions to set
	 */
	public void setSessions(final List<SessionIntDto> sessions) {
		this.sessions = sessions;
	}

	/**
	 * @return the schedules
	 */
	public List<ScheduleIntDto> getSchedules() {
		return schedules;
	}

	/**
	 * @param schedules
	 *            the schedules to set
	 */
	public void setSchedules(final List<ScheduleIntDto> schedules) {
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
	public PriceIntDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceIntDto price) {
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

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
	}

	/**
	 * @return the sClass
	 */
	public ClassIntDto getsClass() {
		return sClass;
	}

	/**
	 * @param sClass
	 *            the sClass to set
	 */
	public void setsClass(final ClassIntDto sClass) {
		this.sClass = sClass;
	}

}
