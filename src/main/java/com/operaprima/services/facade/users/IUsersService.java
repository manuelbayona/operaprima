package com.operaprima.services.facade.users;

import com.operaprima.services.facade.dtos.PersonsDto;
import com.operaprima.services.facade.dtos.UserDto;
import com.operaprima.services.facade.dtos.UsersDto;

/**
 * @author Adesis
 *
 */
public interface IUsersService {

	/**
	 * Servicio de negocio encargado de dar de alta un nuevo usuario
	 *
	 * @param UserIntDto
	 * @return String
	 */
	UserDto addUser(final UserDto user);

	/**
	 * Servicio de negocio que consulta todos los usuarios
	 *
	 * @return UsersDto
	 */
	UsersDto listUsers();

	/**
	 * Servicio de negocio que consulta un usuario
	 *
	 * @param String
	 * @return UserDto
	 */
	UserDto getUser(String id);

	/**
	 * Servicio de negocio que actualiza un usuario
	 *
	 * @return UserDto
	 */
	UserDto updateUser(UserDto user);

	/**
	 * Servicio de negocio que devuelve las personas a las que pertenece un usuario
	 *
	 * @param String
	 * @return PersonsDto
	 */
	PersonsDto listPersonsByUser(final String id);

}
