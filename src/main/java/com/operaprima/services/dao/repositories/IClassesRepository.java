package com.operaprima.services.dao.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.ClassEntity;

public interface IClassesRepository extends CrudRepository<ClassEntity, ObjectId> {

}
