package com.jsp.spring.day3.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring.day3.dto.User;
import com.jsp.spring.day3.repository.UserRepo;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepo repo;
//	inside this repo your all the methods are present
	
	public User saveUser(User user) {
//		you guys want some method to persist your data???
//		where is that method?
//		whether it is from your EntityManger
//		No
//		In springs we are having Somebody who is going to give me all the methods to perform crud operation
//		that is your JPA REPOSITORY
//		to access this JPaRepository
//		You need to cReate one interface which extends that jpaRepository
//		Now your methods to perfrom all your crud operation is inside your created interface
//		how to access that method which is present in created interface
//		WIth the help of your referenceVariable
//		How to access that reference variable that is with your autowired
//		@Autowired UserRepo userRepo;
//		with the help of this reference variable i can access all the methods to perform crud operation
		return repo.save(user);
		
	}

	public User findUserById(int id) {
	    Optional<User> userOptional=repo.findById(id);
	   return userOptional.get();
	}

	public User deleteUserById(int id) {
		User user= repo.findById(id).get();
		repo.delete(user);
		return user;
	}

	public List<User> findAllUser() {
	     List<User> list= repo.findAll();
		return list;
	}

}
