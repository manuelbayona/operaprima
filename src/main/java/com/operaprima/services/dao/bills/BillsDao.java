package com.operaprima.services.dao.bills;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class BillsDao implements IBillsDao {

	@Override
	public BillIntDto addBill(final BillIntDto bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillsIntDto listBills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillIntDto getBill(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillIntDto updateBill(final BillIntDto bill) {
		// TODO Auto-generated method stub
		return null;
	}

}
