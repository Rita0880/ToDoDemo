package com.todo.app.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.controller.ToDoController;
import com.todo.app.dto.UserModel;
import com.todo.app.entity.User;
import com.todo.app.entity.UserDetail;
import com.todo.app.repository.UserDetailRepository;
import com.todo.app.repository.UserRepository;
import com.todo.app.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	

	// not in use as done by spring security....
	@Override
	public Optional<User> validateUser(UserModel user) {
		Optional<User> userEntity = userRepository.findByUserName(user.getUserName());
		if(userEntity.isPresent() && userEntity.get().getUserName().equals(user.getUserName()) && userEntity.get().getPassword().equals(user.getPassword())) {
			return userEntity;
		} else {
			return null;
		}
	}
	
	
	
	@Override
	public Optional<UserDetail> getUserDetail(Integer loginId){
		return userDetailRepository.findByLoginId(loginId);
		
	}

}
