package com.operaprima.services.dao.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.services.dao.repositories.entities.PersonEntity;
import com.operaprima.services.dao.repositories.entities.PhoneEntity;
import com.operaprima.services.dao.repositories.entities.UserEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml" })
public class UserRepositoryTest {

	@Autowired
	IUsersRepository userRepository;

	@Autowired
	IPersonRepository personRepository;

	@Test
	public void prueba() {
		final UserEntity entity = new UserEntity("diegonjino", "124587", "diuegonjin@gmailñ.com");
		final List<PersonEntity> profiles = new ArrayList<>();
		PersonEntity personEntity = new PersonEntity();
		personEntity.setName("Diegop");
		personEntity.setLastName("Asensio");
		personEntity = personRepository.save(personEntity);
		final PhoneEntity phone = new PhoneEntity();
		phone.setNumber("965788855");
		final List<PhoneEntity> phones = new ArrayList<>();
		phones.add(phone);
		personEntity.setPhones(phones);
		profiles.add(personEntity);
		entity.setProfiles(profiles);
		userRepository.save(entity);
	}
}
