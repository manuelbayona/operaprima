package com.operaprima.services.business.groups;

import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.dao.groups.IGroupsDao;

/**
 * @author Adesis
 *
 */
public class IntGroupServices implements IIntGroupsServices {

	@Autowired
	private IGroupsDao iGroupsDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#addGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	public GroupIntDto addGroups(final GroupIntDto groupDto) {
		return iGroupsDao.addGroups(groupDto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#listGroups()
	 */
	public GroupsIntDto listGroups() {
		return iGroupsDao.listGroups();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#getGroups(java.lang.String)
	 */
	public GroupIntDto getGroups(final String id) {
		return iGroupsDao.getGroups(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#updateGroups(com.operaprima.services.business.dtos.GroupIntDto)
	 */
	public GroupIntDto updateGroups(final GroupIntDto group) {
		return iGroupsDao.updateGroups(group);
	}

}
