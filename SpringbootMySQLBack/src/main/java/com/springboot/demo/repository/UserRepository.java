package com.springboot.demo.repository;


import com.springboot.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>{
	User findByUsuario(String usuario);
	List<User> findByUsuarioContaining(String usuario);
}
