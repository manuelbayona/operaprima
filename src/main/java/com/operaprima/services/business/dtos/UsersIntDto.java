package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Stormtroopers
 *
 */
public class UsersIntDto {

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
