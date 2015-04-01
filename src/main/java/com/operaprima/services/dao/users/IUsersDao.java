package com.operaprima.services.dao.users;

import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Stormtroopers
 *
 */
@Repository
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

	/**
	 * @param String
	 * @return PersonsIntDto
	 */
	PersonsIntDto listPersonsByUser(String id);

}
