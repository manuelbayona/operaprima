package com.operaprima.services.dao.groups;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class GroupsDao implements IGroupsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#addGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto addGroup(final GroupIntDto groupDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#listGroups()
	 */
	@Override
	public GroupsIntDto listGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#getGroups(java.lang.String)
	 */
	@Override
	public GroupIntDto getGroup(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#updateGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto updateGroup(final GroupIntDto group) {
		// TODO Auto-generated method stub
		return null;
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
