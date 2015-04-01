package com.operaprima.services.business.dtos.enums;

/**
 * @author Stormtroopers
 *
 */
public enum UserTypeEnum {

	ADMIN("A"), OWNER("O"), TEACHER("T"), STUDENT("S");

	private String code;

	/**
	 * @param code
	 */
	UserTypeEnum(final String code) {
		this.setCode(code);
	}

	/**
	 * @param code
	 * @return UserTypeEnum
	 */
	UserTypeEnum getByCode(final String code) {
		for (final UserTypeEnum value : values()) {
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
