package com.operaprima.services.dao.sessions;

import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;

/**
 * @author diego.asensio
 * 
 */
public interface ISessionsDao {
	/**
	 * @param session
	 * @return
	 */
	SessionIntDto addSession(SessionIntDto session);

	/**
	 * @return
	 */
	SessionsIntDto listSessions();

	/**
	 * @param id
	 * @return
	 */
	SessionIntDto getSession(String id);

	/**
	 * @param session
	 * @return
	 */
	SessionIntDto updateSession(SessionIntDto session);

}
