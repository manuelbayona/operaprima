package com.operaprima.services.dao.boards;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;

/**
 * @author Dartboard
 *
 */
@Repository
@Mock
public class BoardsDaoMock implements IBoardsDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		board.setId(UUID.randomUUID().toString());
		return board;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardsIntDto listBoards() {
		final BoardsIntDto boardsIntDto = new BoardsIntDto();
		boardsIntDto.setBoards(new ArrayList<BoardIntDto>());
		boardsIntDto.getBoards().add(new BoardIntDto());
		boardsIntDto.getBoards().add(new BoardIntDto());
		return boardsIntDto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto getBoard(final String id) {
		return new BoardIntDto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto updateBoard(final BoardIntDto boardDto) {
		return boardDto;
	}

}
