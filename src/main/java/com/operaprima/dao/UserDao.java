package com.operaprima.dao;


import org.springframework.data.repository.CrudRepository;

import com.operaprima.dao.entities.UserEntity;

public interface UserDao extends CrudRepository<UserEntity, String> {

	UserEntity getByUsername(String username);
}
