package com.operaprima.services.facade.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Stormtroopers
 *
 */
public class BoardsDto implements Serializable {

	private static final long serialVersionUID = 8723502374475653488L;

	private List<BoardDto> boards;

	/**
	 * @return the boards
	 */
	public List<BoardDto> getBoards() {
		return boards;
	}

	/**
	 * @param boards
	 *            the boards to set
	 */
	public void setBoards(final List<BoardDto> boards) {
		this.boards = boards;
	}

}
