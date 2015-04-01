package com.operaprima.services.business.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Adesis
 *
 */
public class BillsIntDto implements Serializable {

	private static final long serialVersionUID = -9116087959244528732L;

	private List<BillIntDto> bills;

	/**
	 * @return the bills
	 */
	public List<BillIntDto> getBills() {
		return bills;
	}

	/**
	 * @param bills
	 *            the bills to set
	 */
	public void setBills(final List<BillIntDto> bills) {
		this.bills = bills;
	}

}
