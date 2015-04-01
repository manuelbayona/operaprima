package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.UserEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IUsersRepository extends CrudRepository<UserEntity, ObjectId> {

	UserEntity getByUsername(String username);
}
