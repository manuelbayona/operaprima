package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Stormtroopers
 *
 */
public class GroupsIntDto {

	private List<GroupIntDto> groups;

	/**
	 * @return the groups
	 */
	public List<GroupIntDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupIntDto> groups) {
		this.groups = groups;
	}

}
