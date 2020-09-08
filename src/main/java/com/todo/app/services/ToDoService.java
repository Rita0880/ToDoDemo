package com.todo.app.services;

import com.todo.app.dto.ToDoDetailsModel;
import com.todo.app.entity.ToDoDetail;
import com.todo.app.entity.UserDetail;

public interface ToDoService {
	
	public UserDetail addToDoDetail(ToDoDetailsModel toDoDetail , UserDetail userDetail);
	
	public ToDoDetail delToDoDetail(ToDoDetail toDoDetail);

}
