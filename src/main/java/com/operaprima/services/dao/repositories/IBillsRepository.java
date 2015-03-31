package com.operaprima.services.dao.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.BillEntity;

public interface IBillsRepository extends CrudRepository<BillEntity, ObjectId> {

}
