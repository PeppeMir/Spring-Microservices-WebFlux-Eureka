package com.example.microservices.userservice.model.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class UserDocument {
	@Id
	private String id;
	private String username;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

}
