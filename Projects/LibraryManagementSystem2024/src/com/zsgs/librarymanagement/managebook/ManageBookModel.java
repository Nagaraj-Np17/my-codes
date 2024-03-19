package com.zsgs.librarymanagement.managebook;

import java.util.ArrayList;
import java.util.List;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.model.Book;

public class ManageBookModel {
	private ManageBookView manageBookView;

	ManageBookModel(ManageBookView manageBookView) {
		this.manageBookView = manageBookView;
	}
		public void addNewBook(Book book) {
			if (LibraryDatabase.getInstance().insertBook(book)) {
				manageBookView.onBookAdded(book);
			} else {
				manageBookView.onBookExist(book);
			}
		
	}
		public List<Book> getAllBooks () {
			List<Book>  bookInfo=LibraryDatabase.getInstance().getAllBooks();	
			return bookInfo;
		}
		public void updateBookCount(int id, int count) {
			List<Book> bookInfo=LibraryDatabase.getInstance().getAllBooks();
			
			for(Book book:bookInfo) {
				if(book.getId()==(id)) {
					book.setAvailableCount(book.getAvailableCount()+count);
					
				}else {
					manageBookView.showAlert("Invalid Id");
				}
			}
			
		}
		public List<Book> getSearchBooks(String name) {
			List<Book>  bookInfo=LibraryDatabase.getInstance().getAllBooks();
			List<Book> fetchBooksByName=new ArrayList<>();
			for(Book book:bookInfo) {
				if(book.getName().contains(name)) {
					fetchBooksByName.add(book);
				}
			}
			
			return fetchBooksByName;
			
			
		}
		
		
}
