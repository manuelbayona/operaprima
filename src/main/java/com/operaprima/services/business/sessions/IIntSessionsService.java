package com.operaprima.services.business.sessions;

import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntSessionsService {

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
	 * @param String
	 * @return SessionDto
	 */
	SessionIntDto getSession(final String id);

	/**
	 * @param SessionDto
	 * @return SessionDto
	 */
	SessionIntDto updateSession(final SessionIntDto session);

}
