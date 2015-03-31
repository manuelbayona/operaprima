package com.operaprima.services.dao.repositories.entities;

import java.io.Serializable;
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
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -1391107291222308916L;
	@Id
	private ObjectId id;
	private String username;
	private String publicPassword;
	private String email;

	@DBRef
	private List<PersonEntity> profiles;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
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
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof UserEntity)) {
			return false;
		}
		final UserEntity castOther = (UserEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(username, castOther.username)
				.append(publicPassword, castOther.publicPassword).append(profiles, castOther.profiles).append(email, castOther.email)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(username).append(publicPassword).append(profiles).append(email).toHashCode();
	}

}
