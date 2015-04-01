package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Stormtroopers
 *
 */
@XmlRootElement(name = "board")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardDto implements Serializable {

	private static final long serialVersionUID = 2161288867940235988L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "messages")
	private List<MessageDto> messages;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @return the messages
	 */
	public List<MessageDto> getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(final List<MessageDto> messages) {
		this.messages = messages;
	}

}
