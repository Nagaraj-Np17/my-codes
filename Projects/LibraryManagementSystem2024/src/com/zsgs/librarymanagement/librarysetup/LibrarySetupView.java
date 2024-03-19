package com.zsgs.librarymanagement.librarysetup;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.user.UserView;

public class LibrarySetupView {
	private LibrarySetupModel librarySetupModel;

	public LibrarySetupView() {
		librarySetupModel = new LibrarySetupModel(this);
	}

	public void init() {
		librarySetupModel.startSetup();
	}

	public void onSetupComplete(Library  library) {
		System.out.println("\nLibrary setup already completed");
		System.out.println("\nLibrary setup completed\n");
		System.out.println("\nCurrent Library Name - " + library.getLibraryName());
		System.out.println("\nCurrent Library Id - " + library.getLibraryId());
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(
					"\n 1. Add Book\n 2. View Book\n 3. View Specfic Book  \\n 4. Add User \\n 5. GetUser\n 9. Logout \n 0. Exit \n Enter your Choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				new ManageBookView().initAdd();
				break;
			case 2:
				new ManageBookView().viewBook();
				break;
			case 3:				
				new ManageBookView().fetchBooks();
				break;
			case 4:
				new UserView().init();
				break;
			case 5:
				new UserView().getAllUser();
				break;
			case 6:
				System.out.println("\n-- You are logged out successfully -- \n\n");
				new LoginView().init();
				return; 
			case 0:
				System.out.println("\n-- Thanks for using " + LibraryManagement2024.getInstance().getAppName() + "---");
				return;
			default:
				System.out.println("\nPlease Enter valid choice\n");
			}
			}
		
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
