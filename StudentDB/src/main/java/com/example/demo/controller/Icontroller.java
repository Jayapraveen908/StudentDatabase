package com.example.demo.controller;

import java.util.List;
//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Idto;
import com.example.demo.dto.Studentlogin_dto;
import com.example.demo.model.Imodel;
import com.example.demo.model.Studentlogin_model;
import com.example.demo.service.Iservice;
import com.example.demo.service.Studentlogin_service;

@RestController
@RequestMapping("/student")
public class Icontroller {
	@Autowired
	public Iservice service;
	
	
       @PostMapping("/post")
	public Imodel SaveData(@RequestBody Idto dto) {
    	   
		return service.data(dto);
    	   
       }
       @GetMapping("/get")
   	public List<Imodel> getdata() {
       	   
   		return service.getdata();
       	   
          }
       @GetMapping("/id/{id}")
      	public Optional<Imodel> getdatabyid(@PathVariable("id")int id) {
          	   Optional<Imodel>entity=service.getid(id);
			return entity;
             }
       @GetMapping("/delete/{id}")
       public ResponseEntity<String>deleteEmp(@PathVariable("id") int id){
		
    	   service.deleteEmp(id);
    	   return ResponseEntity.ok("Student Deleted");
    	   
       }
//       @GetMapping("/update/{id}")
//       public ResponseEntity<DtoClass> updateemployee(@PathVariable("id") int id, @RequestBody DtoClass dto){
//		
//    	   DtoClass newdto= service.updateemployee(id,dto);
//    	   return new ResponseEntity<DtoClass>(newdto,HttpStatus.OK);
//    	   
//       }
       @PutMapping("/updatefees/{id}")
       public ResponseEntity<Optional<Imodel>> update(@PathVariable int id,@RequestBody Idto dto){
       Optional<Imodel> update=service.getid(id);
       if(update.isPresent()) {
    	   Imodel mupdate=service.update(id,dto);
    	   return ResponseEntity.ok(update);
       }
       else {
    	   return ResponseEntity.notFound().build();
       }
       }
       

}
