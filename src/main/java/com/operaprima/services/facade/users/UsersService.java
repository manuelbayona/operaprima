package com.operaprima.services.facade.users;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.business.users.IIntUsersService;
import com.operaprima.services.facade.dtos.UserDto;
import com.operaprima.services.facade.dtos.UsersDto;

/**
 * @author Adesis
 *
 */
@Service("userService")
@Path("V01/users")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class UsersService implements IUsersService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntUsersService iIntUsersService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#addUser(com.operaprima.services.facade.dtos.UserDto)
	 */
	@POST
	@Path("/")
	public UserDto addUser(final UserDto user) {
		final UserIntDto map = mapper.map(user, UserIntDto.class);
		final UserIntDto addUser = iIntUsersService.addUser(map);
		return mapper.map(addUser, UserDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#listUsers()
	 */
	@GET
	@Path("/")
	public UsersDto listUsers() {
		final UsersIntDto listUsers = iIntUsersService.listUsers();
		return mapper.map(listUsers, UsersDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#getUser(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public UserDto getUser(@PathParam("id") final String id) {
		final UserIntDto user = iIntUsersService.getUser(id);
		return mapper.map(user, UserDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.users.IUsersService#updateUser(com.operaprima.services.facade.dtos.UserDto)
	 */
	@PUT
	@Path("/")
	public UserDto updateUser(final UserDto user) {
		final UserIntDto map = mapper.map(user, UserIntDto.class);
		final UserIntDto updateUser = iIntUsersService.updateUser(map);
		return mapper.map(updateUser, UserDto.class);
	}

}
