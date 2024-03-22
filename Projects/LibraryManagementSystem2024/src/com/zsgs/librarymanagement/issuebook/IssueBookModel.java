package com.zsgs.librarymanagement.issuebook;

import java.util.List;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.managebook.ManageBookModel;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.User;

public class IssueBookModel {
	private IssueBooks issueBooks;
	private ManageBookModel manageBookModel;

	public IssueBookModel(IssueBooks issueBooks) {
		this.issueBooks = issueBooks;
	
	}

	public static boolean userAvailable(int userId) {
		User userData=(User) LibraryDatabase.getInstance().getAllUserData(userId);
		if(userData==null) {
				return false;
			}
		
		return true;
	}

	public void issueBook(int userId, int bookId) {
		LibraryDatabase.getInstance().getAllBooksData(bookId);
		
		
	}

	public boolean bookAvailable(int bookId) {
		List<Book> issueData=LibraryDatabase.getInstance().getAllBooksData(bookId);
		if(issueData == null) {
			return false;
		}else {
			LibraryDatabase.getInstance().addIssueData((BookIssue)issueData);
			return true;
		}
		
	}

}
