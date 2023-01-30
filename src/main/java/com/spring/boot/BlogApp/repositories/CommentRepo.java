package com.spring.boot.BlogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.BlogApp.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer>{

}
