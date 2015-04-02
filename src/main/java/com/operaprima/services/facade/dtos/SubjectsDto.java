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
@XmlRootElement(name = "subjects")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectsDto implements Serializable {

	private static final long serialVersionUID = 7087134287090757608L;

	@XmlElement(name = "subjects")
	private List<SubjectDto> subjects;

	/**
	 * @return the subjects
	 */
	public List<SubjectDto> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(final List<SubjectDto> subjects) {
		this.subjects = subjects;
	}

}