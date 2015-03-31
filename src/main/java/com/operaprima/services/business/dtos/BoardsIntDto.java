package com.operaprima.services.business.dtos;

import java.util.List;

/**
 * @author Adesis
 *
 */
public class BoardsIntDto {

	private List<BoardIntDto> boards;

	/**
	 * @return the boards
	 */
	public List<BoardIntDto> getBoards() {
		return boards;
	}

	/**
	 * @param boards
	 *            the boards to set
	 */
	public void setBoards(final List<BoardIntDto> boards) {
		this.boards = boards;
	}

}
