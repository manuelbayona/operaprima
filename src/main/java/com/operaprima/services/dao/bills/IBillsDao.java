package com.operaprima.services.dao.bills;

import com.operaprima.services.business.dtos.BillIntDto;

/**
 * @author diego.asensio
 * 
 */
public interface IBillsDao {
	/**
	 * @param bill
	 * @return
	 */
	BillIntDto addBill(BillIntDto bill);

	/**
	 * @return
	 */
	BillIntDto listBill();

	/**
	 * @param id
	 * @return
	 */
	BillIntDto getBill(String id);

	/**
	 * @param bill
	 * @return
	 */
	BillIntDto updateBill(BillIntDto bill);
}
