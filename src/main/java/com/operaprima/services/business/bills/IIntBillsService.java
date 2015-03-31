package com.operaprima.services.business.bills;

import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;

/**
 * @author Adesis
 *
 */
public interface IIntBillsService {

	/**
	 * @param bill
	 * @return
	 */
	BillIntDto addBill(final BillIntDto bill);

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
	BillIntDto updateBill(final BillIntDto bill);

}
