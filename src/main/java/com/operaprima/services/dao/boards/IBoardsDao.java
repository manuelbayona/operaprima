package com.operaprima.services.dao.boards;

import com.operaprima.services.business.dtos.BoardIntDto;

/**
 * @author diego.asensio
 * 
 */
public interface IBoardsDao {
	/**
	 * @param board
	 * @return
	 */
	BoardIntDto addBoard(BoardIntDto board);

	/**
	 * @param id
	 * @return
	 */
	BoardIntDto getBoard(String id);

	/**
	 * @param board
	 * @return
	 */
	BoardIntDto updateBoard(BoardIntDto board);
}
