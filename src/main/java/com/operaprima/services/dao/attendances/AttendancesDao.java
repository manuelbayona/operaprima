package com.operaprima.services.dao.attendances;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.repositories.IAttendancesRepository;
import com.operaprima.services.repositories.entities.AttendanceEntity;

/**
 * @author Dartboard
 *
 */
@Repository
@Primary
public class AttendancesDao implements IAttendancesDao {

	@Autowired
	private IAttendancesRepository attendancesRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public AttendanceIntDto addAttendance(final AttendanceIntDto attendance) {
		AttendanceEntity entity = (AttendanceEntity) dozerUtils.classMapper(attendance, AttendanceEntity.class);
		entity = attendancesRepository.save(entity);
		attendance.setId(entity.getId().toString());
		return attendance;
	}

	@Override
	public AttendanceIntDto getAttendance(final String id) {
		final AttendanceEntity attendanceEntity = attendancesRepository.findOne(new ObjectId(id));
		final AttendanceIntDto attendance = (AttendanceIntDto) dozerUtils.classMapper(attendanceEntity, AttendanceIntDto.class);
		return attendance;
	}

	@Override
	public AttendanceIntDto updateAttendance(final AttendanceIntDto attendance) {
		final AttendanceEntity entity = (AttendanceEntity) dozerUtils.classMapper(attendance, AttendanceEntity.class);
		attendancesRepository.save(entity);
		return attendance;
	}

	@Override
	public AttendancesIntDto listAttendances() {
		// TODO Auto-generated method stub
		return null;
	}

}
