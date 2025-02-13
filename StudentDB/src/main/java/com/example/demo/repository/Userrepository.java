package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Imodel;
import com.example.demo.model.Usermodel;

@Repository
public interface Userrepository extends JpaRepository<Usermodel,Integer> {

}
