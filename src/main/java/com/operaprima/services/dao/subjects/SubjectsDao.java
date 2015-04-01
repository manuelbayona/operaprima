package com.operaprima.services.dao.subjects;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.SubjectIntDto;
import com.operaprima.services.business.dtos.SubjectsIntDto;
import com.operaprima.services.repositories.ISubjectsRepository;
import com.operaprima.services.repositories.entities.SubjectEntity;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Primary
public class SubjectsDao implements ISubjectsDao {

	@Autowired
	private ISubjectsRepository subjectsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 * {@inheritDoc}
	 */
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectIntDto updateSubject(final SubjectIntDto subjectIntDto) {
		final SubjectEntity entity = (SubjectEntity) dozerUtils.classMapper(subjectIntDto, SubjectEntity.class);
		subjectsRepository.save(entity);
		return subjectIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public SubjectsIntDto listSubjects() {
		final List<SubjectEntity> listDB = (List<SubjectEntity>) subjectsRepository.findAll();

		final SubjectsIntDto subjectsIntDto = new SubjectsIntDto();
		subjectsIntDto.setSubjects((List<SubjectIntDto>) dozerUtils.listMapper(listDB, SubjectIntDto.class));

		return subjectsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectIntDto getSubject(final String id) {
		final SubjectEntity entity = subjectsRepository.findOne(new ObjectId(id));
		return (SubjectIntDto) dozerUtils.classMapper(entity, SubjectIntDto.class);
	}
}
