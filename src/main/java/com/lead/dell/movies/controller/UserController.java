package com.lead.dell.movies.controller;

import com.lead.dell.movies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@Autowired
	UserService userService;
	
}
