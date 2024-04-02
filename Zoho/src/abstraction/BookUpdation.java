package abstraction;

import java.util.Scanner;

class Book{
	private String bookName;
	private int bookId;
	private int bookCount;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Book(String bookName, int bookId, int bookCount) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookCount = bookCount;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", bookCount=" + bookCount + "]";
	}
	
	
}
abstract class BookLibrary{
	
	String user="npr";String pass="123";
	abstract void bookUpdate();
}
public class BookUpdation extends BookLibrary{
	
	Scanner sc=new Scanner(System.in);
	void bookUpdate() {
		System.out.println("Enter The Book Name:");
		String name=sc.next(); 
		System.out.println("Enter The Book id:");
		int id=sc.nextInt(); 
		System.out.println("Enter The Book count:");
		int count=sc.nextInt(); 
		System.out.println("Verification...");
		if(validate()) {
			System.out.println("Authoriztion Success.. ");
			Book  book=new Book(name,id,count);
			System.out.println(book);
		}else {
			System.out.println("unauthorized member");
			}
		
	}

	
	private boolean validate() {
		System.out.println("Enter UserName:"+user);
		String uname=sc.next();
		System.out.println("Enter pass:"+pass);
		String upass=sc.next();
		if(uname.equals(user) && upass.equals(pass)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		BookUpdation lib=new BookUpdation();
		lib.bookUpdate();
	}

	
}
