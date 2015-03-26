package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class UsersDto implements Serializable {

	private static final long serialVersionUID = -4129074881856964270L;

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
