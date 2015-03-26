package com.operaprima.services.business.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class UsersIntDto implements Serializable {

	private static final long serialVersionUID = -4129074881856964270L;

	private List<UserIntDto> users;

	/**
	 * @return the users
	 */
	public List<UserIntDto> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(final List<UserIntDto> users) {
		this.users = users;
	}

}
