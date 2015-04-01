package com.operaprima.services.dao.users.integration;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.commons.service.business.dtos.EmailIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.dao.persons.IPersonsDao;
import com.operaprima.services.dao.users.IUsersDao;

/**
 * @author Stormtroopers
 *
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml", "classpath*:/META-INF/aspectj-context-test.xml" })
public class UserDaoIntegrationTest {

	@Autowired
	private IUsersDao userDao;

	@Autowired
	private IPersonsDao personDao;

	// @Test
	public void addUserTest() {

		// Given
		final PersonIntDto javi = personDao.getPerson("551bd25d878fe191d197fece");
		final PersonIntDto diego = personDao.getPerson("551bd857878fa877f462d9c1");
		final PersonIntDto manolo = personDao.getPerson("551bd86e878f624a9514d6dd");

		final List<PersonIntDto> profiles = new ArrayList<>();
		profiles.add(diego);
		profiles.add(javi);
		profiles.add(manolo);

		final EmailIntDto email = new EmailIntDto();
		email.setAddress("integracion@test.com");

		final UserIntDto user = new UserIntDto();
		user.setEmail(email);
		user.setPublicPassword("publicPassword");
		user.setUserName("Admin");
		user.setProfiles(profiles);

		// When
		final UserIntDto nuevoUsuario = userDao.addUser(user);

		// Then
		Assert.assertNotNull(nuevoUsuario);
		Assert.assertNotNull(nuevoUsuario.getId());
		System.out.println(nuevoUsuario.getId());
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
		// final String id = "551a8bda878fbdc2def2b1ce";
		final String id = "551be033878ff21a30ce7c1e";

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
		user.setUserName("javito");
		final UserIntDto userUpdate = userDao.updateUser(user);

		// Then
		Assert.assertNotNull(userUpdate);
		Assert.assertEquals(user.getId(), userUpdate.getId());
		Assert.assertEquals(user.getPublicPassword(), userUpdate.getPublicPassword());

	}
}
