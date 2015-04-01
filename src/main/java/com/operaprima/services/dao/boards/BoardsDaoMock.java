package com.operaprima.services.dao.boards;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.operaprima.mock.Mock;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Mock
public class BoardsDaoMock implements IBoardsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardsDao#addBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		board.setId(UUID.randomUUID().toString());
		return board;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardsDao#listBoards()
	 */
	@Override
	public BoardsIntDto listBoards() {
		final BoardsIntDto boardsIntDto = new BoardsIntDto();
		boardsIntDto.setBoards(new ArrayList<BoardIntDto>());
		boardsIntDto.getBoards().add(new BoardIntDto());
		boardsIntDto.getBoards().add(new BoardIntDto());
		return boardsIntDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardsDao#getBoard(java.lang.String)
	 */
	@Override
	public BoardIntDto getBoard(final String id) {
		return new BoardIntDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardsDao#updateBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto updateBoard(final BoardIntDto boardDto) {
		return boardDto;
	}

}
