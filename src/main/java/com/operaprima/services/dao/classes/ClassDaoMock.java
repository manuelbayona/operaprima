package com.operaprima.services.dao.classes;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class ClassDaoMock implements IClassDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#addClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto addClass(final ClassIntDto classdto) {
		classdto.setId(UUID.randomUUID().toString());
		return classdto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#listClasses()
	 */
	@Override
	public ClassesIntDto listClasses() {
		final ClassesIntDto classesIntDto = new ClassesIntDto();
		classesIntDto.setClasses(new ArrayList<ClassIntDto>());
		classesIntDto.getClasses().add(new ClassIntDto());
		classesIntDto.getClasses().add(new ClassIntDto());
		return classesIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#getClass(java.lang.String)
	 */
	@Override
	public ClassIntDto getClass(final String id) {
		return new ClassIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#updateClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto updateClass(final ClassIntDto classdto) {
		return classdto;
	}

}
