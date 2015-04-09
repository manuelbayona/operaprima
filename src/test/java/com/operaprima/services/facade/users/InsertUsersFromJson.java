package com.operaprima.services.facade.users;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.services.facade.dtos.UserDto;

/**
 * @author Stormtrooper
 *
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml", "classpath*:/META-INF/aspectj-context-test.xml" })
public class InsertUsersFromJson {

	@Autowired
	ObjectMapper objmapper;

	@Autowired
	IUsersService usersServices;

	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException {

		final UserDto[] users = objmapper.readValue(getClass().getResource("/json/users.json"), UserDto[].class);

		for (final UserDto user : users) {
			usersServices.addUser(user);
		}
	}
}
