package com.operaprima.services.dao.classes;

import java.util.List;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.ClassIntDto;
import com.operaprima.services.business.dtos.ClassesIntDto;
import com.operaprima.services.dao.repositories.IClassesRepository;
import com.operaprima.services.dao.repositories.entities.ClassEntity;

/**
 * @author Adesis
 * 
 */
@Repository
public class ClassesDao implements IClassesDao {

	@Autowired
	private IClassesRepository classesRepository;

	@Autowired
	private Mapper mapper;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public ClassIntDto addClass(final ClassIntDto sclass) {
		ClassEntity entity = mapper.map(sclass, ClassEntity.class);
		entity = classesRepository.save(entity);
		sclass.setId(entity.getId().toString());
		return sclass;
	}

	@Override
	public ClassIntDto getClass(final String id) {
		final ClassEntity classEntity = classesRepository.findOne(new ObjectId(id));
		final ClassIntDto sclass = mapper.map(classEntity, ClassIntDto.class);
		return sclass;
	}

	@Override
	public ClassIntDto updateClass(final ClassIntDto sclass) {
		final ClassEntity entity = mapper.map(sclass, ClassEntity.class);
		classesRepository.save(entity);
		return sclass;
	}

	@Override
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
