package com.actions;

import java.util.Map;

import com.dao.UserDAO;
import com.model.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginPageAction extends ActionSupport {
	private String username;
	private String password;
	private UserDAO userDAO;
	private Users userDTO;

	public String execute() {
		userDAO = new UserDAO();

		if (userDAO.userValidation(username, password)) {
			userDTO = userDAO.getUserInfo(username);
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("id", userDTO.getId());
			session.put("name", userDTO.getName());
			session.put("email", userDTO.getEmail());
			session.put("username", userDTO.getUserName());
			return SUCCESS;
		} else
			return ERROR;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
