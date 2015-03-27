package com.operaprima.dao.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adesis
 *
 */
@Document(collection="users")
public class UserEntity {

	@Id
	private String id;
	
	private String username;
	private String publicPassword;
	
	
	
	public UserEntity(String username, String publicPassword) {
		super();
		this.username = username;
		this.publicPassword = publicPassword;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUsername(String userName) {
		this.username = userName;
	}
	/**
	 * @return the publicPassword
	 */
	public String getPublicPassword() {
		return publicPassword;
	}
	/**
	 * @param publicPassword the publicPassword to set
	 */
	public void setPublicPassword(String publicPassword) {
		this.publicPassword = publicPassword;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username
				+ ", publicPassword=" + publicPassword + "]";
	}
	
	
}
