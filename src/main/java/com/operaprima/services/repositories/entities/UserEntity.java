package com.operaprima.services.repositories.entities;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adesis
 *
 */
@Document(collection = "users")
public class UserEntity {

	@Id
	private ObjectId id;
	private String userName;
	private String publicPassword;
	private EmailEntity email;

	@DBRef
	private List<PersonEntity> profiles;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(final String userName) {
		this.userName = userName;
	}

	/**
	 * @return the publicPassword
	 */
	public String getPublicPassword() {
		return publicPassword;
	}

	/**
	 * @param publicPassword
	 *            the publicPassword to set
	 */
	public void setPublicPassword(final String publicPassword) {
		this.publicPassword = publicPassword;
	}

	/**
	 * @return the profiles
	 */
	public List<PersonEntity> getProfiles() {
		return profiles;
	}

	/**
	 * @param profiles
	 *            the profiles to set
	 */
	public void setProfiles(final List<PersonEntity> profiles) {
		this.profiles = profiles;
	}

	/**
	 * @return the email
	 */
	public EmailEntity getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final EmailEntity email) {
		this.email = email;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof UserEntity)) {
			return false;
		}
		final UserEntity castOther = (UserEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(userName, castOther.userName)
				.append(publicPassword, castOther.publicPassword).append(profiles, castOther.profiles).append(email, castOther.email)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(userName).append(publicPassword).append(profiles).append(email).toHashCode();
	}

}
