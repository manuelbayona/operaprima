package com.operaprima.services.dao.repositories.entities;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
public class PersonEntity {

	@Id
	private ObjectId id;
	private String name;
	private String dni;
	private String lastName;
	private byte[] avatar;
	private DateTime birthDate;
	private String type;
	private String state;
	private List<PhoneEntity> phones;

	@DBRef
	private UserEntity user;

	@DBRef
	private List<GroupEntity> groups;

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
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * @return the phones
	 */
	public List<PhoneEntity> getPhones() {
		return phones;
	}

	/**
	 * @param phones
	 *            the phones to set
	 */
	public void setPhones(final List<PhoneEntity> phones) {
		this.phones = phones;
	}

	/**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(final UserEntity user) {
		this.user = user;
	}

	/**
	 * @return the groups
	 */
	public List<GroupEntity> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupEntity> groups) {
		this.groups = groups;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof PersonEntity)) {
			return false;
		}
		final PersonEntity castOther = (PersonEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(name, castOther.name).append(dni, castOther.dni)
				.append(lastName, castOther.lastName).append(avatar, castOther.avatar).append(birthDate, castOther.birthDate)
				.append(type, castOther.type).append(state, castOther.state).append(phones, castOther.phones).append(user, castOther.user)
				.append(groups, castOther.groups).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(dni).append(lastName).append(avatar).append(birthDate).append(type)
				.append(state).append(phones).append(user).append(groups).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("dni", dni).append("lastName", lastName)
				.append("avatar", avatar).append("birthDate", birthDate).append("type", type).append("state", state)
				.append("phones", phones).append("user", user).append("groups", groups).toString();
	}

}
