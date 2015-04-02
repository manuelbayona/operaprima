package com.operaprima.services.dao.boards;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.repositories.IBoardsRepository;
import com.operaprima.services.repositories.entities.BoardEntity;

/**
 * @author Stormtroopers
 *
 */
@Repository
@Primary
public class BoardsDao implements IBoardsDao {
	@Autowired
	private IBoardsRepository boardsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		BoardEntity entity = (BoardEntity) dozerUtils.classMapper(board, BoardEntity.class);
		entity = boardsRepository.save(entity);
		board.setId(entity.getId().toString());
		return board;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto getBoard(final String id) {
		final BoardEntity boardEntity = boardsRepository.findOne(new ObjectId(id));
		final BoardIntDto board = (BoardIntDto) dozerUtils.classMapper(boardEntity, BoardIntDto.class);
		return board;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardIntDto updateBoard(final BoardIntDto board) {
		final BoardEntity entity = (BoardEntity) dozerUtils.classMapper(board, BoardEntity.class);
		boardsRepository.save(entity);
		return board;
	}

}
