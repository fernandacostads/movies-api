package com.lead.dell.movies.controller;

import com.lead.dell.movies.repository.UserRepository;

import com.lead.dell.movies.entities.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	
	
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
