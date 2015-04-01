package com.operaprima.services.dao.bills;

import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;

/**
 * @author Adesis
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
	BillsIntDto listBills();

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
