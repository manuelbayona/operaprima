package com.operaprima.services.business.sessions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.dao.sessions.ISessionsDao;

/**
 * @author Stormtroopers
 *
 */
@Service
@Mockeable
public class IntSessionsService implements IIntSessionsService {

	@Autowired
	private ISessionsDao sessionDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.sessions.IIntSessionsService#addSessions(com.operaprima.services.business.dtos.SessionIntDto)
	 */
	@Override
	public SessionIntDto addSession(final SessionIntDto session) {
		return sessionDao.addSession(session);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.sessions.IIntSessionsService#listSessions()
	 */
	@Override
	public SessionsIntDto listSessions() {
		return sessionDao.listSessions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.sessions.IIntSessionsService#getSessions(java.lang.String)
	 */
	@Override
	public SessionIntDto getSession(final String id) {
		return sessionDao.getSession(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.operaprima.services.business.sessions.IIntSessionsService#updateSessions(com.operaprima.services.business.dtos.SessionIntDto)
	 */
	@Override
	public SessionIntDto updateSession(final SessionIntDto session) {
		return sessionDao.updateSession(session);
	}

}
