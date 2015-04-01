package com.operaprima.services.business.bills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.dao.bills.IBillsDao;

/**
 * @author Stormtroopers
 *
 */
@Service
@Mockeable
public class IntBillsService implements IIntBillsService {

	@Autowired
	private IBillsDao iBillsDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.bills.IIntBillsService#addBill(com.operaprima.services.business.dtos.BillIntDto)
	 */
	@Override
	public BillIntDto addBill(final BillIntDto bill) {
		return iBillsDao.addBill(bill);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.bills.IIntBillsService#listBills()
	 */
	@Override
	public BillsIntDto listBills() {
		return iBillsDao.listBills();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.bills.IIntBillsService#getBill(java.lang.String)
	 */
	@Override
	public BillIntDto getBill(final String id) {
		return iBillsDao.getBill(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.operaprima.services.business.bills.IIntBillsService#updateBill(com.operaprima.services.business.dtos.BillIntDto)
	 */
	@Override
	public BillIntDto updateBill(final BillIntDto bill) {
		return iBillsDao.updateBill(bill);
	}

}
