package com.lead.dell.movies.controller;

import com.lead.dell.movies.entities.User;
import com.lead.dell.movies.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {

	@Autowired
	UserService userService;


	@PostMapping("/add-user")
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}


	@GetMapping("/listall-user")
	public List<User> getAllUsers(){
		return userService.findAll();
	}


	@GetMapping("/list-user/{userId}")
	public Optional<User> getUserById(@PathVariable long userId){
		return userService.findById(userId);
	}


	@PutMapping("/edit-user/{userId}")
	public User updateUser(@RequestBody User user, @PathVariable long userId) {
		return userService.updateUser(userId, user);
	}


	@PutMapping("/delete-user/{userId}")
	public User deleteUser(@RequestBody User user, @PathVariable long userId) {
		return userService.delete(user);
	}

}

