package com.operaprima.services.users;

import com.operaprima.services.dtos.UserDto;
import com.operaprima.services.dtos.UsersDto;

/**
 * @author Adesis
 *
 */
public interface UsersService {

	/**
	 * Servicio de negocio encargado de dar de alta un nuevo usuario
	 *
	 * @param UserDto
	 * @return String
	 */
	String addUserString(final UserDto user);

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
	 * @return String
	 */
	String updateUser(UserDto user);

}
