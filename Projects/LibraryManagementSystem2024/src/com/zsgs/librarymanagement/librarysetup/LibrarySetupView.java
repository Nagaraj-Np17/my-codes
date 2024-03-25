package com.zsgs.librarymanagement.librarysetup;

import java.util.Scanner;
//import com.zsgs.librarymanagement.validator;
import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.homepage.HomePage;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.user.UserView;
import com.zsgs.librarymanagement.validator.Validator;

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
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		String name;
		
		System.out.println("\nEnter library details:");
		do {
			System.out.println("\nEnter library name:");
			name = sc.nextLine();
		}while(!Validator.validateName(name));
		library.setLibraryName(name);
		String phoneNo;
		do {
		System.out.println("\nEnter valid PhoneNo:");
		phoneNo=sc.next();
		}while(!Validator.validatePhoneNo(phoneNo));
		
		library.setPhoneNo(phoneNo);
		String mail;
		do {
			System.out.println("\nEnter valid library Email:");;
			mail=sc.next();
			}while(!Validator.validateEmail(mail));
		
		library.setEmailId(mail);

		sc.nextLine();

		System.out.println("\nEnter Library Address :");
		library.setAddress(sc.nextLine());
		
		librarySetupModel.createLibrary(library);
	}

}
