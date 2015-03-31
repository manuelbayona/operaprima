package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class AttendancesIntDto {

	private List<AttendanceIntDto> attendances;

	/**
	 * @return the attendances
	 */
	public List<AttendanceIntDto> getAttendances() {
		return attendances;
	}

	/**
	 * @param attendances the attendances to set
	 */
	public void setAttendances(List<AttendanceIntDto> attendances) {
		this.attendances = attendances;
	}

}
