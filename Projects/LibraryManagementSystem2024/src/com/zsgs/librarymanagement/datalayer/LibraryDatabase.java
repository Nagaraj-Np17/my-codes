package com.zsgs.librarymanagement.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.model.User;

public class LibraryDatabase {
private static  LibraryDatabase  libraryDatabase;
private Library library;
private List<Book> bookList = new ArrayList();
private List<User> userList = new ArrayList();
private List<BookIssue> issueList = new ArrayList();
	public static LibraryDatabase getInstance() {
		if(libraryDatabase==null) {
			libraryDatabase=new LibraryDatabase();
		}
		return libraryDatabase;
	}
	public Library getLibrary() {	
		return library;
	}
	

	public Library insertLibrary(Library library) {
	this .library=library;
	this.library.setLibraryId(1);
	return library;
	}
//------------------------ View Book Info--------------------------------//
	public List<Book> getAllBooksData() {
		return bookList;
	}
//------------------------ Insert Book--------------------------------//
	public boolean insertBook(Book book) {
		boolean hasBook = false;
		for (Book addedBook : bookList) {
			if (addedBook.getName().equals(book.getName()) && addedBook.getAuthor().equals(book.getAuthor())&& addedBook.getEdition().equals(book.getEdition())) {
				hasBook = true;
				break;
			}
		}
		if (hasBook) {
			return false;
		} else {
			bookList.add(book);
			return true;
		}
	}
//------------------------ Update Book Info--------------------------------//	
	public boolean bookUpdate(int id, int count) {

		for(Book book:bookList) {
			if(book.getId()==id) {
				book.setAvailableCount(book.getAvailableCount()+count);	
				return true;
			}
		}
		return false;
	}
//------------------------ Remove Book Info--------------------------------//	
	public String removeBookById(int id) {
		String removeBook ="";
		for(Book book:bookList) {
			if(book.getId()==id) {
				removeBook+=book.getName();
				bookList.remove(book);
				break;
			}
		}
		return removeBook;
	}
	
//-------------------------------------------------------------------------------------//	
	
//-------------------------------User Data------------------------------------------------//
	
	public boolean insertUser(User user) {
		boolean hasUser=false;
		for(User addedUser: userList) {
			if(addedUser.getId()==user.getId()) {
				hasUser=true;
			}
		}
		if (hasUser) {
			return false;
		} else {
			userList.add(user);  
			return true;
		}
	}
	
	
	
	public List<User> getAllUserData() {
		return userList;
		
	}
	public User getAllUserData(int id) {
		for(User user:userList) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;		
	}
	
	public List<Book> getAllBooksData(int bookid) {
		for(Book book:bookList) {
			if(book.getId()==bookid) {
				if(book.getAvailableCount()>0) {
					return bookList;
				}
			}
		}
		return null;
	}
	public void addIssueData(BookIssue issueData ) {
		 issueList.add(issueData);
		return;
		
	}
	
	
	
	
	
}
