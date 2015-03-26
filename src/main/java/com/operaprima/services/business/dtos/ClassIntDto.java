package com.operaprima.services.business.dtos;

import java.io.Serializable;
import java.util.List;

import com.operaprima.commons.business.dtos.PriceIntDto;

/**
 * @author Adesis
 *
 */
public class ClassIntDto implements Serializable {

	private static final long serialVersionUID = 5535803118011605983L;

	private String id;
	private String note;
	private List<GroupIntDto> groups;
	private PriceIntDto price;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
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
	 * @return the groups
	 */
	public List<GroupIntDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupIntDto> groups) {
		this.groups = groups;
	}

	/**
	 * @return the price
	 */
	public PriceIntDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceIntDto price) {
		this.price = price;
	}

}
