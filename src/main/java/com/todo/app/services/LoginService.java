package com.todo.app.services;


import java.util.Optional;

import com.todo.app.dto.UserModel;
import com.todo.app.entity.User;
import com.todo.app.entity.UserDetail;

public interface LoginService {
	
	public Optional<User> validateUser(UserModel user);
	
	public Optional<UserDetail> getUserDetail(Integer loginId);
}
