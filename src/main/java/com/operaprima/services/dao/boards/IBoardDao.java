package com.operaprima.services.dao.boards;

import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;

/**
 * @author Adesis
 *
 */
public interface IBoardDao {

	/**
	 *
	 * @param BoardDto
	 * @return BoardDto
	 */
	BoardIntDto addBoard(final BoardIntDto board);

	/**
	 *
	 * @return BoardsDto
	 */
	BoardsIntDto listBoards();

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
