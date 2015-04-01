package com.operaprima.services.dao.attendances;

import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;

/**
 * @author Adesis
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

	/**
	 * @return
	 */
	AttendancesIntDto listAttendances();

}
