package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Stormtroopers
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
	 * @param attendances
	 *            the attendances to set
	 */
	public void setAttendances(final List<AttendanceIntDto> attendances) {
		this.attendances = attendances;
	}

}
