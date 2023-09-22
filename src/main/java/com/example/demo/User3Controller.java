package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User3Controller {
	@Autowired
	User3Service userService;
	
	@PostMapping
	void saveUser(@RequestBody Users3 user) {
		userService.saveUser(user);
		System.out.println("user created " + user.getName());
	}
	
	@GetMapping
	Iterable<Users3> getUser() {
		return userService.getAllUsers();
	}
	

}
