package com.todo.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.todo.app.entity.User;
import com.todo.app.entity.UserDetail;

public interface UserDetailRepository extends CrudRepository<UserDetail, Integer>{
	
	Optional<UserDetail> findByLoginId(Integer loginId);

}
