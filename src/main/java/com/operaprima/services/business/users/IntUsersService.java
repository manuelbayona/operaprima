package com.operaprima.services.business.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.dao.users.IUsersDao;

/**
 * @author Adesis
 *
 */
@Service
public class IntUsersService implements IIntUsersService {

	@Autowired
	private IUsersDao userDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.IIntUsersService#addUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	public UserIntDto addUser(final UserIntDto user) {
		return userDao.addUser(user);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.IIntUsersService#listUsers()
	 */
	public UsersIntDto listUsers() {
		return userDao.listUsers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.IIntUsersService#getUser(java.lang.String)
	 */
	public UserIntDto getUser(final String id) {
		return userDao.getUser(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.IIntUsersService#updateUser(com.operaprima.services.business.dtos.UserIntDto)
	 */
	public UserIntDto updateUser(final UserIntDto user) {
		return userDao.updateUser(user);
	}

}
