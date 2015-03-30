package com.operaprima.services.dao.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.UserEntity;

public interface IUsersRepository extends CrudRepository<UserEntity, ObjectId> {

	UserEntity getByUsername(String username);
}
