package com.operaprima.services.business.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.dao.classes.IClassesDao;

/**
 * @author Adesis
 *
 */
@Service
public class IntClassService implements IIntClassService {

	@Autowired
	private IClassesDao iClassDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.classes.IIntClassService#addClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	public ClassIntDto addClass(final ClassIntDto classdto) {
		return iClassDao.addClass(classdto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.classes.IIntClassService#listClasses()
	 */
	public ClassesIntDto listClasses() {
		return iClassDao.listClasses();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.classes.IIntClassService#getClass(java.lang.String)
	 */
	public ClassIntDto getClass(final String id) {
		return iClassDao.getClass(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.classes.IIntClassService#updateClass(com.operaprima.services.business.dtos.ClassIntDto)
	 */
	public ClassIntDto updateClass(final ClassIntDto classdto) {
		return iClassDao.updateClass(classdto);
	}

}
