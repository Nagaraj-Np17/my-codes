package com.zsgs.librarymanagement.issuebook;

import java.util.List;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.managebook.ManageBookModel;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.User;

public class IssueBookModel {
	private IssueBookView issueBookView;
	private ManageBookModel manageBookModel;

	public IssueBookModel(IssueBookView issueBookView) {
		this.issueBookView = issueBookView;
	}

	public static boolean userAvailable(int userId) {
		User userData=(User) LibraryDatabase.getInstance().getAllUserData(userId);
		if(userData==null) {
				return false;
			}
		
		return true;
	}

	public void issueBook(BookIssue bookissue) {
		
		LibraryDatabase.getInstance().addIssueData(bookissue);
		issueBookView.showAlert("Book Issued Successfully");
		
	}
	

	public List<BookIssue> viewIssuedBookInfo() {
		List<BookIssue> issueData=LibraryDatabase.getInstance().getAllIssuedData();
		return issueData;
		
	}


	public void issueValidation(int userId, int bookId) {
		User user=LibraryDatabase.getInstance().getAllUserData(userId);
	if(user!=null) {
		Book book=LibraryDatabase.getInstance().getAllBooksData(bookId);
		if(book!=null) {
			if(book.getAvailableCount()>0) {
				BookIssue bookIssue = new BookIssue(bookId, userId);
				LibraryDatabase.getInstance().bookUpdate(book.getId(), book.getAvailableCount()-1);
				issueBook(bookIssue);
			}else {
				issueBookView.showAlert("Book Not Avalible Try Another Book:");
				issueBookView.init();
			}
		}else {
			issueBookView.showAlert("Invalid Book Id");
			issueBookView.init();
		}
	}else {
		issueBookView.showAlert("Invalid User");
		issueBookView.init();
	}
		
	}

	
	public void viewUserIssuedBook(int userId) {
		List<BookIssue> viewIssuedBook=LibraryDatabase.getInstance().getAllIssuedData(userId);
		if(viewIssuedBook!=null) {
			for(BookIssue bookIssue:viewIssuedBook) {
				issueBookView.showAlert(bookIssue);
			}		
		}else {
			issueBookView.showAlert("User Doesn't Take Any Book");
		}
	}

	public void returnIsseBook(int userId) {
		viewUserIssuedBook(userId);
		int issueId=issueBookView.getIssueId();
		LibraryDatabase.getInstance().getIssuedData(issueId);
	}

	

}
