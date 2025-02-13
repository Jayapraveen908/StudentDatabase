package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="student_login")
@Entity
public class Studentlogin_model {
	
	@Id
	@Column(name="student_id")
	private int student_id;
	
	@Column(name="student_password")
	private String student_password;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	@Override
	public String toString() {
		return "Studentlogin_model [student_id=" + student_id + ", student_password=" + student_password + "]";
	}
	public Studentlogin_model(int student_id, String student_password) {
		super();
		this.student_id = student_id;
		this.student_password = student_password;
	}
	public Studentlogin_model() {
//		super();
		
	}

}
