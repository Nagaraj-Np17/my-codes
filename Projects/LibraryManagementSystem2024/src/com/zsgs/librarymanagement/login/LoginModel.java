package com.zsgs.librarymanagement.login;

public class LoginModel {
	private LoginView loginView;

	public LoginModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public void validateUser(String userName, String password) {
		if (isValidUserName(userName)) {
			if (isValidPassword(password)) {
				loginView.onSuccess();
			} else {
				loginView.showAlert("Invalid Password");
			}
		} else {
			loginView.showAlert("Invalid User Name ");
		}

	}

	private boolean isValidUserName(String userName) {
		return userName.equals("zsgs");
	}

	private boolean isValidPassword(String password) {
		return password.equals("admin");
	}
}
