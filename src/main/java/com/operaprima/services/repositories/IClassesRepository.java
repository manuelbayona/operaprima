package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.ClassEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IClassesRepository extends CrudRepository<ClassEntity, ObjectId> {

}
