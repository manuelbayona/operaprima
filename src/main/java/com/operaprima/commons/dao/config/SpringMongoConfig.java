package com.operaprima.commons.dao.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * @author Stormtroopers
 *
 */
@Configuration
@EnableMongoRepositories("com.operaprima.services.repositories")
public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Value("${mongo.db.name}")
	private String dataBaseName;

	@Value("${mongo.db.user}")
	private String userDB;

	@Value("${mongo.db.password}")
	private String passwordDB;

	@Value("${mongo.host.name}")
	private String hostUrl;

	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDatabaseName() {
		return dataBaseName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Mongo mongo() throws Exception {
		final MongoCredential mongoCredential = MongoCredential.createCredential(userDB, dataBaseName, passwordDB.toCharArray());

		final MongoClient mongoClient = new MongoClient(new ServerAddress(hostUrl), Arrays.asList(mongoCredential));

		return mongoClient;
	}

	/**
	 * @return MongoOperations
	 */
	@Bean
	public MongoOperations createMongoOperation() {
		return (MongoOperations) applicationContext.getBean("mongoTemplate");
	}

}
