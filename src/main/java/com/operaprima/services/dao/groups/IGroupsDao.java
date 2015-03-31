package com.operaprima.services.dao.groups;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;

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
	 * @return GroupsDto
	 */
	GroupsIntDto listGroups();

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
	GroupIntDto listSessionsByGroup(String id);

}
