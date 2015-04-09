package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
<<<<<<< HEAD
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
=======
>>>>>>> 428ba5c5657f843ee426c452632d234a1ca765d2
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.operaprima.commons.service.facade.dtos.EmailDto;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "user")
public class UserDto implements Serializable {

	private static final long serialVersionUID = 1122507404235396620L;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 1, max = 30)
	@XmlElement(name = "id")
	private String id;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 3, max = 30)
	@XmlElement(name = "userName")
	private String userName;

	@NotNull
	@NotEmpty
	@NotBlank
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%-_]).{6,20})")
	@XmlElement(name = "publicPassword")
	private String publicPassword;

	@NotNull
	@Valid
	@XmlElement(name = "profiles")
	private List<PersonDto> profiles;

	@NotNull
	@Valid
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
