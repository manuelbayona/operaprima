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
	GroupIntDto addGroups(final GroupIntDto groupDto);

	/**
	 * @return GroupsDto
	 */
	GroupsIntDto listGroups();

	/**
	 * @param String
	 * @return GroupDto
	 */
	GroupIntDto getGroups(final String id);

	/**
	 * @param GroupDto
	 * @return String
	 */
	GroupIntDto updateGroups(final GroupIntDto group);

	/**
	 * @param String
	 * @return GroupDto
	 */
	GroupIntDto listSessionsByGroup(String id);

}
