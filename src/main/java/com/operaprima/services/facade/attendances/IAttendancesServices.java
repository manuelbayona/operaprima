package com.operaprima.services.facade.attendances;

import com.operaprima.services.facade.dtos.AttendanceDto;

/**
 * @author Stormtroopers
 *
 */
public interface IAttendancesServices {

	/**
	 * Servicio de negocio encargado de dar de alta una nueva asistencia
	 *
	 * @param AttendanceDto
	 * @return AttendanceDto
	 */
	AttendanceDto addAttendance(final AttendanceDto attendanceDto);

	/**
	 * Servicio de negocio que consulta una asistencia
	 *
	 * @param String
	 * @return AttendanceDto
	 */
	AttendanceDto getAttendance(final String id);

	/**
	 * Servicio de negocio que actualiza una asistencia
	 *
	 * @param AttendanceDto
	 * @return AttendanceDto
	 */
	AttendanceDto updateAttendance(final AttendanceDto attendanceDto);

}
