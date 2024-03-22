package com.zsgs.librarymanagement.homepage;

import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement2024;
import com.zsgs.librarymanagement.issuebook.IssueBookModel;
import com.zsgs.librarymanagement.issuebook.IssueBooks;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.user.UserView;

public class HomePage {
private static HomePage homePage;
	public  static HomePage getInstance() {
		if(homePage==null) {
			homePage=new HomePage();
		}
		return homePage;
	}
	Scanner  sc=new Scanner(System.in);
	
	public void init() {
		
		while (true) {
			System.out.println(
				    "+----------------------------------+\n" +
				    "|---------  Main Menu  ---------|\n" +
				    "|                                  |\n" +
				    "| 1. Book Management               |\n" +
				    "| 2. User Management               |\n" +
				    "| 3. Logout                        |\n" +
				    "| 4. Issue Book                    |\n" +
				    "| 5. Book Return                   |\n" +
				    "| 0. Exit                          |\n" +
				    "| Enter your Choice:               |\n" +
				    "+----------------------------------+"
				);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookManagement();
				new ManageBookView().initAdd();
				break;
			case 2:
				new UserView().init();
				break;
			case 3:
				new LoginView().init();
				return; 
			case 4:
				new  IssueBooks ().init();
				break; 
			case 5:
				new  IssueBooks ().viewIssueBook();
				break; 
			case 0:
				System.out.println("\n-- Thanks for using " + LibraryManagement2024.getInstance().getAppName() + "---");
				return;
			default:
				System.out.println("\nPlease Enter valid choice\n");
				}
			}	
		
	}

	public void bookManagement() {
		
		while (true) {
			System.err.println("\n|------ Sub Menu ------|\n");
			System.out.println
			("\n1.Add Book\n 2.View all Book\n3.View Specific Book\n4.Search Book By Name\n5.Update Book Count "
					+ "\n6.Remove Book\n7.Return to Main Menu\nEnter The Your Choice:");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				new ManageBookView().initAdd();
				break;
			case 2:
				new ManageBookView().viewBook();
				break;
			case 3:				
				new ManageBookView().viewBookByID();
				break;
			case 4:				
				new ManageBookView().fetchBooks();
				break;
			case 5:				
				new ManageBookView().UpdateBookCount();
				break;
			case 6:				
				new ManageBookView().removeBook();
				break;
			case 7:
				init();
				break;				
			case 8:
				System.out.println("\n-- You are logged out successfully -- \n\n");
				new LoginView().init();
				return; 
			default:
				System.out.println("\nPlease Enter valid choice\n");
				}
		}
		
	}
	
	
	
}
