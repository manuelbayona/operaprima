package com.operaprima.services.dao.users;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Mock
public class UsersDaoMock implements IUsersDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto addUser(final UserIntDto user) {
		user.setId(UUID.randomUUID().toString());
		return user;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersIntDto listUsers() {
		final UsersIntDto usersIntDto = new UsersIntDto();
		usersIntDto.setUsers(new ArrayList<UserIntDto>());
		usersIntDto.getUsers().add(new UserIntDto());
		usersIntDto.getUsers().add(new UserIntDto());
		return usersIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto getUser(final String id) {
		return new UserIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto updateUser(final UserIntDto user) {
		return user;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonsIntDto listPersonsByUser(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
