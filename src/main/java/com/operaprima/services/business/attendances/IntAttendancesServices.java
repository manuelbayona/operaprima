package com.operaprima.services.business.attendances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.business.dtos.AttendancesIntDto;
import com.operaprima.services.dao.attendances.IAttendancesDao;

/**
 * @author Stormtroopers
 *
 */
@Service
@Mockeable
public class IntAttendancesServices implements IIntAttendancesServices {

	@Autowired
	private IAttendancesDao iAttendancesDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.operaprima.services.business.attendances.IIntAttendancesServices#addAttendance(com.operaprima.services.business.dtos.AttendanceIntDto
	 * )
	 */
	@Override
	public AttendanceIntDto addAttendance(final AttendanceIntDto attendanceIntDto) {
		return iAttendancesDao.addAttendance(attendanceIntDto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.attendances.IIntAttendancesServices#listAttendances()
	 */
	@Override
	public AttendancesIntDto listAttendances() {
		return iAttendancesDao.listAttendances();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.attendances.IIntAttendancesServices#getAttendance(java.lang.String)
	 */
	@Override
	public AttendanceIntDto getAttendance(final String id) {
		return iAttendancesDao.getAttendance(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.attendances.IIntAttendancesServices#updateAttendance(com.operaprima.services.business.dtos.
	 * AttendanceIntDto)
	 */
	@Override
	public AttendanceIntDto updateAttendance(final AttendanceIntDto attendanceIntDto) {
		return iAttendancesDao.updateAttendance(attendanceIntDto);
	}
}
