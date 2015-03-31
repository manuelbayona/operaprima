package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class SessionsIntDto {

	private List<SessionIntDto> sessions;

	/**
	 * @return the sessions
	 */
	public List<SessionIntDto> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions
	 *            the sessions to set
	 */
	public void setSessions(final List<SessionIntDto> sessions) {
		this.sessions = sessions;
	}

}
