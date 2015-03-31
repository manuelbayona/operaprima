package com.operaprima.services.facade.groups;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.dtos.GroupIntDto;
import com.operaprima.services.business.dtos.GroupsIntDto;
import com.operaprima.services.business.groups.IIntGroupsServices;
import com.operaprima.services.facade.dtos.GroupDto;
import com.operaprima.services.facade.dtos.GroupsDto;
import com.operaprima.services.facade.dtos.SessionDto;

/**
 * @author Adesis
 *
 */
@Service("groupsService")
@Path("V01/groups")
@Consumes("application/json")
@Produces("application/json")
public class GroupsServices implements IGroupsServices {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntGroupsServices iIntGroupServices;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#addGroups(com.operaprima.services.facade.dtos.GroupDto)
	 */
	@Override
	@POST
	@Path("/")
	public GroupDto addGroups(final GroupDto groupDto) {
		final GroupIntDto map = mapper.map(groupDto, GroupIntDto.class);
		final GroupIntDto addGroups = iIntGroupServices.addGroups(map);
		return mapper.map(addGroups, GroupDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#listGroups()
	 */
	@Override
	@GET
	@Path("/")
	public GroupsDto listGroups() {
		final GroupsIntDto listGroups = iIntGroupServices.listGroups();
		return mapper.map(listGroups, GroupsDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#getGroups(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public GroupDto getGroups(@PathParam("id") final String id) {
		final GroupIntDto getGroups = iIntGroupServices.getGroups(id);
		return mapper.map(getGroups, GroupDto.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.groups.IGroupsServices#updateGroups(com.operaprima.services.facade.dtos.GroupDto)
	 */
	@Override
	@PUT
	@Path("/")
	public GroupDto updateGroups(final GroupDto group) {
		final GroupIntDto map = mapper.map(group, GroupIntDto.class);
		final GroupIntDto updateGroups = iIntGroupServices.updateGroups(map);
		return mapper.map(updateGroups, GroupDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.groups.IGroupsServices#listSessionsByGroup(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}/sessions")
	public List<SessionDto> listSessionsByGroup(final String id) {
		final GroupIntDto listSessionsByGroup = iIntGroupServices.listSessionsByGroup(id);
		final GroupDto listSessionsByGroupReturn = mapper.map(listSessionsByGroup, GroupDto.class);
		return listSessionsByGroupReturn.getSessions();
	}

}
