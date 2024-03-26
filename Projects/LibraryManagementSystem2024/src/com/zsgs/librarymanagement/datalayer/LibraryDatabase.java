package com.zsgs.librarymanagement.datalayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.google.gson.reflect.TypeToken;
//import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.model.Book;
import com.zsgs.librarymanagement.model.BookIssue;
import com.zsgs.librarymanagement.model.Credentials;
import com.zsgs.librarymanagement.model.Library;
import com.zsgs.librarymanagement.model.User;
import com.zsgs.librarymanagement.serialize.JsonSerialize;

public class LibraryDatabase {
private static  LibraryDatabase  libraryDatabase;
private Library library;
private Credentials credentials;
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
			serializeBookList();
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
			serializeUserList();
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
	
	public void addIssueData(BookIssue issueData ) {
		issueList.add(issueData);
		serializeIssueList();
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
	//--------------------------------------------------------------------------------------//
	
	 public void serializeBookList() {
	        JsonSerialize.getJsonSerialize().serialize(bookList,"src/com/zsgs/librarymanagement/data/bookList.json");
	        System.out.println("Booklist Serialized");
	    }
	 public void serializeUserList() {
	        JsonSerialize.getJsonSerialize().serialize(userList,"src/com/zsgs/librarymanagement/data/userList.json");
	        System.out.println("Userlist Serialized");
	 }
	 public void serializeIssueList() {
	        JsonSerialize.getJsonSerialize().serialize(issueList,"src/com/zsgs/librarymanagement/data/issueList.json");
	        System.out.println("IssueList Serialized");
	 }
	 
	 public void deserializeBookList()
	 {
		 List<Book> booklist = JsonSerialize.getJsonSerialize().deserialize("src/com/zsgs/librarymanagement/data/bookList.json", new TypeToken<List<Book>>() {});
		 this.bookList = booklist;
	 }
	 public void deserializeUserList()
	 {
		 List<User> userList = JsonSerialize.getJsonSerialize().deserialize("src/com/zsgs/librarymanagement/data/userList.json", new TypeToken<List<User>>() {});
		 this.userList = userList;
	 }
	 public void deserializeIssueList()
	 {
		 List<BookIssue> issueList = JsonSerialize.getJsonSerialize().deserialize("src/com/zsgs/librarymanagement/data/issueList.json", new TypeToken<List<BookIssue>>() {});
		 this.issueList = issueList;
	 }
	 
	 public void getFromDB() {
		 deserializeBookList();deserializeUserList();deserializeIssueList();
	 }
	
}
