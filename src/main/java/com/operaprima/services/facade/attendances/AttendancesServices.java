package com.operaprima.services.facade.attendances;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.attendances.IIntAttendancesServices;
import com.operaprima.services.business.dtos.AttendanceIntDto;
import com.operaprima.services.facade.dtos.AttendanceDto;

/**
 * @author Stormtroopers
 *
 */
@Service("attendancesServices")
@Path("V01/attendances")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class AttendancesServices implements IAttendancesServices {

	@Autowired
	private IIntAttendancesServices intAttendancesServices;

	@Autowired
	private Mapper mapper;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.attendances.IAttendancesServices#addAttendance(com.operaprima.services.facade.dtos.AttendanceDto)
	 */
	@Override
	@POST
	@Path("/")
	public AttendanceDto addAttendance(final AttendanceDto attendanceDto) {
		final AttendanceIntDto map = mapper.map(attendanceDto, AttendanceIntDto.class);
		final AttendanceIntDto addAttendance = intAttendancesServices.addAttendance(map);
		return mapper.map(addAttendance, AttendanceDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.attendances.IAttendancesServices#getAttendance(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public AttendanceDto getAttendance(@PathParam("id") final String id) {
		final AttendanceIntDto attendance = intAttendancesServices.getAttendance(id);
		return mapper.map(attendance, AttendanceDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.operaprima.services.facade.attendances.IAttendancesServices#updateAttendance(com.operaprima.services.facade.dtos.AttendanceDto)
	 */
	@Override
	@PUT
	@Path("/")
	public AttendanceDto updateAttendance(final AttendanceDto attendanceDto) {
		final AttendanceIntDto map = mapper.map(attendanceDto, AttendanceIntDto.class);
		final AttendanceIntDto updateAttendance = intAttendancesServices.updateAttendance(map);
		return mapper.map(updateAttendance, AttendanceDto.class);
	}
}
