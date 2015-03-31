package com.operaprima.services.dao.repositories.entities;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ExpertoJava
 * 
 */
@Document(collection = "classes")
public class ClassEntity {

	@Id
	private ObjectId id;
	private String note;
	private PriceEntity price;
	private Boolean active;

	@DBRef
	private List<GroupEntity> groups;

	@DBRef
	private SubjectEntity subject;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

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
	 * @return the groups
	 */
	public List<GroupEntity> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupEntity> groups) {
		this.groups = groups;
	}

	/**
	 * @return the subject
	 */
	public SubjectEntity getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(final SubjectEntity subject) {
		this.subject = subject;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof ClassEntity)) {
			return false;
		}
		final ClassEntity castOther = (ClassEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(note, castOther.note).append(price, castOther.price)
				.append(active, castOther.active).append(groups, castOther.groups).append(subject, castOther.subject).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(note).append(price).append(active).append(groups).append(subject).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("note", note).append("price", price).append("active", active)
				.append("groups", groups).append("subject", subject).toString();
	}

}
