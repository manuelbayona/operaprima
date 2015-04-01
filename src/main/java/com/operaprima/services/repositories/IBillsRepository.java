package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.BillEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IBillsRepository extends CrudRepository<BillEntity, ObjectId> {

}
