package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private long id;
	private String username;
	private String userpassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String username, String userpassword) {
		super();
		this.id = id;
		this.username = username;
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
}
