package com.operaprima.services.dao.users;

import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Adesis
 *
 */
public interface IUsersDao {

	/**
	 * @param UserIntDto
	 * @return String
	 */
	UserIntDto addUser(final UserIntDto user);

	/**
	 * @return UsersDto
	 */
	UsersIntDto listUsers();

	/**
	 * @param String
	 * @return UserDto
	 */
	UserIntDto getUser(String id);

	/**
	 * @return String
	 */
	UserIntDto updateUser(UserIntDto user);

}
