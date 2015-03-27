package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.operaprima.commons.service.facade.dtos.PriceDto;
import com.operaprima.commons.service.facade.dtos.ScheduleDto;
import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "group")
public class GroupDto implements Serializable {

	private static final long serialVersionUID = 5896641952472603087L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "teacher")
	private PersonDto teacher;

	@XmlElement(name = "stud")
	private List<PersonDto> students;

	@XmlElement(name = "board")
	private BoardDto board;

	@XmlElement(name = "sessions")
	private List<SessionDto> sessions;

	@XmlElement(name = "schedules")
	private List<ScheduleDto> schedules;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "unusualDate")
	private DateTime unusualDates;

	@XmlElement(name = "price")
	private PriceDto price;

	@XmlElement(name = "equipments")
	private String equipments;

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
	 * @return the schedules
	 */
	public List<ScheduleDto> getSchedules() {
		return schedules;
	}

	/**
	 * @param schedules
	 *            the schedules to set
	 */
	public void setSchedules(final List<ScheduleDto> schedules) {
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

}
