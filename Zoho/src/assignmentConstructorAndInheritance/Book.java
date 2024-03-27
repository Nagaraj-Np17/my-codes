package assignmentConstructorAndInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookInfo{
	private String bookName;
	private String author;
	private short pages;
	private String ISBN;
	private double price;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public short getPages() {
		return pages;
	}
	public void setPages(short pages) {
		this.pages = pages;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BookInfo [bookName=" + bookName + ", author=" + author + ", pages=" + pages + ", ISBN=" + ISBN
				+ ", price=" + price + "]";
	}
	
	
}
class Bookadd{
	List<BookInfo>book=new ArrayList<>();

	public List<BookInfo> getBook() {
		return book;
	}

	public void setBook(List<BookInfo> book) {
		this.book = book;
	}
	
	public void printBookInfo()
	{
		System.out.println(book);
	}
	
}
public class Book{
	
public static void main(String[] args) {
		BookInfo bookInfo=new BookInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book Name:");
		bookInfo.setBookName(sc.next());
		System.out.println("Enter The Author Name:");
		bookInfo.setAuthor(sc.next());
		System.out.println("Enter The ISBN:");
		bookInfo.setAuthor(sc.next());
		System.out.println("Enter The Price:");
		bookInfo.setPrice(sc.nextDouble());
		System.out.println(bookInfo);
	}
}
