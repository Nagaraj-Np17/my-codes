package assignmentConstructorAndInheritance;

import java.util.Date;
import java.util.List;

class User {
	private String Name;
	private int id;

	public void verify() {

	}

	public void checkAccount() {

	}

	public List<Book> get_Book_Info() {
		return null;

	}

}

class Staff extends User {
	private String dept;
}

class SchoolStudent extends User {
	private String standard;
}

class Account {
	int no_Borrowed_Books;
	int no_reserved_Books;
	int no_returned_Books;
	int no_lost_Books;
	double fine_Amount;

	public void calculate_Fine() {

	}

}

//------------------------------------------------

class LibraryBook {
	private String title;
	private String author;
	private String ISBN;
	private String publication;

	public void show_dueDt() {

	}

	public void reservation_Status() {
	}

	public void feedBack() {
	}

	public void book_request() {
	}

	public void rnew_Info() {
	}

}

class Librarian {
	private String name;
	private int id;
	private String password;
	private String searchString;

	public void verify_Librarian() {

	}

	public void search() {

	}

}

class libraryDatabase {
	private List<Book> List_of_books;

	public void add(Book book) {

	}

	public void delete(int id) {

	}

	public void update(int id, int count) {

	}

	public void display() {

	}

	public Book search(int bookId) {
		return null;
	}
}

public class LibraryManagementSystem {
	public static void main(String[] args) {

	}
}
