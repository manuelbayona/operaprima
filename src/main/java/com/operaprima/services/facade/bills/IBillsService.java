package com.operaprima.services.facade.bills;

import com.operaprima.services.facade.dtos.BillDto;
import com.operaprima.services.facade.dtos.BillsDto;

/**
 * @author Adesis
 *
 */
public interface IBillsService {

	/**
	 * Servicio de negocio encargado de añadir una factura
	 *
	 * @param bill
	 * @return
	 */
	BillDto addBill(final BillDto bill);

	/**
	 * Servicio de negocio encargado de listar todas las facturas
	 *
	 * @return
	 */
	BillsDto listBills();

	/**
	 * Servicio de negocio encargado de obtener una factura
	 *
	 * @param id
	 * @return
	 */
	BillDto getBill(final String id);

	/**
	 * Servicio de negocio encargado de actualizar una factura
	 *
	 * @param bill
	 * @return
	 */
	BillDto updateBill(final BillDto bill);

}
