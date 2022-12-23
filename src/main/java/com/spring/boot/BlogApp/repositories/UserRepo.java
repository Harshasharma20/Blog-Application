package com.spring.boot.BlogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.BlogApp.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
