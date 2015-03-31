package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author diego.asensio
 * 
 */
@XmlRootElement(name = "sessions")
@XmlAccessorType(XmlAccessType.FIELD)
public class SessionsDto implements Serializable {

	private static final long serialVersionUID = 3048164811277032676L;

	@XmlElement(name = "sessions")
	private List<SessionDto> sessions;

	public List<SessionDto> getSessions() {
		return sessions;
	}

	public void setSessions(final List<SessionDto> sessions) {
		this.sessions = sessions;
	}

}
