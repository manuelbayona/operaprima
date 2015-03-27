package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.operaprima.commons.service.facade.dtos.PriceDto;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "class")
public class ClassDto implements Serializable {

	private static final long serialVersionUID = 5535803118011605983L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "note")
	private String note;

	@XmlElement(name = "groups")
	private List<GroupDto> groups;

	@XmlElement(name = "price")
	private PriceDto price;

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
	public List<GroupDto> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(final List<GroupDto> groups) {
		this.groups = groups;
	}

	/**
	 * @return the price
	 */
	public PriceDto getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(final PriceDto price) {
		this.price = price;
	}

}
