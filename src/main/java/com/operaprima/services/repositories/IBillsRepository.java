package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.BillEntity;
import com.operaprima.services.repositories.entities.PersonEntity;

/**
 * @author Stormtroopers
 * 
 */
public interface IBillsRepository extends CrudRepository<BillEntity, ObjectId> {

	Iterable<BillEntity> findByOwner(PersonEntity owner);
}
