package com.operaprima.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * @author Adesis
 *
 */
@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "operaPrimaDB";
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoCredential mongoCredential = MongoCredential.createCredential("operaPrima", "operaPrimaDB", "12345678".toCharArray());
		
		MongoClient mongoClient = new MongoClient(new ServerAddress("192.168.1.111"), Arrays.asList(mongoCredential));
		
		return mongoClient;
	}

}
