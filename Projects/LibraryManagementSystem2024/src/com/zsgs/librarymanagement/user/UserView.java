package com.zsgs.librarymanagement.user;

import java.util.List;
import java.util.Scanner;

import com.zsgs.librarymanagement.issuebook.IssueBookModel;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.User;

public class UserView {
	Scanner sc=new Scanner(System.in);

	private static UserModel userModel;
	public UserView() {
		this.userModel=new UserModel(this);
	}

	public void init() {
		User user=new User();
		System.out.println("Enter The User Name");
		user.setName(sc.next());
		System.out.println("Enter The EmailId Of User");
		user.setEmailId(sc.next());
		System.out.println("Enter The User PhoneNo");
		user.setPhoneNo(sc.next());
		System.out.println("Enter The User Address");
		user.setAddress(sc.next());		
		userModel.addUser(user);
		System.out.println();
		
	}

	public void onUserAdded(User user) {
		System.out.println("\n------- User '" + user.getName() + "' added successfully ------- \n");
		checkForAddNewUser();
		
	}
	private void checkForAddNewUser() {
		System.out.println("\nDo you want to add more User? \nType Yes/No");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			init();
		} else if (choice.equalsIgnoreCase("no")) {
			System.out.println("\n Thanks for adding User");
		} else {
			System.out.println("\nInvalid choice, Please enter valid choice.\n");
			checkForAddNewUser();
		}
	}
	public void getAllUser() {
		userModel.getAllUserInfo();
		
	}

	public void onUserExits(User user) {
			System.out.println("\n------- User '" + user.getName() + "' already exist -------\n");
		}

	public void viewUser() {
		
		
	}

	public void showAlert(Object string) {
	System.out.println(string);
	}

	public void removeUser() {
		System.out.println("Enter The User Id");
		int userId=sc.nextInt();
		userModel.getRemoveUser(userId);
		
	}

	
		
	}


