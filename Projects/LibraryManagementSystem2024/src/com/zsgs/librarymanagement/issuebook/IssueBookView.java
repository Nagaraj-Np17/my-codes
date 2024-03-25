package com.zsgs.librarymanagement.issuebook;

import java.util.List;
import java.util.Scanner;

import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.User;

public class IssueBookView {
	
	private IssueBookModel issueBookModel;
	public IssueBookView() {
		issueBookModel=new IssueBookModel(this);
	}
	Scanner sc=new Scanner(System.in);
	
	public void init() {
	System.out.println("Enter The User Id");
	int userId=sc.nextInt();
	System.out.println("Enter The Book Id");
	int bookId=sc.nextInt();
	issueBookModel.issueValidation(userId,bookId);

	}
	public void viewIssuedBook() {
		issueBookModel.viewIssuedBookInfo();
	}
	public void showAlert(Object string) {
		System.out.println(string);
		
	}
	public void returnBook() {
		System.out.println("Enter The UserId");
		int userId=sc.nextInt();
		issueBookModel.returnIsseBook(userId);
		
	}
	public void viewUserIssuedBook() {
		System.out.println("Enter The UserId");
		int userId=sc.nextInt();
		issueBookModel.viewUserIssuedBook(userId);
		
	}
	public int getIssueId() {
		System.out.println("Enter The IssueId");
		int issueId=sc.nextInt();
		return issueId;
		
	}
	
	public String retryOfNot() {
		System.out.println("Are You Want To Continue :Yes/No");
		String result=sc.next();
		return result;
	}
	
	
}
