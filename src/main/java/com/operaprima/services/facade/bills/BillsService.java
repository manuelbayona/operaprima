package com.operaprima.services.facade.bills;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.bills.IIntBillsService;
import com.operaprima.services.business.dtos.BillIntDto;
import com.operaprima.services.business.dtos.BillsIntDto;
import com.operaprima.services.facade.dtos.BillDto;
import com.operaprima.services.facade.dtos.BillsDto;

/**
 * @author Stormtroopers
 *
 */
@Service("billsService")
@Path("V01/bills")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class BillsService implements IBillsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntBillsService iIntBillsService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.bills.IBillsService#addBill(com.operaprima.services.facade.dtos.BillDto)
	 */
	@Override
	@POST
	@Path("/")
	public BillDto addBill(final BillDto bill) {
		final BillIntDto map = mapper.map(bill, BillIntDto.class);
		final BillIntDto addBill = iIntBillsService.addBill(map);
		return mapper.map(addBill, BillDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.bills.IBillsService#listBills()
	 */
	@Override
	@GET
	@Path("/")
	public BillsDto listBills() {
		final BillsIntDto listBills = iIntBillsService.listBills();
		return mapper.map(listBills, BillsDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.bills.IBillsService#getBill(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public BillDto getBill(@PathParam("id") final String id) {
		final BillIntDto getBill = iIntBillsService.getBill(id);
		return mapper.map(getBill, BillDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.bills.IBillsService#updateBill(com.operaprima.services.facade.dtos.BillDto)
	 */
	@Override
	@PUT
	@Path("/")
	public BillDto updateBill(final BillDto bill) {
		final BillIntDto map = mapper.map(bill, BillIntDto.class);
		final BillIntDto updateBill = iIntBillsService.updateBill(map);
		return mapper.map(updateBill, BillDto.class);
	}

}
