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
	 * @param user
	 * @return UserDto
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
	 * @param id
	 * @return UserDto
	 */
	UserDto getUser(final String id);

	/**
	 * Servicio de negocio que actualiza un usuario
	 *
	 * @return UserDto
	 */
	UserDto updateUser(final UserDto user);

	/**
	 * Servicio de negocio que devuelve las personas a las que pertenece un usuario
	 *
	 * @param id
	 * @return PersonsDto
	 */
	PersonsDto listPersonsByUser(final String id);

}
