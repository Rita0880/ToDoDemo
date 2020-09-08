package com.todo.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.app.entity.ToDoDetail;

public interface ToDoDetailRepository extends CrudRepository<ToDoDetail, Integer>{

}
