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
 * @author Adesis
 *
 */
@Document(collection = "subjects")
public class SubjectEntity {

	@Id
	private ObjectId id;
	private String description;

	@DBRef
	private List<ClassEntity> classes;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the classes
	 */
	public List<ClassEntity> getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(final List<ClassEntity> classes) {
		this.classes = classes;
	}

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("description", description).append("classes", classes).toString();
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof SubjectEntity)) {
			return false;
		}
		final SubjectEntity castOther = (SubjectEntity) other;
		return new EqualsBuilder().append(id, castOther.id).append(description, castOther.description).append(classes, castOther.classes)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(description).append(classes).toHashCode();
	}

}
