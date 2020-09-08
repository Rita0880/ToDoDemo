package com.todo.app.entity;

import java.io.Serializable;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="USERS_DETAILS")

public class UserDetail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id	 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	
	
	@Column(name="first_name") 
	private String firstName;
	
	@Column(name="last_name") 
	private String lastName;
	
	@Column(name="phone") 
	private String phone;
	
	
	@Column(name="login_id") 
    private Integer loginId;

	
	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL, mappedBy="userDetail")
    private List<ToDoDetail> toDoDetail;
	
	
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public List<ToDoDetail> getToDoDetail() {
		return toDoDetail;
	}

	public void setToDoDetail(List<ToDoDetail> toDoDetail) {
		this.toDoDetail = toDoDetail;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	

}
