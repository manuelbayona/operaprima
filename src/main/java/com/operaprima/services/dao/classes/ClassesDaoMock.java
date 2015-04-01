package com.operaprima.services.dao.classes;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Dartboard
 *
 */
@Repository
@Mock
public class ClassesDaoMock implements IClassesDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto addClass(final ClassIntDto classdto) {
		classdto.setId(UUID.randomUUID().toString());
		return classdto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassesIntDto listClasses() {
		final ClassesIntDto classesIntDto = new ClassesIntDto();
		classesIntDto.setClasses(new ArrayList<ClassIntDto>());
		classesIntDto.getClasses().add(new ClassIntDto());
		classesIntDto.getClasses().add(new ClassIntDto());
		return classesIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto getClass(final String id) {
		return new ClassIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto updateClass(final ClassIntDto classdto) {
		return classdto;
	}

}
