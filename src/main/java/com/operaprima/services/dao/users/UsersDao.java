package com.operaprima.services.dao.users;

import java.util.List;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
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

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 *
	 * {@inheritDoc}
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

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public UsersIntDto listUsers() {

		final List<UserEntity> listDB = (List<UserEntity>) userRepository.findAll();

		if (listDB == null) {
			return null;
		}

		final UsersIntDto usersIntDto = new UsersIntDto();
		usersIntDto.setUsers((List<UserIntDto>) dozerUtils.parseList(listDB, UserIntDto.class));
		return usersIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto getUser(final String id) {
		final UserEntity userEntity = userRepository.findOne(new ObjectId(id));
		return mapper.map(userEntity, UserIntDto.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto updateUser(final UserIntDto user) {
		UserEntity entity = mapper.map(user, UserEntity.class);
		entity = userRepository.save(entity);

		return mapper.map(entity, UserIntDto.class);
	}

}
