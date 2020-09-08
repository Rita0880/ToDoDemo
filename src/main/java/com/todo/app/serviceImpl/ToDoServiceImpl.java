package com.todo.app.serviceImpl;



import java.time.LocalDate;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.dto.ToDoDetailsModel;
import com.todo.app.entity.ToDoDetail;
import com.todo.app.entity.UserDetail;
import com.todo.app.repository.ToDoDetailRepository;
import com.todo.app.repository.UserDetailRepository;
import com.todo.app.services.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService{
	
	private static final Logger logger = LoggerFactory.getLogger(ToDoServiceImpl.class);
	
	@Autowired
	private ToDoDetailRepository toDoDetailRepository;
	
	@Autowired
	private UserDetailRepository userDetailRepository;

	@Override
	public UserDetail addToDoDetail(ToDoDetailsModel toDoDetail, UserDetail userDetail){
		
		
		// can integrate dto mapper here...model mapper or maps struct....
		ToDoDetail toDoDetailEntity = new ToDoDetail();
		toDoDetailEntity.setSummary(toDoDetail.getSummary());
		toDoDetailEntity.setDescription(toDoDetail.getDescription());
		toDoDetailEntity.setLast_modified_date(LocalDate.now());
		toDoDetailEntity.setUserDetail(userDetail);		
		if(userDetail.getToDoDetail() == null) {
			userDetail.setToDoDetail(new ArrayList<ToDoDetail>());
		}
		userDetail.getToDoDetail().add(toDoDetailEntity);
		
		return userDetailRepository.save(userDetail);
	}

	@Override
	public ToDoDetail delToDoDetail(ToDoDetail toDoDetail) {
		toDoDetailRepository.delete(toDoDetail);
		return toDoDetail;
	}

}
