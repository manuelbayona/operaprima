/**
 * 
 */
package com.operaprima;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.operaprima.config.SpringMongoConfig;
import com.operaprima.dao.entities.UserEntity;

/**
 * @author ExpertoJava
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// For Annotation
		ApplicationContext ctx = 
	             new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	 
		UserEntity user = new UserEntity("javiL", "password123");
	 
		// save
		mongoOperation.save(user);
	 
		// now user object got the created id.
		System.out.println("1. user : " + user);
	 
		// query to search user
		Query searchUserQuery = new Query(Criteria.where("username").is("javiL"));
	 
		// find the saved user again.
		UserEntity savedUser = mongoOperation.findOne(searchUserQuery, UserEntity.class);
		System.out.println("2. find - savedUser : " + savedUser);
	 
		// update password
		mongoOperation.updateFirst(searchUserQuery, 
	                         Update.update("publicPassword", "new password"),UserEntity.class);
	 
		// find the updated user object
		UserEntity updatedUser = mongoOperation.findOne(searchUserQuery, UserEntity.class);
	 
		System.out.println("3. updatedUser : " + updatedUser);
	 
		// delete
		//mongoOperation.remove(searchUserQuery, UserEntity.class);
	 
		// List, it should be empty now.
		List<UserEntity> listUser = mongoOperation.findAll(UserEntity.class);
		System.out.println("4. Number of user = " + listUser.size());

	}

}
