package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class GroupsDto implements Serializable {

	private static final long serialVersionUID = -5128315552345606445L;

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
