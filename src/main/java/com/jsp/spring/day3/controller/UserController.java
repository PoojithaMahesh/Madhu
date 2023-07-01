package com.jsp.spring.day3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring.day3.dao.UserDao;
import com.jsp.spring.day3.dto.User;

import antlr.collections.List;

@RestController
public class UserController {

	@Autowired
	private UserDao dao;

	@PostMapping("/save")
	public User idontwanttogive(@RequestBody User user) {
		return dao.saveUser(user);
	}
	@GetMapping("/get")
	public User jhfutfu(@RequestParam int id) {
		return dao.findUserById(id);
	}
	@DeleteMapping("/delete")
	public User deleteUser(@RequestParam int id) {
		return dao.deleteUserById(id);
	}
	@GetMapping("/findall")
	public java.util.List<User> findAllUser(){
		return dao.findAllUser();
	}
	
	

}
