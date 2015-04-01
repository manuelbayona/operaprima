package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.GroupEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IGroupsRepository extends CrudRepository<GroupEntity, ObjectId> {

}
