package com.operaprima.services.facade.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class SessionsDto {

	private List<SessionDto> sessions;

	/**
	 * @return the sessions
	 */
	public List<SessionDto> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions the sessions to set
	 */
	public void setSessions(List<SessionDto> sessions) {
		this.sessions = sessions;
	}

}
