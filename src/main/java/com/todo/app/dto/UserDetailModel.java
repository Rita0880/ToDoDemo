package com.todo.app.dto;

import java.util.Set;

import com.todo.app.entity.ToDoDetail;

public class UserDetailModel {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	 private Set<ToDoDetail> toDoDetail;
	 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<ToDoDetail> getToDoDetail() {
		return toDoDetail;
	}
	public void setToDoDetail(Set<ToDoDetail> toDoDetail) {
		this.toDoDetail = toDoDetail;
	}

}
