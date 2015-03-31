package com.operaprima.services.dao.attendances;

import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;

/**
 * @author Adesis
 *
 */
public interface IAttendancesDao {

	/**
	 *
	 * @param AttendanceIntDto
	 * @return AttendanceIntDto
	 */
	AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto);

	/**
	 *
	 * @return AttendancesIntDto
	 */
	AttendancesIntDto listAttendances();

	/**
	 *
	 * @param String
	 * @return AttendanceIntDto
	 */
	AttendanceIntDto getAttendance(final String id);

	/**
	 *
	 * @param AttendanceIntDto
	 * @return AttendanceIntDto
	 */
	AttendanceIntDto updateAttendance(final AttendanceIntDto attendanceIntDto);

}
