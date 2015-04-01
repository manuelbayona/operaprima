package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.operaprima.services.repositories.entities.PersonEntity;

public interface IPersonsRepository extends PagingAndSortingRepository<PersonEntity, ObjectId> {

}
