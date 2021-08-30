package com.lead.dell.movies.service;

import com.lead.dell.movies.repository.UserRepository;

import com.lead.dell.movies.entities.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	
	public List<User> findAll() {
		return userRepository.findByActive(true);
	}
	

	public Optional<User> findOne(Long userId) {
		
		return userRepository.findById(userId);
	}
	
	
	public User delete(User user) {		
		user.setActive(false);
		return userRepository.save(user);
	}

	
	public User updateUser(long userId, User user) {
		return userRepository.save(user);
	}


	public Optional<User> findById(Long userId) {
		return userRepository.findById(userId);
	}


}