package com.sharda.service;

import java.util.List;

import com.sharda.entity.Student11thMarks;
public interface Student11thService {

   
     Student11thMarks saveOrUpdate(Student11thMarks student);

     Student11thMarks findById(Long id) ;
    
     List<Student11thMarks>  findAll() ;
     
     Student11thMarks findByStudentRollNumber(String id);

     
  }