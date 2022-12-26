package com.spring.boot.BlogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.BlogApp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
