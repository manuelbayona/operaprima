package com.operaprima.services.facade.boards;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaprima.services.business.boards.IIntBoardsService;
import com.operaprima.services.business.dtos.BoardIntDto;
import com.operaprima.services.facade.dtos.BoardDto;

/**
 * @author Stormtroopers
 *
 */
@Service("boardsService")
@Path("V01/boards")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class BoardsService implements IBoardsService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private IIntBoardsService iIntBoardsService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.boards.IBoardsService#addBoard(com.operaprima.services.facade.dtos.BoardDto)
	 */
	@Override
	@POST
	@Path("/")
	public BoardDto addBoard(final BoardDto board) {
		final BoardIntDto map = mapper.map(board, BoardIntDto.class);
		final BoardIntDto addBoard = iIntBoardsService.addBoard(map);
		return mapper.map(addBoard, BoardDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.boards.IBoardsService#getBoard(java.lang.String)
	 */
	@Override
	@GET
	@Path("/{id}")
	public BoardDto getBoard(@PathParam("id") final String id) {
		final BoardIntDto board = iIntBoardsService.getBoard(id);
		return mapper.map(board, BoardDto.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.operaprima.services.facade.boards.IBoardsService#updateBoard(com.operaprima.services.facade.dtos.BoardDto)
	 */
	@Override
	@PUT
	@Path("/")
	public BoardDto updateBoard(final BoardDto boardDto) {
		final BoardIntDto map = mapper.map(boardDto, BoardIntDto.class);
		final BoardIntDto updateBoard = iIntBoardsService.updateBoard(map);
		return mapper.map(updateBoard, BoardDto.class);
	}

}
