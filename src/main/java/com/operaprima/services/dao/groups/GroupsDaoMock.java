package com.operaprima.services.dao.groups;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Adesis
 *
 */
@Mock
@Repository
public class GroupsDaoMock implements IGroupsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto addGroup(final GroupIntDto groupDto) {
		groupDto.setId(UUID.randomUUID().toString());
		return groupDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupsIntDto listGroups() {
		final GroupsIntDto groupsIntDto = new GroupsIntDto();
		groupsIntDto.setGroups(new ArrayList<GroupIntDto>());
		groupsIntDto.getGroups().add(new GroupIntDto());
		groupsIntDto.getGroups().add(new GroupIntDto());
		return groupsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto getGroup(final String id) {
		return new GroupIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupIntDto updateGroup(final GroupIntDto group) {
		return group;
	}

	@Override
	public SessionsIntDto listSessionsByGroup(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
