package com.operaprima.services.business.attendances;

import com.operaprima.services.business.dtos.AttendanceIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface IIntAttendancesServices {

	/**
	 *
	 * @param AttendanceIntDto
	 * @return AttendanceIntDto
	 */
	AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto);

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
