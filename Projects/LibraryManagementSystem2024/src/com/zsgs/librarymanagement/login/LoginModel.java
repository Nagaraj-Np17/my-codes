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
				retryOfNot();
			}
		} else {
			loginView.showAlert("Invalid User Name ");
				retryOfNot();
			}

	}
	public   void retryOfNot(){
		if(loginView.retryOfNot().equalsIgnoreCase("yes")){
			loginView.init();
		}else{
			System.out.println("Thank You \nApp Exiting....");
			System.exit(0);
		}
	}
	private boolean isValidUserName(String userName) {
		return userName.equals("zsgs");
	}

	private boolean isValidPassword(String password) {
		return password.equals("admin");
	}
}
