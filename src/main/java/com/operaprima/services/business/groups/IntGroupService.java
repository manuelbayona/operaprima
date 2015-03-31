package com.operaprima.services.business.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.dao.groups.IGroupsDao;

/**
 * @author Adesis
 *
 */
@Service
@Mockeable
public class IntGroupService implements IIntGroupsService {

	@Autowired
	private IGroupsDao iGroupsDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#addGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto addGroup(final GroupIntDto groupDto) {
		return iGroupsDao.addGroup(groupDto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#listGroups()
	 */
	@Override
	public GroupsIntDto listGroups() {
		return iGroupsDao.listGroups();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#getGroups(java.lang.String)
	 */
	@Override
	public GroupIntDto getGroup(final String id) {
		return iGroupsDao.getGroup(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#updateGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto updateGroup(final GroupIntDto group) {
		return iGroupsDao.updateGroup(group);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#listSessionsByGroup(java.lang.String)
	 */
	@Override
	public GroupIntDto listSessionsByGroup(final String id) {
		return iGroupsDao.listSessionsByGroup(id);
	}

}
