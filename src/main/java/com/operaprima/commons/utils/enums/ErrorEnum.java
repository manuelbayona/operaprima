package com.operaprima.commons.utils.enums;

/**
 * @author Stormtroopers
 *
 */
public enum ErrorEnum {

	NO_DATA, FILTER_EMPTY, WRONG_FILTER, INEXISTENT_ENTITY, MALFORMED_PARAMETER, NOT_FOUND;

	private String code;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

}
