package com.operaprima.services.business.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class BoardIntDto implements Serializable {

	private static final long serialVersionUID = 2161288867940235988L;

	private String id;
	private List<MessageIntDto> messages;

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
	public List<MessageIntDto> getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(final List<MessageIntDto> messages) {
		this.messages = messages;
	}

}
