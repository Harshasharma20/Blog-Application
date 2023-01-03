package com.spring.boot.BlogApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.BlogApp.entities.Post;
import com.spring.boot.BlogApp.payloads.PostDto;


public interface PostService {
	
	//create	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	//update
	Post updatePost(PostDto postDto,Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	List<Post> getAllPost();
	
	//get single post
	Post getPostById(Integer postId);
	
	//get all post by category
	List<Post> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<Post> getPostsByUser(Integer userId);
	
	//search post
	List<Post> searchPosts(String keyword);

}
