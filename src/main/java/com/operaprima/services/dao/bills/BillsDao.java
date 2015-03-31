package com.operaprima.services.dao.bills;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.dao.repositories.IBillsRepository;
import com.operaprima.services.dao.repositories.entities.BillEntity;

/**
 * @author diego.asensio
 * 
 */
public class BillsDao implements IBillsDao {
	@Autowired
	private IBillsRepository billsRepository;

	@Autowired
	private Mapper mapper;

	@Override
	public BillIntDto addBill(final BillIntDto bill) {
		BillEntity entity = mapper.map(bill, BillEntity.class);
		entity = billsRepository.save(entity);
		bill.setId(entity.getId().toString());
		return bill;
	}

	@Override
	public BillIntDto listBill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillIntDto getBill(final String id) {
		final BillEntity billEntity = billsRepository.findOne(new ObjectId(id));
		final BillIntDto bill = mapper.map(billEntity, BillIntDto.class);
		return bill;
	}

	@Override
	public BillIntDto updateBill(final BillIntDto bill) {
		final BillEntity entity = mapper.map(bill, BillEntity.class);
		billsRepository.save(entity);
		return bill;
	}
}
