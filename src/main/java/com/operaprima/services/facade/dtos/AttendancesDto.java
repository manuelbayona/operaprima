package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class AttendancesDto implements Serializable {

	private static final long serialVersionUID = 4981600495388966349L;

	private List<AttendanceDto> attendances;

	/**
	 * @return the attendances
	 */
	public List<AttendanceDto> getAttendances() {
		return attendances;
	}

	/**
	 * @param attendances
	 *            the attendances to set
	 */
	public void setAttendances(final List<AttendanceDto> attendances) {
		this.attendances = attendances;
	}

}
