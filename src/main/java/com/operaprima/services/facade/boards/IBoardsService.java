package com.operaprima.services.facade.boards;

import com.operaprima.services.facade.dtos.BoardDto;
import com.operaprima.services.facade.dtos.BoardsDto;

/**
 * @author Stormtroopers
 *
 */
public interface IBoardsService {

	/**
	 * Servicio de negocio encargado de dar de alta un nuevo tablón
	 *
	 * @param BoardDto
	 * @return BoardDto
	 */
	BoardDto addBoard(final BoardDto board);

	/**
	 * Servicio de negocio que consulta todos los tablones
	 *
	 * @return BoardsDto
	 */
	BoardsDto listBoards();

	/**
	 * Servicio de negocio que consulta un tablón
	 *
	 * @param String
	 * @return BoardDto
	 */
	BoardDto getBoard(final String id);

	/**
	 * Servicio de negocio que actualiza un tablón
	 *
	 * @param BoardDto
	 * @return BoardDto
	 */
	BoardDto updateBoard(final BoardDto boardDto);

}
