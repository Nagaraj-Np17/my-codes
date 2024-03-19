package com.zsgs.librarymanagement.model;

public class User {
	private int id;
	private String name;
	private String emailId;
	private String phoneNo;
	private String address;
	private int due=10;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDue() {
		return due;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", address="
				+ address + ", due=" + due + "]";
	}
	
	
	
}
