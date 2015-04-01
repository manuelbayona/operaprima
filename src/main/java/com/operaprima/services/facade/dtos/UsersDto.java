package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersDto implements Serializable {

	private static final long serialVersionUID = -4129074881856964270L;

	@XmlElement(name = "users")
	private List<UserDto> users;

	/**
	 * @return the users
	 */
	public List<UserDto> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(final List<UserDto> users) {
		this.users = users;
	}

}
