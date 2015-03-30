package com.operaprima.services.dao.repositories;


import org.springframework.data.repository.CrudRepository;

import com.operaprima.dao.entities.UserEntity;

public interface UsersRepository extends CrudRepository<UserEntity, String> {

	UserEntity getByUsername(String username);
}
