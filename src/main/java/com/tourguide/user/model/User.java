package com.tourguide.user.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private UUID id;
	private String userName;
	private String phoneNumber;
	private String emailAddress;
	

	public User() {
		super();
	}
	
	public User(UUID id, String userName, String phoneNumber, String emailAddress) {
		super();
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}
