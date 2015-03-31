package com.operaprima.services.dao.attendances;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.dao.repositories.IAttendancesRepository;
import com.operaprima.services.dao.repositories.entities.AttendanceEntity;

/**
 * @author Adesis
 *
 */
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
}
