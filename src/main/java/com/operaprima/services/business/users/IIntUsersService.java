package com.operaprima.services.business.users;

import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface IIntUsersService {

	/**
	 * @param UserIntDto
	 * @return UserIntDto
	 */
	UserIntDto addUser(final UserIntDto user);

	/**
	 * @return UsersDto
	 */
	UsersIntDto listUsers();

	/**
	 * @param id
	 * @return UserIntDto
	 */
	UserIntDto getUser(String id);

	/**
	 * @return UserIntDto
	 */
	UserIntDto updateUser(UserIntDto user);

	/**
	 * @param id
	 * @return PersonsIntDto
	 */
	PersonsIntDto listPersonsByUser(String id);

}
