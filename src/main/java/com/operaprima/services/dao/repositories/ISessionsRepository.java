package com.operaprima.services.dao.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.SessionEntity;

public interface ISessionsRepository extends CrudRepository<SessionEntity, ObjectId> {

}
