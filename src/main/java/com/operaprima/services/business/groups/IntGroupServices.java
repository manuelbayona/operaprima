package com.operaprima.services.business.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.dao.groups.IGroupsDao;

/**
 * @author Adesis
 * 
 */
@Service
public class IntGroupServices implements IIntGroupsServices {

	@Autowired
	private IGroupsDao iGroupsDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#addGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto addGroups(final GroupIntDto groupDto) {
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
	public GroupIntDto getGroups(final String id) {
		return iGroupsDao.getGroup(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#updateGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	@Override
	public GroupIntDto updateGroups(final GroupIntDto group) {
		return iGroupsDao.updateGroup(group);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#listSessionsByGroup(java.lang.String)
	 */
	@Override
	public SessionsIntDto listSessionsByGroup(final String id) {
		return iGroupsDao.listSessionsByGroup(id);
	}

}
