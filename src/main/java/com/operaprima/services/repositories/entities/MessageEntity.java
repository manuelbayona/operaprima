package com.operaprima.services.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * @author Stormtroopers
 *
 */
public class MessageEntity {

	private String content;
	private DateTime date;

	@DBRef
	private PersonEntity author;

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
	 * @return the author
	 */
	public PersonEntity getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(final PersonEntity author) {
		this.author = author;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof MessageEntity)) {
			return false;
		}
		final MessageEntity castOther = (MessageEntity) other;
		return new EqualsBuilder().append(content, castOther.content).append(date, castOther.date).append(author, castOther.author)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(content).append(date).append(author).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("content", content).append("date", date).append("author", author).toString();
	}

}
