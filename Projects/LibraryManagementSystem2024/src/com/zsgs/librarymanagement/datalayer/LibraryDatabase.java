package com.zsgs.librarymanagement.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.model.User;

public class LibraryDatabase {
private static  LibraryDatabase  libraryDatabase;
private Library library;
private List<Book> bookList = new ArrayList();
private List<User> userList = new ArrayList();

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
	
	public List<Book> getAllBooks() {
		return bookList;
	}
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

	
	
	
	
	
}
