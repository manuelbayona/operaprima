package com.operaprima.services.dao.groups;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Adesis
 * 
 */
public interface IGroupsDao {

	/**
	 * @param GroupDto
	 * @return String
	 */
	GroupIntDto addGroup(final GroupIntDto groupDto);

	/**
	 * @param String
	 * @return GroupDto
	 */
	GroupIntDto getGroup(final String id);

	/**
	 * @param GroupDto
	 * @return String
	 */
	GroupIntDto updateGroup(final GroupIntDto group);

	/**
	 * @param String
	 * @return GroupDto
	 */
	SessionsIntDto listSessionsByGroup(String id);

	/**
	 * @return
	 */
	GroupsIntDto listGroups();
}
