package com.spring.boot.BlogApp.payloads;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.spring.boot.BlogApp.entities.Post;

public class CommentDto {
	
	public CommentDto(int comId, String content) {
		super();
		this.comId = comId;
		this.content = content;
	}
	private int comId;
	private String content;
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CommentDto() {
		super();
	
	}
	
	
}
