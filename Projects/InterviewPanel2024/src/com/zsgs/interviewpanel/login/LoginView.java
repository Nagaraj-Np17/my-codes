package com.zsgs.interviewpanel.login;

import java.util.Scanner;


public class LoginView {
	private LoginModel loginModel;

	public LoginView() {
		loginModel = new LoginModel(this);
	}

	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please Login to proceed:");
		System.out.println("Enter The UserName");
		String userName = sc.next();
		System.out.println("Enter The Password");
		String password = sc.next();
		sc.close();
		loginModel.validateUser(userName, password);

	}

	public void showAlert(String string) {
		System.out.println(string);

	}

	public void onSuccess() {
		System.out.println("Success");

	}

}
