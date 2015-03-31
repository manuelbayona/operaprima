package com.operaprima.services.dao.bills;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.dao.repositories.IBillsRepository;
import com.operaprima.services.dao.repositories.entities.BillEntity;

/**
 * @author Adesis
 *
 */
public class BillsDao implements IBillsDao {
	@Autowired
	private IBillsRepository billsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public BillIntDto addBill(final BillIntDto bill) {
		BillEntity entity = (BillEntity) dozerUtils.classMapper(bill, BillEntity.class);
		entity = billsRepository.save(entity);
		bill.setId(entity.getId().toString());
		return bill;
	}

	@Override
	public BillIntDto listBills() {
		return null;
	}

	@Override
	public BillIntDto getBill(final String id) {
		final BillEntity billEntity = billsRepository.findOne(new ObjectId(id));
		final BillIntDto bill = (BillIntDto) dozerUtils.classMapper(billEntity, BillIntDto.class);
		return bill;
	}

	@Override
	public BillIntDto updateBill(final BillIntDto bill) {
		final BillEntity entity = (BillEntity) dozerUtils.classMapper(bill, BillEntity.class);
		billsRepository.save(entity);
		return bill;
	}
}
