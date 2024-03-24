package com.zsgs.librarymanagement.datalayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.model.User;

public class LibraryDatabase {
private static  LibraryDatabase  libraryDatabase;
private Library library;
private List<Book> bookList = new ArrayList<>();
private List<User> userList = new ArrayList<>();
private List<BookIssue> issueList = new ArrayList<>();
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
	public Book getAllBooksData(int bookId) {		
		for(Book book:bookList) {
			if(book.getId()==bookId) {
				return  book;
		}
	}return null;
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
				book.setAvailableCount(count);	
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
	
/*	public boolean issueValidation(int userId,int bookid) {
	for(User user:userList) {
		if(user.getId()==userId) {
			for(Book book:bookList) {
				if(book.getId()==bookid) {
					if(book.getAvailableCount()>0) {
						book.setAvailableCount(book.getAvailableCount()-1);
						
					}else {
						return false;
					}
				}
			}
			return false;
		}
	}
	return false;
	}*/
	public void addIssueData(BookIssue issueData ) {
		issueList.add(issueData);
		
		return;
		
	}
	public List<BookIssue> getAllIssuedData() {
		return issueList;
	}
	public List<BookIssue>  getAllIssuedData(int userId) {
		List<BookIssue> userIssue=new ArrayList<>();
		for(BookIssue issue:issueList) {
			if(issue.getUserId()==userId && issue.getReturnDate()==null) {
				userIssue.add(issue);
			}
		}
		return userIssue;
	}
	
	public List<BookIssue>  getAllIssuedDataHistory(int userId) {
		List<BookIssue> userIssue=new ArrayList<>();
		for(BookIssue issue:issueList) {
			if(issue.getUserId()==userId && issue.getReturnDate()!= null) {
				userIssue.add(issue);
			}
		}
		return userIssue;
	}
	
	public void  getIssuedData(int issuseid) {
		Iterator<BookIssue> iterator = issueList.listIterator();
		
		while(iterator.hasNext()) {
			BookIssue cur = iterator.next();
			if(cur.getIssueId()==issuseid)
			{
				cur.setReturnDate(new Date());
				Book book = getAllBooksData(cur.getBookId());
				bookUpdate(book.getId(), book.getAvailableCount()+1);
				User user = getAllUserData(cur.getUserId());
				userUpdate(user.getId(),user.getbookTaken()-1);
			}
		}
	}
	public void userUpdate(int id, int count) {
		for(User user:userList) {
			if(user.getId()==id) {
				user.setbookTaken(count);
				
			}
		}
		
	}
	public String removeUserData(int userId) {
			String removeUser ="";
			for(User user:userList) {
				if(user.getId()==userId) {
					removeUser+=user.getName();
					bookList.remove(user);
					break;
				}
			}
			return removeUser;
	}
	
	
	
}
