package com.operaprima.services.dao.repositories.entities;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.operaprima.commons.dao.config.SpringMongoConfig;
import com.operaprima.services.repositories.IUsersRepository;
import com.operaprima.services.repositories.entities.UserEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/sping-context-test.xml" })
public class UserEntityTest {

	@Autowired
	SpringMongoConfig springMongoConfig;

	@Autowired
	IUsersRepository UserDao;

	@Test
	public void Test() {

		final MongoOperations mongoOperation = springMongoConfig.createMongoOperation();

		final UserEntity user = new UserEntity();
		user.setUsername("javiL");
		user.setPublicPassword("password123");

		// save
		mongoOperation.save(user);

		// now user object got the created id.
		System.out.println("1. user : " + user);

		// query to search user
		final Query searchUserQuery = new Query(Criteria.where("username").is("javiL"));

		// find the saved user again.
		final UserEntity savedUser = mongoOperation.findOne(searchUserQuery, UserEntity.class);
		System.out.println("2. find - savedUser : " + savedUser);

		// update password
		mongoOperation.updateFirst(searchUserQuery, Update.update("publicPassword", "new password"), UserEntity.class);

		// find the updated user object
		final UserEntity updatedUser = mongoOperation.findOne(searchUserQuery, UserEntity.class);

		System.out.println("3. updatedUser : " + updatedUser);

		// delete
		mongoOperation.remove(searchUserQuery, UserEntity.class);

		// List, it should be empty now.
		final List<UserEntity> listUser = mongoOperation.findAll(UserEntity.class);
		System.out.println("4. Number of user = " + listUser.size());

	}

	@Test
	public void Test2() {

		final List<UserEntity> listUser = (List<UserEntity>) UserDao.findAll();

		Assert.assertNotNull(listUser);

		System.out.println("4. Number of user = " + listUser.size());

	}

	@Test
	public void Test3() {

		final UserEntity user = UserDao.getByUsername("JaviConsole");

		Assert.assertNotNull(user);

		System.out.println("User = " + user.toString());

	}

}
