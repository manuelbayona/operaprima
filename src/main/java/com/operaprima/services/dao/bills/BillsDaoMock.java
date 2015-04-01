package com.operaprima.services.dao.bills;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Mock
public class BillsDaoMock implements IBillsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BillIntDto addBill(final BillIntDto bill) {
		bill.setId(UUID.randomUUID().toString());
		return bill;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BillsIntDto listBills() {
		final BillsIntDto billsIntDto = new BillsIntDto();
		billsIntDto.setBills(new ArrayList<BillIntDto>());
		billsIntDto.getBills().add(new BillIntDto());
		billsIntDto.getBills().add(new BillIntDto());
		return billsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BillIntDto getBill(final String id) {
		return new BillIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BillIntDto updateBill(final BillIntDto bill) {
		return bill;
	}

}
