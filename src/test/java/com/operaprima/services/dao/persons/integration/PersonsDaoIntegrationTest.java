package com.operaprima.services.dao.persons.integration;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.dao.persons.IPersonsDao;
import com.operaprima.services.dao.users.IUsersDao;
import com.operaprima.services.facade.dtos.enums.UserStateEnum;
import com.operaprima.services.facade.dtos.enums.UserTypeEnum;

/**
 * @author Javier Lacalle
 *
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml" })
public class PersonsDaoIntegrationTest {

	@Autowired
	private IPersonsDao personsDao;

	@Autowired
	private IUsersDao userDao;

	// @Test
	public void addPersonTest() {

		// Given

		final String id = "551a8bda878fbdc2def2b1ce";
		final UserIntDto user = userDao.getUser(id);

		final PersonIntDto person = new PersonIntDto();
		person.setBirthDate(new DateTime());
		person.setDni("43538225L");
		person.setLastName("Bayona");
		person.setName("Manolo");
		person.setState(UserStateEnum.ACTIVE);
		person.setType(UserTypeEnum.STUDENT);
		person.setUser(user);

		// When
		final PersonIntDto newPerson = personsDao.addPerson(person);

		// Then
		Assert.assertNotNull(newPerson);
		Assert.assertNotNull(newPerson.getId());
	}

	@Test
	public void getUserTest() {
		// give
		final String id = "551bd25d878fe191d197fece";

		// When
		final PersonIntDto person = personsDao.getPerson(id);

		// Then
		Assert.assertNotNull(person);
		Assert.assertEquals(id, person.getId());

		System.out.println(person);

	}
}
