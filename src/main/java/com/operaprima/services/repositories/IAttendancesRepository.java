package com.operaprima.services.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.operaprima.services.repositories.entities.AttendanceEntity;
import com.operaprima.services.repositories.entities.PersonEntity;

/**
 * @author Stormtroopers
 * 
 */
public interface IAttendancesRepository extends CrudRepository<AttendanceEntity, ObjectId> {

	Iterable<AttendanceEntity> findByStudent(PersonEntity student);
}
