package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonDto implements Serializable {

	private static final long serialVersionUID = -7277315609468397094L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "lastName")
	private String lastName;

	@XmlElement(name = "avatar")
	private byte[] avatar;

	@XmlElement(name = "birthDate")
	@XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime birthDate;

	@XmlElement(name = "type")
	private UserTypeEnum type;

	@XmlElement(name = "phones")
	private List<PhoneDto> phones;

	@XmlElement(name = "state")
	private UserStateEnum state;

	@XmlElement(name = "group")
	private List<GroupDto> groups;

	@XmlElement(name = "dni")
	private String dni;

	@XmlElement(name = "user")
	private UserDto user;

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
	public List<GroupDto> getGroups() {
		return groups;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroups(final List<GroupDto> groups) {
		this.groups = groups;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 *            the dni to set
	 */
	public void setDni(final String dni) {
		this.dni = dni;
	}

	/**
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserDto user) {
		this.user = user;
	}

}
