package com.operaprima.services.dao.groups;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.repositories.IGroupsRepository;
import com.operaprima.services.repositories.entities.GroupEntity;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Primary
public class GroupsDao implements IGroupsDao {

	@Autowired
	private IGroupsRepository groupsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto addGroup(final GroupIntDto group) {
		GroupEntity entity = (GroupEntity) dozerUtils.classMapper(group, GroupEntity.class);
		entity = groupsRepository.save(entity);
		group.setId(entity.getId().toString());
		return group;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto getGroup(final String id) {
		final GroupEntity groupEntity = groupsRepository.findOne(new ObjectId(id));
		final GroupIntDto group = (GroupIntDto) dozerUtils.classMapper(groupEntity, GroupIntDto.class);
		return group;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionsIntDto listSessionsByGroup(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public GroupsIntDto listGroups() {

		final List<GroupEntity> listDB = (List<GroupEntity>) groupsRepository.findAll();

		if (listDB == null) {
			return null;
		}

		final GroupsIntDto groupsIntDto = new GroupsIntDto();
		groupsIntDto.setGroups((List<GroupIntDto>) dozerUtils.listMapper(listDB, GroupIntDto.class));
		return groupsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto updateGroup(final GroupIntDto group) {
		final GroupEntity entity = (GroupEntity) dozerUtils.classMapper(group, GroupEntity.class);
		groupsRepository.save(entity);
		return group;
	}

}
