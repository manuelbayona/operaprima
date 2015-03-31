package com.operaprima.services.dao.sessions;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class SessionsDao implements ISessionsDao {

	@Override
	public SessionIntDto addSession(final SessionIntDto session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionsIntDto listSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionIntDto getSession(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionIntDto updateSession(final SessionIntDto session) {
		// TODO Auto-generated method stub
		return null;
	}

}
