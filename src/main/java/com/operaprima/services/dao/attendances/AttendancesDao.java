package com.operaprima.services.dao.attendances;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class AttendancesDao implements IAttendancesDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#addAttendance(com.operaprima.services.business.dtos.AttendanceIntDto)
	 */
	@Override
	public AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#listAttendances()
	 */
	@Override
	public AttendancesIntDto listAttendances() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#getAttendance(java.lang.String)
	 */
	@Override
	public AttendanceIntDto getAttendance(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.attendances.IAttendancesDao#updateAttendance(com.operaprima.services.business.dtos.AttendanceIntDto)
	 */
	@Override
	public AttendanceIntDto updateAttendance(final AttendanceIntDto attendanceIntDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
