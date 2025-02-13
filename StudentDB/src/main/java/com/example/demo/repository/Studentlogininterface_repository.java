package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Imodel;
import com.example.demo.model.Studentlogin_model;

@Repository
public interface Studentlogininterface_repository extends JpaRepository<Studentlogin_model,Integer> {

}
