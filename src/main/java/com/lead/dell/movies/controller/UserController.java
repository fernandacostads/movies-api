package com.lead.dell.movies.controller;

import com.lead.dell.movies.entities.User;
import com.lead.dell.movies.repository.UserRepository;
import com.lead.dell.movies.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
//@RequestMapping(value="/api")
public class UserController {

	@Autowired
	UserService userService;
	
	// @Valid no param ??
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value="id") long userId){
		return UserRepository.findById(userId);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}

	@DeleteMapping("/produtos")
	public void deletaProduto(@RequestBody User user) {
		userService.delete(user);
	}
	
	
}
