package com.operaprima.services.dao.users;

import java.util.ArrayList;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.dao.repositories.IUsersRepository;
import com.operaprima.services.dao.repositories.entities.UserEntity;

/**
 * @author Adesis
 *
 */
@Repository
public class UsersDao implements IUsersDao {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IUsersRepository userRepository;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#addUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	@Override
	public UserIntDto addUser(final UserIntDto user) {
		// Mapeo userDto a entity
		UserEntity entity = mapper.map(user, UserEntity.class);

		// Salvar en BD
		entity = userRepository.save(entity);

		// seteamos el id en la respuesta
		user.setId(entity.getId().toString());
		return user;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#listUsers()
	 */
	@Override
	public UsersIntDto listUsers() {
		final UsersIntDto usersIntDto = new UsersIntDto();
		usersIntDto.setUsers(new ArrayList<UserIntDto>());
		usersIntDto.getUsers().add(new UserIntDto());
		usersIntDto.getUsers().add(new UserIntDto());
		return usersIntDto;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#getUser(java.lang.String)
	 */
	@Override
	public UserIntDto getUser(final String id) {
		final UserIntDto userIntDto = new UserIntDto();
		userIntDto.setId(id);
		return userIntDto;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.dao.IUsersDao#updateUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	@Override
	public UserIntDto updateUser(final UserIntDto user) {
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.users.IUsersDao#listPersonsByUser(java.lang.String)
	 */
	@Override
	public PersonsIntDto listPersonsByUser(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
