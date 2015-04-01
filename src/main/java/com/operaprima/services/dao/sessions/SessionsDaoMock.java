package com.operaprima.services.dao.sessions;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Dartboard
 *
 */
@Repository
@Mock
public class SessionsDaoMock implements ISessionsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionIntDto addSession(final SessionIntDto session) {
		session.setId(UUID.randomUUID().toString());
		return session;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionsIntDto listSessions() {
		final SessionsIntDto sessionsIntDto = new SessionsIntDto();
		sessionsIntDto.setSessions(new ArrayList<SessionIntDto>());
		sessionsIntDto.getSessions().add(new SessionIntDto());
		sessionsIntDto.getSessions().add(new SessionIntDto());
		return sessionsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionIntDto getSession(final String id) {
		return new SessionIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionIntDto updateSession(final SessionIntDto session) {
		return session;
	}

}
