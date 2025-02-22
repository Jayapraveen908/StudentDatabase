package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Idto;
import com.example.demo.dto.Userdto;
import com.example.demo.model.Imodel;
import com.example.demo.model.Usermodel;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/user")
public class Usercontrol {

	@Autowired
	public Userservice uservice;
	
	 @PostMapping("/post")
		public Usermodel SaveData(@RequestBody Userdto dto) {
	    	   
			return uservice.data(dto);
	    	   
	       }
	       @GetMapping("/get")
	   	public List<Usermodel> getdata() {
	       	   
	   		return uservice.getdata();
	       	   
	          }
}
