package com.zsgs.librarymanagement.librarysetup;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.homepage.HomePage;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.user.UserView;

public class LibrarySetupView {
	Scanner sc = new Scanner(System.in);
	private LibrarySetupModel librarySetupModel;

	public LibrarySetupView() {
		librarySetupModel = new LibrarySetupModel(this);
	}

	public void init() {
		librarySetupModel.startSetup();
	}

	public void onSetupComplete(Library  library) {
		System.err.println("\nLibrary setup completed\n");
		System.err.println("\n|------ Library Details ------|\n");
		System.out.println("\nLibrary Name      =" + library.getLibraryName());
		System.out.println("\nLibrary Id        =" + library.getLibraryId());
		System.out.println("\nLibrary Email     =" + library.getEmailId());
		System.out.println("\nLibrary PhoneNo   =" + library.getPhoneNo());
		System.out.println("\nLibrary Address   =" + library.getAddress());
		System.out.println("");
		HomePage homePage=new HomePage();
		homePage.init();
		
	}

	public void showAlert(String alert) {
		System.out.println("\nPrint any errors here.");
	}

	public void initiateSetup() {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		System.out.println("\n\nEnter library details:");
		System.out.println("\nEnter library name:");
		library.setLibraryName(scanner.nextLine());
		System.out.println("\nEnter library email:");
		library.setEmailId(scanner.nextLine());
		System.out.println("\nEnter The Phone no:");
		library.setPhoneNo(scanner.nextLine());
		System.out.println("\nEnter Library Address :");
		library.setAddress(scanner.nextLine());
		
		librarySetupModel.createLibrary(library);
	}

}
