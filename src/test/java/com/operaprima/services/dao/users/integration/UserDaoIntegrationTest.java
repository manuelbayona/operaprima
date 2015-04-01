package com.operaprima.services.dao.users.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.commons.service.business.dtos.EmailIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.dao.users.IUsersDao;

/**
 * @author Stormtroopers
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml" })
public class UserDaoIntegrationTest {

	@Autowired
	private IUsersDao userDao;

	@Test
	public void addUserTest() {

		// Given
		final EmailIntDto email = new EmailIntDto();
		email.setAddress("integracion@test.com");

		final UserIntDto user = new UserIntDto();
		user.setEmail(email);
		user.setPublicPassword("publicPassword");

		user.setUserName("Javi");

		// When
		final UserIntDto nuevoUsuario = userDao.addUser(user);

		// Then
		Assert.assertNotNull(nuevoUsuario);
		Assert.assertNotNull(nuevoUsuario.getId());
	}

	@Test
	public void listUsersTest() {
		// Given

		// When
		final UsersIntDto usersIntDto = userDao.listUsers();

		// Then
		Assert.assertNotNull(usersIntDto);
		Assert.assertNotNull(usersIntDto.getUsers());
	}

	@Test
	public void getUserTest() {
		// give
		final String id = "551a8bda878fbdc2def2b1ce";

		// When
		final UserIntDto user = userDao.getUser(id);

		// Then
		Assert.assertNotNull(user);
		Assert.assertEquals(id, user.getId());

	}

	@Test
	public void updateUserTest() {
		// Given
		final String id = "551a8bda878fbdc2def2b1ce";
		final UserIntDto user = userDao.getUser(id);

		// When
		user.setPublicPassword("UpdatePassword");
		final UserIntDto userUpdate = userDao.updateUser(user);

		// Then
		Assert.assertNotNull(userUpdate);
		Assert.assertEquals(user.getId(), userUpdate.getId());
		Assert.assertEquals(user.getPublicPassword(), userUpdate.getPublicPassword());

	}
}
