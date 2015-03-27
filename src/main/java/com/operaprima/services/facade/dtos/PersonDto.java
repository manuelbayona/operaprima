package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.operaprima.commons.service.facade.dtos.PhoneDto;
import com.operaprima.commons.utils.adapter.DateTimeAdapter;
import com.operaprima.services.facade.dtos.enums.UserStateEnum;
import com.operaprima.services.facade.dtos.enums.UserTypeEnum;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "person")
public class PersonDto implements Serializable {

	private static final long serialVersionUID = -7277315609468397094L;

	@XmlElement(name = "id", required = true)
	private String id;

	@XmlElement(name = "name", required = true)
	private String name;

	@XmlElement(name = "lastName", required = true)
	private String lastName;

	@XmlElement(name = "avatar", required = true)
	private byte[] avatar;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "birthDate", required = true)
	private DateTime birthDate;

	@XmlElement(name = "type", required = true)
	private UserTypeEnum type;

	@XmlElement(name = "phones", required = true)
	private List<PhoneDto> phones;

	@XmlElement(name = "state", required = true)
	private UserStateEnum state;

	@XmlElement(name = "group", required = true)
	private List<SubjectDto> group;

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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the avatar
	 */
	public byte[] getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(final byte[] avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the birthDate
	 */
	public DateTime getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(final DateTime birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the type
	 */
	public UserTypeEnum getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final UserTypeEnum type) {
		this.type = type;
	}

	/**
	 * @return the phones
	 */
	public List<PhoneDto> getPhones() {
		return phones;
	}

	/**
	 * @param phones
	 *            the phones to set
	 */
	public void setPhones(final List<PhoneDto> phones) {
		this.phones = phones;
	}

	/**
	 * @return the state
	 */
	public UserStateEnum getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(final UserStateEnum state) {
		this.state = state;
	}

	/**
	 * @return the group
	 */
	public List<SubjectDto> getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(final List<SubjectDto> group) {
		this.group = group;
	}

}
