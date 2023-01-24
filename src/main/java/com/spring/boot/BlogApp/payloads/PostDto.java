package com.spring.boot.BlogApp.payloads;

import java.util.Date;

import com.spring.boot.BlogApp.entities.Category;
import com.spring.boot.BlogApp.entities.User;

public class PostDto {
	
	public PostDto(String title, String content, String imageName, Date addedDate, Category categoryDto,
			UserDto userDto) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.categoryDto = categoryDto;
		this.userDto = userDto;
	}

	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	
	
	private Category categoryDto;
	
	private UserDto userDto;

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

	public Category getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(Category categoryDto) {
		this.categoryDto = categoryDto;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}



	

}
