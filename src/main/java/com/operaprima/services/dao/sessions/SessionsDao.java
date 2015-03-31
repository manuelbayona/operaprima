package com.operaprima.services.dao.sessions;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.dao.repositories.ISessionsRepository;

/**
 * @author diego.asensio
 * 
 */
public class SessionsDao implements ISessionsDao {
	@Autowired
	private ISessionsRepository sessionsRepository;

	@Autowired
	private Mapper mapper;
}
