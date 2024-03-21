package com.zsgs.librarymanagement.homepage;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.user.UserView;

public class HomePage {
private static HomePage homePage;
	public  static HomePage getInstance() {
		if(homePage==null) {
			HomePage homePage=new HomePage();
		}
		return homePage;
	}
	Scanner  sc=new Scanner(System.in);
	
	public void init() {
		System.err.println("|---------  Main Menu  ---------|");
		while (true) {
			System.out.println("\n 1. Book Management \n 2. User Management \n 3. 4. Logout \n 7.\n 0. Exit \n Enter your Choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookManagement();
				new ManageBookView().initAdd();
				break;
			case 2:
				new UserView().getAllUser();
				break;
			case 6:
				
			case 7:
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

	private void bookManagement() {
		System.err.println("\n|------ Sub Menu ------|\n");
		System.out.println
		("\n 1.Add Book \n 2.View All Book \n 3. View Book ID \n 4.Update Book Count "
				+ "\n 5. Remove Book \n 6.Return to Main Menu \n Enter The Your Choice:");
		int choice=sc.nextInt();
		while (true) {
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
				new ManageBookView().UpdateBookCount();
				break;
			case 6:
				new UserView().init();
				break;				
			case 7:
				System.out.println("\n-- You are logged out successfully -- \n\n");
				new LoginView().init();
				return; 
			default:
				System.out.println("\nPlease Enter valid choice\n");
				}
		}
		
	}
	
	
	
}
