package com.operaprima.services.dao.boards;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.business.dtos.BoardsIntDto;
import com.operaprima.services.repositories.IBoardsRepository;
import com.operaprima.services.repositories.entities.BoardEntity;

/**
 * @author Dartboard
 *
 */
@Repository
@Primary
public class BoardsDao implements IBoardsDao {
	@Autowired
	private IBoardsRepository boardsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		BoardEntity entity = (BoardEntity) dozerUtils.classMapper(board, BoardEntity.class);
		entity = boardsRepository.save(entity);
		board.setId(entity.getId().toString());
		return board;
	}

	@Override
	public BoardIntDto getBoard(final String id) {
		final BoardEntity boardEntity = boardsRepository.findOne(new ObjectId(id));
		final BoardIntDto board = (BoardIntDto) dozerUtils.classMapper(boardEntity, BoardIntDto.class);
		return board;
	}

	@Override
	public BoardIntDto updateBoard(final BoardIntDto board) {
		final BoardEntity entity = (BoardEntity) dozerUtils.classMapper(board, BoardEntity.class);
		boardsRepository.save(entity);
		return board;
	}

	@Override
	public BoardsIntDto listBoards() {
		// TODO Auto-generated method stub
		return null;
	}
}
