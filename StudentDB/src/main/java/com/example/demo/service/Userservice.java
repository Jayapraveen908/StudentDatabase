package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Idto;
import com.example.demo.dto.Userdto;
import com.example.demo.model.Imodel;
import com.example.demo.model.Usermodel;
import com.example.demo.repository.Irepository;
import com.example.demo.repository.Userrepository;

@Service
public class Userservice {
	
	@Autowired
	public Userrepository rep1;

	public Usermodel data(Userdto dto) {
		Usermodel mc = new Usermodel();
		mc.setUser_id(dto.getUser_id());
		mc.setUser_password(dto.getUser_password());
	
		return rep1.save(mc);
	}

	public List<Usermodel> getdata() {
		List<Usermodel> obj2 = new ArrayList<>();
		rep1.findAll()
		.forEach(x->obj2.add(x));
		return obj2;
	}

}
