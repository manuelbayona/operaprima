package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.SubjectEntity;

public interface ISubjectsRepository extends CrudRepository<SubjectEntity, ObjectId> {

}
