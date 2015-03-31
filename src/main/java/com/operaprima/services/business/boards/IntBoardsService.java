package com.operaprima.services.business.boards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.mock.Mockeable;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;
import com.operaprima.services.dao.boards.IBoardDao;

/**
 * @author Adesis
 *
 */
@Service
@Mockeable
public class IntBoardsService implements IIntBoardsService {

	@Autowired
	private IBoardDao boardDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.boards.IIntBoardsService#addBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		return boardDao.addBoard(board);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.boards.IIntBoardsService#listBoards()
	 */
	@Override
	public BoardsIntDto listBoards() {
		return boardDao.listBoards();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.boards.IIntBoardsService#getBoard(java.lang.String)
	 */
	@Override
	public BoardIntDto getBoard(final String id) {
		return boardDao.getBoard(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.business.boards.IIntBoardsService#updateBoard(com.operaprima.services.business.dtos.BoardIntDto)
	 */
	@Override
	public BoardIntDto updateBoard(final BoardIntDto boardDto) {
		return boardDao.updateBoard(boardDto);
	}

}
