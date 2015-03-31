package com.operaprima.services.dao.boards;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.dao.repositories.IBoardsRepository;

/**
 * @author diego.asensio
 * 
 */
public class BoardsDao implements IBoardsDao {
	@Autowired
	private IBoardsRepository boardsRepository;

	@Autowired
	private Mapper mapper;
}
