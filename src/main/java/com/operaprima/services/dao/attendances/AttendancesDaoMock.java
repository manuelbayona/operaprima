package com.operaprima.services.dao.attendances;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;

/**
 * @author Dartboard
 *
 */
@Repository
@Mock
public class AttendancesDaoMock implements IAttendancesDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto) {
		attendanceIntDto.setId(UUID.randomUUID().toString());
		return attendanceIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttendancesIntDto listAttendances() {
		final AttendancesIntDto attendancesIntDto = new AttendancesIntDto();
		attendancesIntDto.setAttendances(new ArrayList<AttendanceIntDto>());
		attendancesIntDto.getAttendances().add(new AttendanceIntDto());
		attendancesIntDto.getAttendances().add(new AttendanceIntDto());
		return attendancesIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttendanceIntDto getAttendance(final String id) {
		return new AttendanceIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AttendanceIntDto updateAttendance(final AttendanceIntDto attendanceIntDto) {
		return attendanceIntDto;
	}

}
