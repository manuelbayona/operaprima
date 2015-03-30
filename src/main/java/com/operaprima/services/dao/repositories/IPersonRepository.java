package com.operaprima.services.dao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.PersonEntity;

public interface IPersonRepository extends CrudRepository<PersonEntity, String> {

}
