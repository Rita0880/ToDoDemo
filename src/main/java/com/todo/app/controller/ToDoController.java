package com.todo.app.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.todo.app.dto.ToDoDetailsModel;
import com.todo.app.entity.ToDoDetail;
import com.todo.app.entity.UserDetail;
import com.todo.app.services.ToDoService;

@Controller
public class ToDoController {
	
	private static final Logger logger = LoggerFactory.getLogger(ToDoController.class);
	
	@Autowired
	private ToDoService toDoService;
	
	
	@RequestMapping(value="/todo", method = RequestMethod.POST)
    public String addToDoDetail(@Valid @ModelAttribute ToDoDetailsModel toDoDetailsModel , BindingResult result, ModelMap model, HttpServletRequest request){
		
		UserDetail userDetail = (UserDetail)request.getSession().getAttribute("user");
		
		userDetail = toDoService.addToDoDetail(toDoDetailsModel , userDetail);
		
		model.addAttribute("user", userDetail);
		request.getSession().setAttribute("user", userDetail);
		return "todo";
		
    }
	
	
	@RequestMapping(value = "/deleteToDo" ,method = RequestMethod.POST)
	public @ResponseBody String deleteToDoAjax(@RequestBody ToDoDetailsModel toDoDetailsModel, HttpServletRequest request) {

		UserDetail userDetail = (UserDetail)request.getSession().getAttribute("user");
		toDoService.delToDoDetail(userDetail.getToDoDetail().stream().filter(td -> td.getTask_id() == toDoDetailsModel.getTask_id()).findFirst().get());
		JsonObject json = new JsonObject();
		//add your logic here
			json.addProperty("status","Sucess");
			
			
			
		return json.toString();

	}

}
