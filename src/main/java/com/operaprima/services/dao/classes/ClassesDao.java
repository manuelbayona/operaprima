package com.operaprima.services.dao.classes;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;

/**
 * @author Adesis
 * 
 */
@Repository
public class ClassesDao implements IClassesDao {

	@Autowired
	private Mapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#addClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto addClass(final ClassIntDto classdto) {

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#listClasses()
	 */
	@Override
	public ClassesIntDto listClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#getClass(java.lang.String)
	 */
	@Override
	public ClassIntDto getClass(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.classes.IClassDao#updateClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto updateClass(final ClassIntDto classdto) {
		// TODO Auto-generated method stub
		return null;
	}

}
