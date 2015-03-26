package com.operaprima.services.facade.groups;

import com.operaprima.services.facade.dtos.GroupDto;
import com.operaprima.services.facade.dtos.GroupsDto;

/**
 * @author Adesis
 *
 */
public interface IGroupsServices {

	/**
	 * @param GroupDto
	 * @return String
	 */
	GroupDto addGroups(final GroupDto groupDto);

	/**
	 * @return GroupsDto
	 */
	GroupsDto listGroups();

	/**
	 * @param String
	 * @return GroupDto
	 */
	GroupDto getGroups(final String id);

	/**
	 * @param GroupDto
	 * @return String
	 */
	GroupDto updateGroups(final GroupDto group);

}
