package com.operaprima.services.dao.subjects;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;
import com.operaprima.services.dao.repositories.ISubjectsRepository;
import com.operaprima.services.dao.repositories.entities.SubjectEntity;

/**
 * @author Adesis
 *
 */
public class SubjectsDao implements ISubjectsDao {

	@Autowired
	private ISubjectsRepository subjectsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public SubjectIntDto addSubject(final SubjectIntDto subjectIntDto) {

		SubjectEntity entity = (SubjectEntity) dozerUtils.classMapper(subjectIntDto, SubjectEntity.class);
		entity = subjectsRepository.save(entity);

		if (entity.getId() == null) {
			return null;
		}

		subjectIntDto.setId(entity.getId().toString());
		return subjectIntDto;
	}

	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subjectIntDto) {
		final SubjectEntity entity = (SubjectEntity) dozerUtils.classMapper(subjectIntDto, SubjectEntity.class);
		subjectsRepository.save(entity);
		return subjectIntDto;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SubjectsIntDto> listSubjects() {
		final List<SubjectEntity> listDB = (List<SubjectEntity>) subjectsRepository.findAll();
		return (List<SubjectsIntDto>) dozerUtils.listMapper(listDB, SubjectIntDto.class);
	}

	@Override
	public SubjectIntDto getSubject(final String id) {
		final SubjectEntity entity = subjectsRepository.findOne(new ObjectId(id));
		return (SubjectIntDto) dozerUtils.classMapper(entity, SubjectIntDto.class);
	}
}
