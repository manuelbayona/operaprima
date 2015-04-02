package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.operaprima.services.repositories.entities.PersonEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IPersonsRepository extends PagingAndSortingRepository<PersonEntity, ObjectId> {

}
