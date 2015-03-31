package com.operaprima.services.business.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.dao.classes.IClassDao;

/**
 * @author Adesis
 *
 */
@Service
@Mockeable
public class IntClassesService implements IIntClassesService {

	@Autowired
	private IClassDao iClassDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.classes.IIntClassService#addClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto addClass(final ClassIntDto classdto) {
		return iClassDao.addClass(classdto);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.classes.IIntClassService#listClasses()
	 */
	@Override
	public ClassesIntDto listClasses() {
		return iClassDao.listClasses();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.classes.IIntClassService#getClass(java.lang.String)
	 */
	@Override
	public ClassIntDto getClass(final String id) {
		return iClassDao.getClass(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.classes.IIntClassService#updateClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	@Override
	public ClassIntDto updateClass(final ClassIntDto classdto) {
		return iClassDao.updateClass(classdto);
	}

}
