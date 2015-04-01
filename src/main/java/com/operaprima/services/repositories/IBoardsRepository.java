package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.BoardEntity;

public interface IBoardsRepository extends CrudRepository<BoardEntity, ObjectId> {

}
