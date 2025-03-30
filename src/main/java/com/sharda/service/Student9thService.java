package com.sharda.service;

import java.util.List;

import com.sharda.entity.Student9thMarks;

public interface Student9thService {

   
     Student9thMarks saveOrUpdate(Student9thMarks student);

     Student9thMarks findById(Long id) ;
    
     List<Student9thMarks>  findAll() ;
     
     Student9thMarks findByStudentRollNumber(String id);

     
  }