package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

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

import com.operaprima.commons.service.facade.dtos.PriceDto;
import com.operaprima.commons.service.facade.dtos.ScheduleDto;
import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupDto implements Serializable {

	private static final long serialVersionUID = 5896641952472603087L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 50)
	@XmlElement(name = "name")
	private String name;

	@Size(min = 1, max = 140)
	@XmlElement(name = "description")
	private String description;

	@Valid
	@XmlElement(name = "teacher")
	private PersonDto teacher;

	@NotNull
	@Valid
	@XmlElement(name = "stud")
	private List<PersonDto> students;

	@NotNull
	@Valid
	@XmlElement(name = "board")
	private BoardDto board;

	@NotNull
	@Valid
	@XmlElement(name = "sessions")
	private List<SessionDto> sessions;

	@NotNull
	@Valid
	@XmlElement(name = "schedules")
	private List<ScheduleDto> schedules;

	@NotNull
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "unusualDate")
	private DateTime unusualDates;

	@Valid
	@XmlElement(name = "price")
	private PriceDto price;

	@XmlElement(name = "equipments")
	private String equipments;

	@XmlElement(name = "active")
	private Boolean active;

	@NotNull
	@Valid
	@XmlElement(name = "sClass")
	private ClassDto sclass;

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
	 * @return the sclass
	 */
	public ClassDto getSclass() {
		return sclass;
	}

	/**
	 * @param sclass
	 *            the sclass to set
	 */
	public void setSclass(final ClassDto sclass) {
		this.sclass = sclass;
	}

}
