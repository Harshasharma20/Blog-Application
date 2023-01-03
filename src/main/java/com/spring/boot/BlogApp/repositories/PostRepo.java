package com.spring.boot.BlogApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.BlogApp.entities.Category;
import com.spring.boot.BlogApp.entities.Post;
import com.spring.boot.BlogApp.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
