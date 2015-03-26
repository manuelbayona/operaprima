package com.operaprima.services.facade.users;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Service;

import com.operaprima.services.facade.dtos.UserDto;
import com.operaprima.services.facade.dtos.UsersDto;

/**
 * @author Adesis
 *
 */
@Service("userService")
@Path("V01/users")
public class UsersService implements IUsersService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#addUser(com.operaprima.services.facade.dtos.UserDto)
	 */
	@POST
	@Path("/")
	public UserDto addUser(final UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#listUsers()
	 */
	@GET
	@Path("/")
	public UsersDto listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#getUser(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public UserDto getUser(@PathParam("id") final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#updateUser(com.operaprima.services.facade.dtos.UserDto)
	 */
	@PUT
	@Path("/")
	public UserDto updateUser(final UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

}
