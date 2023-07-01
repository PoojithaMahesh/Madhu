package com.jsp.spring.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring.day3.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
