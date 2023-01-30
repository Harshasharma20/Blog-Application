package com.spring.boot.BlogApp.service;

import com.spring.boot.BlogApp.payloads.CommentDto;

public interface CommentService {
	
	public CommentDto createComment(CommentDto commentDto,Integer postId);
	
	public void deleteComment(Integer commentId); 
}
