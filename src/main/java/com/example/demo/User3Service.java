package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class User3Service {
	@Autowired
	User3Repository repository;
	void saveUser(Users3 user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
}
	public Iterable<Users3> getAllUsers() {
		return repository.findAll();
	}
}