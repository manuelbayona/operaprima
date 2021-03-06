package com.operaprima.services.dao.users;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.repositories.IUsersRepository;
import com.operaprima.services.repositories.entities.UserEntity;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Primary
public class UsersDao implements IUsersDao {

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
		UserEntity entity = (UserEntity) dozerUtils.classMapper(user, UserEntity.class);
		entity = userRepository.save(entity);

		if (entity.getId() == null) {
			return null;
		}
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
		usersIntDto.setUsers((List<UserIntDto>) dozerUtils.listMapper(listDB, UserIntDto.class));
		return usersIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto getUser(final String id) {
		final UserEntity userEntity = userRepository.findOne(new ObjectId(id));
		return (UserIntDto) dozerUtils.classMapper(userEntity, UserIntDto.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserIntDto updateUser(final UserIntDto user) {
		UserEntity entity = (UserEntity) dozerUtils.classMapper(user, UserEntity.class);
		entity = userRepository.save(entity);

		return (UserIntDto) dozerUtils.classMapper(entity, UserIntDto.class);
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public PersonsIntDto listPersonsByUser(final String id) {
		final UserEntity userEntity = userRepository.findOne(new ObjectId(id));
		if (userEntity != null && userEntity.getProfiles() != null) {
			final List<PersonIntDto> persons = (List<PersonIntDto>) dozerUtils.listMapper(userEntity.getProfiles(), PersonIntDto.class);
			final PersonsIntDto personsIntDto = new PersonsIntDto();
			personsIntDto.setPersons(persons);
			return personsIntDto;
		}
		return null;
	}
}
