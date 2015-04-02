package com.operaprima.services.facade.groups;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
 * @author Stormtroopers
 *
 */
@Service("groupsService")
@Path("V01/groups")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class GroupsService implements IGroupsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntGroupsServices iIntGroupService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.groups.IGroupsServices#addGroups(com.operaprima.services.facade.dtos.GroupDto)
	 */
	@Override
	@POST
	@Path("/")
	public GroupDto addGroup(final GroupDto groupDto) {
		final GroupIntDto map = mapper.map(groupDto, GroupIntDto.class);
		final GroupIntDto addGroups = iIntGroupService.addGroups(map);
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
		final GroupsIntDto listGroups = iIntGroupService.listGroups();
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
	public GroupDto getGroup(@PathParam("id") final String id) {
		final GroupIntDto getGroups = iIntGroupService.getGroups(id);
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
	public GroupDto updateGroup(final GroupDto group) {
		final GroupIntDto map = mapper.map(group, GroupIntDto.class);
		final GroupIntDto updateGroups = iIntGroupService.updateGroups(map);
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
	public List<SessionDto> listSessionsByGroup(@PathParam("id") final String id) {
		final GroupIntDto listSessionsByGroup = iIntGroupService.listSessionsByGroup(id);
		final GroupDto listSessionsByGroupReturn = mapper.map(listSessionsByGroup, GroupDto.class);
		return listSessionsByGroupReturn.getSessions();
	}

}
