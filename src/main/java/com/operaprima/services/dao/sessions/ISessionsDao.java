package com.operaprima.services.dao.sessions;

import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface ISessionsDao {

	/**
	 * @param SessionDto
	 * @return SessionDto
	 */
	SessionIntDto addSession(final SessionIntDto session);

	/**
	 * @return SessionsDto
	 */
	SessionsIntDto listSessions();

	/**
	 * @param id
	 * @return
	 */
	SessionIntDto getSession(String id);

	/**
	 * @param SessionDto
	 * @return SessionDto
	 */
	SessionIntDto updateSession(final SessionIntDto session);
}
