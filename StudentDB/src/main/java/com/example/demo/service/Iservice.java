package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.Idto;
import com.example.demo.model.Imodel;
import com.example.demo.repository.Irepository;

@Service
public class Iservice extends RuntimeException{
	
	@Autowired
	public Irepository rep;
	
//	@Autowired
//	public ModelClass model;

	public Imodel data(Idto dto) {
		Imodel mc = new Imodel();
		mc.setId(dto.getId());
		mc.setName(dto.getName());
		mc.setFees(dto.getFees());
		mc.setAddress(dto.getAddress());
		mc.setMark(dto.getMark());
		
		return rep.save(mc);
	}

	public List<Imodel> getdata() {
		List<Imodel> obj = new ArrayList<>();
		rep.findAll()
		.forEach(x->obj.add(x));
		return obj;
	}

	public Optional<Imodel> getid(int id) {
		
		return rep.findById(id);
	}

	public void deleteEmp(int id) {
		
		Optional<Imodel> mc = rep.findById(id);
		if(mc!=null) {
			rep.deleteById(id);
		}
		
		
	}

//	public DtoClass updateemployee(int id, DtoClass dto) {
//		
//		Optional<>
		
		
		
//		return null;
//	}

	public Optional<Imodel> updateDate(int id, Idto dto) {
		
		Optional<Imodel>obj=rep.findById(id);
		if(obj.isPresent()) {
			Imodel entity=new Imodel();
			entity.setName(dto.getName());
			entity.setFees(dto.getFees());
			entity.setAddress(dto.getAddress());
			entity.setMark(dto.getMark());
			
			rep.save(entity);
		}
		
		return obj;
	}

	public Imodel update(int id, Idto dto) {
		Imodel mo = rep.findById(id).orElseThrow(()->new RuntimeException("Employe not found"));
		mo.setName(dto.getName());
		mo.setFees(dto.getFees());
		mo.setAddress(dto.getAddress());
		mo.setMark(dto.getMark());
		return rep.save(mo);
	}
	
	

}
