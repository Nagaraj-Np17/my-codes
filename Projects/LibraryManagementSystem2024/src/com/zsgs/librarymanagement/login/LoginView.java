package com.zsgs.librarymanagement.login;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.librarysetup.LibrarySetupView;

public class LoginView {
	private LoginModel  loginModel;
	public LoginView() {
		loginModel =new LoginModel(this);
	}
	
	
	public void init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Please Login to proceed:");
		System.out.println("Enter The UserName");
		String userName=sc.next();
		System.out.println("Enter The Password");
		String password=sc.next();
		//sc.close();
		loginModel.validateUser(userName,password);
		
		
	}


	public void showAlert(String string) {
		System.out.println(string);
		
	}


	public void onSuccess() {
	System.out.flush();
	
	System.out.println("\n\nLogin successful...\n\n ---- welcome to " + LibraryManagement2024.getInstance().getAppName()
			+ " - v" + LibraryManagement2024.getInstance().getAppVersion() + "----");
	LibrarySetupView librarySetupView = new LibrarySetupView();
	librarySetupView.init();
}


}
