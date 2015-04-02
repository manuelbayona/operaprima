package com.operaprima.services.dao.attendances;

import com.operaprima.services.business.dtos.AttendanceIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface IAttendancesDao {
	/**
	 * @param attendance
	 * @return
	 */
	AttendanceIntDto addAttendance(AttendanceIntDto attendance);

	/**
	 * @param id
	 * @return
	 */
	AttendanceIntDto getAttendance(String id);

	/**
	 * @param attendance
	 * @return
	 */
	AttendanceIntDto updateAttendance(AttendanceIntDto attendance);

}
