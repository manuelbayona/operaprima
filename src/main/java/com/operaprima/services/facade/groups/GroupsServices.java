package com.operaprima.services.facade.groups;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

import com.operaprima.services.facade.dtos.GroupDto;
import com.operaprima.services.facade.dtos.GroupsDto;

/**
 * @author Adesis
 *
 */
@Service("groupsService")
@Path("V01/groups")
public class GroupsServices implements IGroupsServices {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#addGroups(com.operaprima.services.facade.dtos.GroupDto)
	 */
	@POST
	@Path("/")
	public String addGroups(final GroupDto groupDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#listGroups()
	 */
	@GET
	@Path("/")
	public GroupsDto listGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#getGroups(java.lang.String)
	 */
	@GET
	@Path("/{id}")
	public GroupDto getGroups(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#updateGroups(com.operaprima.services.facade.dtos.GroupDto)
	 */
	@PUT
	@Path("/")
	public String updateGroups(final GroupDto group) {
		// TODO Auto-generated method stub
		return null;
	}

}
