package com.springboot.demo.service;

import com.springboot.demo.entity.User;
import com.springboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> saveUser(List<User> user){
		return repository.saveAll(user);
	}

	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public User getUserById(String id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteUser(String id) {
		repository.deleteById(id);
		return "deleted user with id "+id;
	}

	public User updateUser(User user) {
		User existingUser = repository.findById(user.getId()).orElse(null);
		existingUser.setId(user.getId());
		existingUser.setUsuario(user.getUsuario());
		existingUser.setPwd(user.getPwd());
		return repository.save(existingUser);
	}
}