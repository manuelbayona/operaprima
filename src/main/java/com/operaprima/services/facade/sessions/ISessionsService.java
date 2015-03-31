package com.operaprima.services.facade.sessions;

import com.operaprima.services.facade.dtos.SessionDto;
import com.operaprima.services.facade.dtos.SessionsDto;

/**
 * @author Adesis
 *
 */
public interface ISessionsService {

	/**
	 * @param SessionDto
	 * @return SessionDto
	 */
	SessionDto addSession(final SessionDto session);

	/**
	 * @return SessionsDto
	 */
	SessionsDto listSessions();

	/**
	 * @param String
	 * @return SessionDto
	 */
	SessionDto getSession(final String id);

	/**
	 * @param SessionDto
	 * @return SessionDto
	 */
	SessionDto updateSession(final SessionDto session);

}
