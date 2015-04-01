package com.operaprima.services.business.boards;

import com.operaprima.services.business.dtos.BoardIntDto;

/**
 * @author Stormtroopers
 *
 */
public interface IIntBoardsService {
	/**
	 *
	 * @param BoardDto
	 * @return BoardDto
	 */
	BoardIntDto addBoard(final BoardIntDto board);

	/**
	 *
	 * @param String
	 * @return BoardDto
	 */
	BoardIntDto getBoard(final String id);

	/**
	 *
	 * @param BoardDto
	 * @return BoardDto
	 */
	BoardIntDto updateBoard(final BoardIntDto boardDto);

}
