package com.todo.app.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TODO_DEATILS")
public class ToDoDetail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer task_id;
	
	  
	  @Column(name="summary") 
	  private String summary;
	
	@Column(name="description") 
	 private String description;
	 
	@Column(name="last_modified_date") 
	 private LocalDate last_modified_date;
	
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private UserDetail userDetail;

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getLast_modified_date() {
		return last_modified_date;
	}

	public void setLast_modified_date(LocalDate last_modified_date) {
		this.last_modified_date = last_modified_date;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}
