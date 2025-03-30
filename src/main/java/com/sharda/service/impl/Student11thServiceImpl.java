package com.sharda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sharda.entity.Student11thMarks;
import com.sharda.repo.Student11thRepository;
import com.sharda.service.Student11thService;

@Service
public class Student11thServiceImpl implements Student11thService {
	
	@Autowired
    private Student11thRepository student11thRepository;

    public Student11thMarks saveOrUpdate(Student11thMarks student) {
        return student11thRepository.save(student);
    }

    public Student11thMarks findById(Long id) {
        return student11thRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional(readOnly = true)
	public List<Student11thMarks> findAll() {
        return student11thRepository.findAll();
	}

	@Override
	public Student11thMarks findByStudentRollNumber(String id) {
		return student11thRepository.findByStudentRollNo(id);
	}
}
