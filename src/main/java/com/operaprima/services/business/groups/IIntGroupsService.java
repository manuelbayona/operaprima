package com.operaprima.services.business.groups;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntGroupsService {

	/**
	 * @param group
	 * @return GroupIntDto
	 */
	GroupIntDto addGroup(final GroupIntDto group);

	/**
	 * @return GroupsIntDto
	 */
	GroupsIntDto listGroups();

	/**
	 * @param id
	 * @return GroupIntDto
	 */
	GroupIntDto getGroup(final String id);

	/**
	 * @param groupDto
	 * @return GroupIntDto
	 */
	GroupIntDto updateGroup(final GroupIntDto group);

	/**
	 * @param id
	 * @return GroupIntDto
	 */
	GroupIntDto listSessionsByGroup(String id);

}
