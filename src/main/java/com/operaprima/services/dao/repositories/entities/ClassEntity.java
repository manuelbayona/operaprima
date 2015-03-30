package com.operaprima.services.dao.repositories.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ExpertoJava
 *
 */
@Document(collection = "class")
public class ClassEntity {

	@Id
	private ObjectId id;
	private String note;
	// private String groups;
	private PriceEntity price;

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(final String note) {
		this.note = note;
	}

	/**
	 * @return the price
	 */
	public PriceEntity getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceEntity price) {
		this.price = price;
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
		return new ToStringBuilder(this).append("id", id).append("note", note).append("price", price).toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof ClassEntity)) {
			return false;
		}
		final ClassEntity castOther = (ClassEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(note, castOther.note).append(price, castOther.price).isEquals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(note).append(price).toHashCode();
	}

}
