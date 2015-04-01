package com.operaprima.services.dao.sessions;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class SessionsDaoMock implements ISessionsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.sessions.ISessionsDao#addSessions(com.operaprima.services.business.dtos.SessionIntDto)
	 */
	@Override
	public SessionIntDto addSession(final SessionIntDto session) {
		session.setId(UUID.randomUUID().toString());
		return session;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.sessions.ISessionsDao#listSessions()
	 */
	@Override
	public SessionsIntDto listSessions() {
		final SessionsIntDto sessionsIntDto = new SessionsIntDto();
		sessionsIntDto.setSessions(new ArrayList<SessionIntDto>());
		sessionsIntDto.getSessions().add(new SessionIntDto());
		sessionsIntDto.getSessions().add(new SessionIntDto());
		return sessionsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.sessions.ISessionsDao#getSessions(java.lang.String)
	 */
	@Override
	public SessionIntDto getSession(final String id) {
		return new SessionIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.sessions.ISessionsDao#updateSessions(com.operaprima.services.business.dtos.SessionIntDto)
	 */
	@Override
	public SessionIntDto updateSession(final SessionIntDto session) {
		return session;
	}

}
