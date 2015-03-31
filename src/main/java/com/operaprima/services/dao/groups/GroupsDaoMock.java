package com.operaprima.services.dao.groups;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;

/**
 * @author Adesis
 *
 */
@Mock
@Repository
public class GroupsDaoMock implements IGroupsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#addGroup(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto addGroup(final GroupIntDto groupDto) {
		groupDto.setId(UUID.randomUUID().toString());
		return groupDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#listGroups()
	 */
	@Override
	public GroupsIntDto listGroups() {
		final GroupsIntDto groupsIntDto = new GroupsIntDto();
		groupsIntDto.setGroups(new ArrayList<GroupIntDto>());
		groupsIntDto.getGroups().add(new GroupIntDto());
		groupsIntDto.getGroups().add(new GroupIntDto());
		return groupsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#getGroup(java.lang.String)
	 */
	@Override
	public GroupIntDto getGroup(final String id) {
		return new GroupIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#updateGroup(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto updateGroup(final GroupIntDto group) {
		return group;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#listSessionsByGroup(java.lang.String)
	 */
	@Override
	public GroupIntDto listSessionsByGroup(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
