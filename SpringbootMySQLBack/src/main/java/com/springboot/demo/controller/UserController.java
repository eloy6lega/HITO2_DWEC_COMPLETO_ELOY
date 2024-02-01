package com.springboot.demo.controller;

import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PostMapping("/createUsers")
	public List<User> createUsers(@RequestBody List<User> users){
		return service.saveUser(users);
	}

	@GetMapping("/retrieveUsers")
	public List<User> retrieveUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/retrieveUserById/{id}")
	public User retrieveUserById(@PathVariable String id) {
		return service.getUserById(id);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id) {
		return service.deleteUser(id);
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

}