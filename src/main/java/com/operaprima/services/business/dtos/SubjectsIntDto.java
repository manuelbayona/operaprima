package com.operaprima.services.business.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author adesis
 *
 */
public class SubjectsIntDto implements Serializable {

	private static final long serialVersionUID = 9013758775815336809L;

	private List<SubjectIntDto> subjects;

	/**
	 * @return the subjects
	 */
	public List<SubjectIntDto> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(final List<SubjectIntDto> subjects) {
		this.subjects = subjects;
	}

}
