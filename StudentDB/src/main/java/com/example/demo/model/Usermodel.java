package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="user_data")
@Entity
public class Usermodel {

	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="user_password")
	private String user_password;
	
	public Usermodel(int user_id, String user_password) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "Usermodel [user_id=" + user_id + ", user_password=" + user_password + "]";
	}
	public Usermodel() {
//		super();
		// TODO Auto-generated constructor stub
	}
	
}
