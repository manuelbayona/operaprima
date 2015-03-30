package com.operaprima.services.dao.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adesis
 *
 */
@Document(collection = "message")
public class MessageEntity {

	@Id
	private ObjectId id;
	// TODO Completar
	// private PersonEntity author;
	private String content;
	private DateTime date;

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

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("content", content).append("date", date).toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof MessageEntity)) {
			return false;
		}
		final MessageEntity castOther = (MessageEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(content, castOther.content).append(date, castOther.date).isEquals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(content).append(date).toHashCode();
	}

}
