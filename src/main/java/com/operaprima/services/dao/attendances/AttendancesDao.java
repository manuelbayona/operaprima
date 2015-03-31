package com.operaprima.services.dao.attendances;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.dao.repositories.IAttendancesRepository;

/**
 * @author diego.asensio
 * 
 */
public class AttendancesDao implements IAttendancesDao {

	@Autowired
	private IAttendancesRepository attendancesRepository;

	@Autowired
	private Mapper mapper;
}
