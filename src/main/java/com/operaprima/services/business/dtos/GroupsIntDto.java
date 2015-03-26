package com.operaprima.services.business.dtos;

import java.util.List;

import com.operaprima.services.facade.dtos.GroupDto;

/**
 * @author Adesis
 *
 */
public class GroupsIntDto {

	private List<GroupDto> groups;

	/**
	 * @return the groups
	 */
	public List<GroupDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupDto> groups) {
		this.groups = groups;
	}

}
