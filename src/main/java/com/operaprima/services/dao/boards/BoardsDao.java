package com.operaprima.services.dao.boards;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;

/**
 * @author Adesis
 *
 */
@Repository
@Primary
public class BoardsDao implements IBoardDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardDao#addBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardDao#listBoards()
	 */
	@Override
	public BoardsIntDto listBoards() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardDao#getBoard(java.lang.String)
	 */
	@Override
	public BoardIntDto getBoard(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.dao.boards.IBoardDao#updateBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto updateBoard(final BoardIntDto boardDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
