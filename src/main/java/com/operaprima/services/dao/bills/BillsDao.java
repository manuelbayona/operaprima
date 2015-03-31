package com.operaprima.services.dao.bills;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.dao.repositories.IBillsRepository;

/**
 * @author diego.asensio
 * 
 */
public class BillsDao implements IBillsDao {
	@Autowired
	private IBillsRepository billsRepository;

	@Autowired
	private Mapper mapper;
}
