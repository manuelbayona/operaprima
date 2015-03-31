package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "bills")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillsDto implements Serializable {

	private static final long serialVersionUID = 3370648896901536292L;

	@XmlElement(name = "bills")
	private List<BillDto> bills;

	/**
	 * @return the bills
	 */
	public List<BillDto> getBills() {
		return bills;
	}

	/**
	 * @param bills
	 *            the bills to set
	 */
	public void setBills(final List<BillDto> bills) {
		this.bills = bills;
	}

}
