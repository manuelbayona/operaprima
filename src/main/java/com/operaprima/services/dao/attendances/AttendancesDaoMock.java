package com.operaprima.services.dao.attendances;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class AttendancesDaoMock implements IAttendancesDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#addAttendance(com.operaprima.services.business.dtos.AttendanceIntDto)
	 */
	@Override
	public AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto) {
		attendanceIntDto.setId(UUID.randomUUID().toString());
		return attendanceIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#listAttendances()
	 */
	@Override
	public AttendancesIntDto listAttendances() {
		final AttendancesIntDto attendancesIntDto = new AttendancesIntDto();
		attendancesIntDto.setAttendances(new ArrayList<AttendanceIntDto>());
		attendancesIntDto.getAttendances().add(new AttendanceIntDto());
		attendancesIntDto.getAttendances().add(new AttendanceIntDto());
		return attendancesIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#getAttendance(java.lang.String)
	 */
	@Override
	public AttendanceIntDto getAttendance(final String id) {
		return new AttendanceIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#updateAttendance(com.operaprima.services.business.dtos.AttendanceIntDto)
	 */
	@Override
	public AttendanceIntDto updateAttendance(final AttendanceIntDto attendanceIntDto) {
		return attendanceIntDto;
	}

}
