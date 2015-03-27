package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "groups")
public class GroupsDto implements Serializable {

	private static final long serialVersionUID = -5128315552345606445L;

	@XmlElement(name = "groups")
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
