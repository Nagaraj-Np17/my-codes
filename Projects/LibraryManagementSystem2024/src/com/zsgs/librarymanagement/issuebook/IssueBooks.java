package com.zsgs.librarymanagement.issuebook;

import java.util.List;
import java.util.Scanner;

import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.model.Book;

public class IssueBooks {
	
	private IssueBookModel issueBookModel;
	public IssueBooks() {
		issueBookModel=new IssueBookModel(this);
	}
	Scanner sc=new Scanner(System.in);
	public void init() {
	System.out.println("Enter The User Id");
	int userId=sc.nextInt();
	LoginView loginView=new LoginView();
	boolean Available=issueBookModel.userAvailable(userId);
	if(Available) {
		System.out.println("Enter The Book Id to Issue:");
		int bookId=sc.nextInt();
		boolean bookAvailable=issueBookModel.bookAvailable(bookId);
		if(bookAvailable) {
			issueBookModel.issueBook(userId,bookId);
		}else {
			loginView.showAlert("Invalid Id");
		}
		
	}else {
		loginView.showAlert("Invalid User");
		}
	}
//	public void returnBook() {
//		System.out.println("Enter The User Id");
//		int userId=sc.nextInt();
//		if(userIs)
//		
//	}
	public void viewIssueBook() {
		String alertissueBookModel.issueBoo()
		
	}
	
}
