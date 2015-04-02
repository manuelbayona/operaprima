package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.operaprima.commons.service.facade.dtos.EmailDto;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDto implements Serializable {

	private static final long serialVersionUID = 1122507404235396620L;

	@NotNull
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "userName")
	private String userName;

	@XmlElement(name = "publicPassword")
	private String publicPassword;

	@XmlElement(name = "profiles")
	private List<PersonDto> profiles;

	@XmlElement(name = "email")
	private EmailDto email;

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
	public List<PersonDto> getProfiles() {
		return profiles;
	}

	/**
	 * @param profiles
	 *            the profiles to set
	 */
	public void setProfiles(final List<PersonDto> profiles) {
		this.profiles = profiles;
	}

	/**
	 * @return the email
	 */
	public EmailDto getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final EmailDto email) {
		this.email = email;
	}

}
