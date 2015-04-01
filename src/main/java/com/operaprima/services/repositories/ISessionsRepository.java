package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.SessionEntity;

/**
 * @author Stormtroopers
 *
 */
public interface ISessionsRepository extends CrudRepository<SessionEntity, ObjectId> {

}
