package com.operaprima.services.dao.boards;

import com.operaprima.services.business.dtos.BoardIntDto;

/**
 * @author Dartboard
 *
 */
public interface IBoardsDao {

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
