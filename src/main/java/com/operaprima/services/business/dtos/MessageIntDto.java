package com.operaprima.services.business.dtos;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class MessageIntDto implements Serializable {

	private static final long serialVersionUID = -2633515094459912891L;

	private String id;
	private PersonIntDto author;
	private String content;
	private DateTime date;

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
	 * @return the author
	 */
	public PersonIntDto getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(final PersonIntDto author) {
		this.author = author;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(final String content) {
		this.content = content;
	}

	/**
	 * @return the date
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(final DateTime date) {
		this.date = date;
	}

}
