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
			return LibraryDatabase.getInstance().getAllBooksData();	
		}
		public void updateBookCount(int id, int count) {
				if(LibraryDatabase.getInstance().bookUpdate(id, count)) {
					manageBookView.showAlert("Book Update Successfully");
				}else {
					manageBookView.showAlert("There Is No Book In This "+id);
				}
			
						
		}
		public List<Book> getSearchBooks(String name) {
			List<Book>  bookInfo=LibraryDatabase.getInstance().getAllBooksData();
			List<Book> fetchBooksByName=new ArrayList<>();
			for(Book book:bookInfo) {
				if(book.getName().contains(name)) {
					fetchBooksByName.add(book);
				}
			}
			
			return fetchBooksByName;
			
			
		}
		public void removeBook(int id) {
			String removeBook=LibraryDatabase.getInstance().removeBookById(id);
			if(removeBook.length()!=0) {
				manageBookView.showAlert("Book "+removeBook+" is Removed Succesful");
			}else {
				manageBookView.showAlert("Invalid Id");
			}
			
			}
		public void getBookById(int id) {
			List<Book> bookInfo=LibraryDatabase.getInstance().getAllBooksData();
			for(Book book:bookInfo) {
				if(book.getId()==id) {
					manageBookView.showAlert( book);
				
			}
		if(bookInfo==null || bookInfo.size()==0) {
			manageBookView.showAlert("There Is No Book Avalible In This id ="+id);	
		}
			
		}
	
		}
		
}