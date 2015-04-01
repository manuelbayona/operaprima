package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.AttendanceEntity;

/**
 * @author Stormtroopers
 *
 */
public interface IAttendancesRepository extends CrudRepository<AttendanceEntity, ObjectId> {

}
