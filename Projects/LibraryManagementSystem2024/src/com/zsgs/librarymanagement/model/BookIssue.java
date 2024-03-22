package com.zsgs.librarymanagement.model;

import java.util.Date;

public class BookIssue {
	//private static int issueCount=0;
	//private int issueId;
	private String bookId;
	private String issueBookName;
	private Date issueDate;
	public BookIssue(int issueId, String bookId, String issueBookName, Date issueDate, Date returnDate) {
		super();
		//this.issueId = issueId;
		this.bookId = bookId;
		this.issueBookName = issueBookName;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}
/*	public int getIssueId() {
		//turn issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}*/
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getIssueBookName() {
		return issueBookName;
	}
	public void setIssueBookName(String issueBookName) {
		this.issueBookName = issueBookName;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	private Date  returnDate;
	
	


}
