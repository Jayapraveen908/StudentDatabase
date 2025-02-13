package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Studentlogin_dto;
import com.example.demo.dto.Userdto;
import com.example.demo.model.Studentlogin_model;
import com.example.demo.model.Usermodel;
import com.example.demo.service.Studentlogin_service;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/studentlogin")
public class Studentlogin_controller {
	
	@Autowired
	public Studentlogin_service  uservice;
	
	 @PostMapping("/post")
		public Studentlogin_model SaveData(@RequestBody Studentlogin_dto dto) {
	    	   
			return uservice.data(dto);
	    	   
	       }
	       @GetMapping("/get")
	   	public List<Studentlogin_model> getdata() {
	       	   
	   		return uservice.getdata();
	       	   
	          }

}
