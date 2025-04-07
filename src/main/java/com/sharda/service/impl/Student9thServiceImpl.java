package com.sharda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharda.entity.Student9thMarks;
import com.sharda.repo.Student9thRepository;
import com.sharda.service.Student9thService;

@Service
public class Student9thServiceImpl implements Student9thService {
	
	@Autowired
    private Student9thRepository student11thRepository;

    public Student9thMarks saveOrUpdate(Student9thMarks student) {
        return student11thRepository.save(student);
    }

    public Student9thMarks findById(Long id) {
        return student11thRepository.findById(id).orElse(null);
    }

	@Override
	public List<Student9thMarks> findAll() {
        return student11thRepository.findAll();
	}

	@Override
	public Student9thMarks findByStudentRollNumber(String id) {
		return student11thRepository.findByStudentRollNo(id);
	}
}