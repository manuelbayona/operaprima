package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class SubjectsIntDto {

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
