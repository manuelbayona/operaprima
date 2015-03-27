package com.operaprima.services.business.dtos.enums;

/**
 * @author Adesis
 *
 */
public enum UserStateEnum {

	ACTIVE("A"), DISMISSED("D");

	private String code;

	/**
	 * @param String
	 */
	UserStateEnum(final String code) {
		this.code = code;
	}

	/**
	 * @param String
	 * @return UserStateEnum
	 */
	UserStateEnum getByCode(final String code) {
		for (final UserStateEnum value : values()) {
			if (code.equals(value.getCode())) {
				return value;
			}
		}
		return null;
	}

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
