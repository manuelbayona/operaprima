package com.operaprima.services.dao.subjects;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.operaprima.services.dao.repositories.ISubjectsRepository;

/**
 * @author diego.asensio
 * 
 */
public class SubjectsDao implements ISubjectsDao {
	@Autowired
	private ISubjectsRepository subjectsRepository;
	@Autowired
	private Mapper mapper;
}
