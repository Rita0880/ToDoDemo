package com.todo.app.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.todo.app.entity.AppUserDetails;
import com.todo.app.entity.User;
import com.todo.app.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
    @Autowired
    private UserRepository userRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
    	Optional<User> user = userRepository.findByUserName(username);
         
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new AppUserDetails(user.get());
    }
 
}


