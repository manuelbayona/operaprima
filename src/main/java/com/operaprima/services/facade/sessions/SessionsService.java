package com.operaprima.services.facade.sessions;

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

import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.business.sessions.IIntSessionsService;
import com.operaprima.services.facade.dtos.SessionDto;
import com.operaprima.services.facade.dtos.SessionsDto;

/**
 * @author Adesis
 *
 */
@Service("sessionsService")
@Path("V01/sessions")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class SessionsService implements ISessionsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntSessionsService intSessionsService;

	/*
	 * Servicio de negocio encargado de dar de alta una nueva sesión (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.sessions.ISessionsService#addSessions(com.operaprima.services.facade.dtos.SessionDto)
	 */
	@Override
	@POST
	@Path("/")
	public SessionDto addSession(final SessionDto session) {
		final SessionIntDto map = mapper.map(session, SessionIntDto.class);
		final SessionIntDto addSessions = intSessionsService.addSession(map);
		return mapper.map(addSessions, SessionDto.class);
	}

	/*
	 * Servicio de negocio que consulta todas las sesiones (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.sessions.ISessionsService#listSessions()
	 */
	@Override
	@GET
	@Path("/")
	public SessionsDto listSessions() {
		final SessionsIntDto listSessions = intSessionsService.listSessions();
		return mapper.map(listSessions, SessionsDto.class);
	}

	/*
	 * Servicio de negocio que consulta una sesión (non-Javadoc)
	 *
	 * @see com.operaprima.services.facade.sessions.ISessionsService#getSessions(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public SessionDto getSession(@PathParam("id") final String id) {
		final SessionIntDto sessions = intSessionsService.getSession(id);
		return mapper.map(sessions, SessionDto.class);
	}

	/*
	 * Servicio de negocio que actualiza una sesión (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.sessions.ISessionsService#updateSessions(com.operaprima.services.facade.dtos.SessionDto)
	 */
	@Override
	@PUT
	@Path("/")
	public SessionDto updateSession(final SessionDto session) {
		final SessionIntDto map = mapper.map(session, SessionIntDto.class);
		final SessionIntDto updateSessions = intSessionsService.updateSession(map);
		return mapper.map(updateSessions, SessionDto.class);
	}

}
