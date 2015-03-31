package com.operaprima.services.dao.repositories.entities;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adesis
 * 
 */
@Document(collection = "boards")
public class BoardEntity {

	@Id
	private ObjectId id;

	private List<MessageEntity> messages;

	/**
	 * @return the messages
	 */
	public List<MessageEntity> getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(final List<MessageEntity> messages) {
		this.messages = messages;
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
		return new ToStringBuilder(this).append("id", id).append("messages", messages).toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof BoardEntity)) {
			return false;
		}
		final BoardEntity castOther = (BoardEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(messages, castOther.messages).isEquals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(messages).toHashCode();
	}

}
