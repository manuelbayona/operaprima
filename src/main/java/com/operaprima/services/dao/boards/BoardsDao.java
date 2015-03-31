package com.operaprima.services.dao.boards;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.dao.repositories.IBoardsRepository;
import com.operaprima.services.dao.repositories.entities.BoardEntity;

/**
 * @author diego.asensio
 * 
 */
public class BoardsDao implements IBoardsDao {
	@Autowired
	private IBoardsRepository boardsRepository;

	@Autowired
	private Mapper mapper;

	@Override
	public BoardIntDto addBoard(final BoardIntDto board) {
		BoardEntity entity = mapper.map(board, BoardEntity.class);
		entity = boardsRepository.save(entity);
		board.setId(entity.getId().toString());
		return board;
	}

	@Override
	public BoardIntDto listBoards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardIntDto getBoard(final String id) {
		final BoardEntity boardEntity = boardsRepository.findOne(new ObjectId(id));
		final BoardIntDto board = mapper.map(boardEntity, BoardIntDto.class);
		return board;
	}

	@Override
	public BoardIntDto updateBoard(final BoardIntDto board) {
		final BoardEntity entity = mapper.map(board, BoardEntity.class);
		boardsRepository.save(entity);
		return board;
	}

}
