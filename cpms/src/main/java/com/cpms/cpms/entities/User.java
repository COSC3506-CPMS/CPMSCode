package com.cpms.cpms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class User {
	@Id
	private int userID;
	
	@Column(nullable = false, length = 50)
	private String userName;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String role;
	
	@Column(nullable = false)
	private String permissions;	
	
    
	// Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPermissions() {
		return permissions;
	}
	
	public void setPermissions() {
		this.permissions = permissions;
	}
	
}
