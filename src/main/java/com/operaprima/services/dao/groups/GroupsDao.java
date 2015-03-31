package com.operaprima.services.dao.groups;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.dao.repositories.IGroupsRepository;

/**
 * @author Adesis
 * 
 */
@Repository
public class GroupsDao implements IGroupsDao {

	@Autowired
	private IGroupsRepository groupsRepository;

	@Autowired
	private Mapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#addGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto addGroups(final GroupIntDto groupDto) {
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
	public GroupIntDto getGroups(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.groups.IGroupsDao#updateGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto updateGroups(final GroupIntDto group) {
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
