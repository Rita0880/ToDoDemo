package com.todo.app.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.todo.app.entity.User;


public interface UserRepository extends Repository<User, Integer>{
	
	Optional<User> findByUserName(String userName);

}
