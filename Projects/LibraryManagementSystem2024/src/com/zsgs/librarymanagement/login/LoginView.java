package com.zsgs.librarymanagement.login;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.librarysetup.LibrarySetupView;

public class LoginView {
	Scanner sc=new Scanner(System.in);
	private LoginModel  loginModel;
	public LoginView() {
		loginModel =new LoginModel(this);
	}
	
	
	public void init() {
		
		System.err.println("\nPlease  Login to proceed:");
		System.out.println("Enter The UserName");
		String userName=sc.next();
		System.out.println("Enter The Password");
		String password=sc.next();
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


	public String retryOfNot() {
		System.out.println("Are You Want To Retry :Yes/No");
		String result=sc.next();
		return result;
	}


}
