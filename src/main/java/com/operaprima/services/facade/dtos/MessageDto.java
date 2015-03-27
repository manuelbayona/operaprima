package com.operaprima.services.facade.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "messages")
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDto implements Serializable {

	private static final long serialVersionUID = -2633515094459912891L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "author")
	private PersonDto author;

	@XmlElement(name = "content")
	private String content;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "date")
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
	public PersonDto getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(final PersonDto author) {
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
