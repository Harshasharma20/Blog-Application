package com.spring.boot.BlogApp.payloads;

import java.util.Date;

import com.spring.boot.BlogApp.entities.Category;
import com.spring.boot.BlogApp.entities.User;

public class PostDto {
	
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	
	
	private Category category;
	
	private User user;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PostDto(String title, String content, String imageName, Date addedDate, Category category, User user) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}

	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}