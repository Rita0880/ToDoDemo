package com.todo.app.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.app.entity.AppUserDetails;
import com.todo.app.entity.UserDetail;
import com.todo.app.services.LoginService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }
	
	
	@RequestMapping(value="/successLogin", method = RequestMethod.GET)
    public String successLogin(Authentication authentication, ModelMap model, HttpServletRequest request){
		
		if (authentication.getPrincipal() instanceof UserDetails) {
			  Integer id = ((AppUserDetails)authentication.getPrincipal()).getId();
			  Optional<UserDetail> userDetail = loginService.getUserDetail(id);
			  // set the user detail in session ,can avoid that if not required
			  request.getSession(false).setAttribute("user", userDetail.get());
			}
			
				
        	return "todo";
		
    }
	
	
	

}
