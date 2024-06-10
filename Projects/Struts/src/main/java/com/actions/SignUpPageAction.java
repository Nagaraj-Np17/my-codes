package com.actions;

import com.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SignUpPageAction extends ActionSupport {
	private String name;
	private String email;
	private String userName;
	private String password;
	private UserDAO userDataModel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String execute() {
		userDataModel = new UserDAO();
		if (userDataModel.addUser(name, email, userName, password)) {
			return "success";
		} else {
			return "error";
		}

	}

}
