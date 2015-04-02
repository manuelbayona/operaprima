package com.operaprima.services.facade.groups;

import java.util.List;

import com.operaprima.services.facade.dtos.GroupDto;
import com.operaprima.services.facade.dtos.GroupsDto;
import com.operaprima.services.facade.dtos.SessionDto;

/**
 * @author Stormtroopers
 *
 */
public interface IGroupsService {

	/**
	 * @param groupDto
	 * @return GroupDto
	 */
	GroupDto addGroup(final GroupDto groupDto);

	/**
	 * @return GroupsDto
	 */
	GroupsDto listGroups();

	/**
	 * @param id
	 * @return GroupDto
	 */
	GroupDto getGroup(final String id);

	/**
	 * @param id
	 * @return GroupDto
	 */
	GroupDto updateGroup(final GroupDto group);

	/**
	 * @param id
	 * @return List<SessionDto>
	 */
	List<SessionDto> listSessionsByGroup(final String id);

}
