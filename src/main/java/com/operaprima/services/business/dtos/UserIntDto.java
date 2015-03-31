package com.operaprima.services.business.dtos;

import java.util.List;

import com.operaprima.commons.service.business.dtos.EmailIntDto;

/**
 * @author Adesis
 *
 */
public class UserIntDto {

	private String id;
	private String userName;
	private String publicPassword;
	private List<PersonIntDto> profiles;
	private EmailIntDto email;

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
	public List<PersonIntDto> getProfiles() {
		return profiles;
	}

	/**
	 * @param profiles
	 *            the profiles to set
	 */
	public void setProfiles(final List<PersonIntDto> profiles) {
		this.profiles = profiles;
	}

	/**
	 * @return the email
	 */
	public EmailIntDto getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final EmailIntDto email) {
		this.email = email;
	}

}
