package com.operaprima.services.dao.classes;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.repositories.IClassesRepository;
import com.operaprima.services.repositories.entities.ClassEntity;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Primary
public class ClassesDao implements IClassesDao {

	@Autowired
	private IClassesRepository classesRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto addClass(final ClassIntDto sclass) {
		ClassEntity entity = (ClassEntity) dozerUtils.classMapper(sclass, ClassEntity.class);
		entity = classesRepository.save(entity);
		sclass.setId(entity.getId().toString());
		return sclass;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto getClass(final String id) {
		final ClassEntity classEntity = classesRepository.findOne(new ObjectId(id));
		final ClassIntDto sclass = (ClassIntDto) dozerUtils.classMapper(classEntity, ClassIntDto.class);
		return sclass;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassIntDto updateClass(final ClassIntDto sclass) {
		final ClassEntity entity = (ClassEntity) dozerUtils.classMapper(sclass, ClassEntity.class);
		classesRepository.save(entity);
		return sclass;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ClassesIntDto listClasses() {
		final List<ClassEntity> listDB = (List<ClassEntity>) classesRepository.findAll();

		if (listDB == null) {
			return null;
		}

		final ClassesIntDto classesIntDto = new ClassesIntDto();
		classesIntDto.setClasses((List<ClassIntDto>) dozerUtils.listMapper(listDB, ClassIntDto.class));
		return classesIntDto;
	}

}
