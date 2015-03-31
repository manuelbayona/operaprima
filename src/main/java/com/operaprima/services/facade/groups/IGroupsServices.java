package com.operaprima.services.facade.groups;

import java.util.List;

import com.operaprima.services.facade.dtos.GroupDto;
import com.operaprima.services.facade.dtos.GroupsDto;
import com.operaprima.services.facade.dtos.SessionDto;

/**
 * @author Adesis
 *
 */
public interface IGroupsServices {

	/**
	 * @param GroupDto
	 * @return GroupDto
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
	 * @return GroupDto
	 */
	GroupDto updateGroups(final GroupDto group);

	/**
	 * @param String
	 * @return List<SessionDto>
	 */
	List<SessionDto> listSessionsByGroup(final String id);

}
