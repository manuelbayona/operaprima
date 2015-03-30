package com.operaprima.services.dao.repositories;


import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.UserEntity;

public interface IUsersRepository extends CrudRepository<UserEntity, String> {

	UserEntity getByUsername(String username);
}
