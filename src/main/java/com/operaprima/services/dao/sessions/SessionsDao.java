package com.operaprima.services.dao.sessions;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.operaprima.commons.utils.dozer.IDozerUtils;
import com.operaprima.services.business.dtos.SessionIntDto;
import com.operaprima.services.business.dtos.SessionsIntDto;
import com.operaprima.services.repositories.ISessionsRepository;
import com.operaprima.services.repositories.entities.SessionEntity;

/**
 * @author Dartboard
 *
 */
@Repository
@Primary
public class SessionsDao implements ISessionsDao {
	@Autowired
	private ISessionsRepository sessionsRepository;

	@Autowired
	private IDozerUtils dozerUtils;

	@Override
	public SessionIntDto addSession(final SessionIntDto session) {
		SessionEntity entity = (SessionEntity) dozerUtils.classMapper(session, SessionEntity.class);
		entity = sessionsRepository.save(entity);
		session.setId(entity.getId().toString());
		return session;
	}

	@Override
	public SessionIntDto getSession(final String id) {
		final SessionEntity sessionEntity = sessionsRepository.findOne(new ObjectId(id));
		final SessionIntDto session = (SessionIntDto) dozerUtils.classMapper(sessionEntity, SessionIntDto.class);
		return session;
	}

	@Override
	public SessionIntDto updateSession(final SessionIntDto session) {
		final SessionEntity entity = (SessionEntity) dozerUtils.classMapper(session, SessionEntity.class);
		sessionsRepository.save(entity);
		return session;
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public SessionsIntDto listSessions() {

		final List<SessionEntity> listDB = (List<SessionEntity>) sessionsRepository.findAll();

		if (listDB == null) {
			return null;
		}

		final SessionsIntDto sessionsIntDto = new SessionsIntDto();
		sessionsIntDto.setSessions((List<SessionIntDto>) dozerUtils.listMapper(listDB, SessionIntDto.class));
		return sessionsIntDto;
	}

}
