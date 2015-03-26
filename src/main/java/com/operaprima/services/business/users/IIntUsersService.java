package com.operaprima.services.business.users;

import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntUsersService {

	/**
	 * Servicio de negocio encargado de dar de alta un nuevo usuario
	 *
	 * @param UserIntDto
	 * @return String
	 */
	String addUser(final UserIntDto user);

	/**
	 * Servicio de negocio que consulta todos los usuarios
	 *
	 * @return UsersDto
	 */
	UsersIntDto listUsers();

	/**
	 * Servicio de negocio que consulta un usuario Int
	 * 
	 * @param String
	 * @return UserDto
	 */
	UserIntDto getUser(String id);

	/**
	 * Servicio de negocio que actualiza un usuario
	 *
	 * @return String
	 */
	String updateUser(UserIntDto user);

}
