package com.operaprima.services.business.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.dao.groups.IGroupsDao;

/**
 * @author Stormtroopers
 *
 */
@Service
@Mockeable
public class IntGroupsService implements IIntGroupsServices {

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

	@Override
	public GroupIntDto listSessionsByGroup(final String id) {
		// TODO: revisar esto... que el dao devuelva ya el DTO
		final GroupIntDto groupIntDto = new GroupIntDto();
		groupIntDto.setId(id);
		groupIntDto.setSessions(iGroupsDao.listSessionsByGroup(id).getSessions());
		return groupIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.groups.IIntGroupsServices#listSessionsByGroup(java.lang.String)
	 */

}
