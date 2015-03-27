package com.operaprima.services.dao.users;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Adesis
 *
 */
@Repository
public class UsersDao implements IUsersDao {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#addUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	public UserIntDto addUser(final UserIntDto user) {
		user.setId(UUID.randomUUID().toString());
		return user;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#listUsers()
	 */
	public UsersIntDto listUsers() {
		final UsersIntDto usersIntDto = new UsersIntDto();
		usersIntDto.setUsers(new ArrayList<UserIntDto>());
		usersIntDto.getUsers().add(new UserIntDto());
		usersIntDto.getUsers().add(new UserIntDto());
		return usersIntDto;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#getUser(java.lang.String)
	 */
	public UserIntDto getUser(final String id) {
		final UserIntDto userIntDto = new UserIntDto();
		userIntDto.setId(id);
		return userIntDto;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#updateUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	public UserIntDto updateUser(final UserIntDto user) {
		return user;
	}

}
