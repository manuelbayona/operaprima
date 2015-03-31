package com.operaprima.services.dao.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.dao.repositories.entities.AttendanceEntity;

public interface IAttendancesRepository extends CrudRepository<AttendanceEntity, ObjectId> {

}
