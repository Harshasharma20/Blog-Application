package com.spring.boot.BlogApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int comId;
	
	private String content;
	
	@ManyToOne
	private Post post;

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

	public Post getPost() {
		return post;
	}
	
	public void setPost(Post post) {
		this.post = post;
	}

	public Comment(int comId, String content, Post post) {
		super();
		this.comId = comId;
		this.content = content;
		this.post = post;
	}

	public Comment() {
		super();
		
	}
	
	

}
