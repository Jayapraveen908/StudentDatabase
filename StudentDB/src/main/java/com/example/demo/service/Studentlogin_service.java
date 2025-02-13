package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Studentlogin_dto;
import com.example.demo.dto.Userdto;
import com.example.demo.model.Imodel;
import com.example.demo.model.Studentlogin_model;
import com.example.demo.repository.Irepository;
import com.example.demo.repository.Studentlogininterface_repository;

@Service
public class Studentlogin_service {
	
	@Autowired
	public Studentlogininterface_repository repo;

	public Studentlogin_model data(Studentlogin_dto dto) {
	
		Studentlogin_model sm = new Studentlogin_model();
		
		sm.setStudent_id(dto.getStudent_id());
		sm.setStudent_password(dto.getStudent_password());
		
		return repo.save(sm);
	}

	public List<Studentlogin_model> getdata() {
		
		List<Studentlogin_model> obj = new ArrayList<>();
		repo.findAll()
		.forEach(x->obj.add(x));
		return obj;
	}

}
