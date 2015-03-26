package com.operaprima.services.dtos;

import java.io.Serializable;
import java.util.List;

import org.joda.time.DateTime;

import com.operaprima.services.dtos.enums.UserStateEnum;
import com.operaprima.services.dtos.enums.UserTypeEnum;

/**
 * @author Adesis
 *
 */
public class PersonDto implements Serializable {

	private static final long serialVersionUID = -7277315609468397094L;

	private String id;
	private String name;
	private String lastName;
	private byte[] avatar;
	private DateTime birthDate;
	private UserTypeEnum type;
	private List<PhoneDto> phones;
	private UserStateEnum state;
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
	 * @param group the group to set
	 */
	public void setGroup(List<SubjectDto> group) {
		this.group = group;
	}

}
