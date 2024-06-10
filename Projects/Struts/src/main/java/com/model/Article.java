package com.model;

import java.sql.Date;
public class Article {
	private String title;
	private String imageURl;
	private String content;
	private int userId;
	public Article() {
		
	}
	public Article( String name,String title, String imageURl, String content,  Date uploadedDate,int userId) {
		super();
		this.title = title;
		this.imageURl = imageURl;
		this.content = content;
		this.userId = userId;
		this.uploadedDate = uploadedDate;
		this.name = name;
	}
	private Date uploadedDate;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageURl() {
		return imageURl;
	}
	public void setImageURl(String imageURl) {
		this.imageURl = imageURl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}
	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}



}
