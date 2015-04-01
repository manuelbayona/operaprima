package com.operaprima.services.dao.attendances;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.AttendanceIntDto;

/**
 * @author Stormtroopers
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
