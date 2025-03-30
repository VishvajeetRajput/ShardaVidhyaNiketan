package com.sharda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharda.entity.Student11thMarks;

@Repository
public interface Student11thRepository extends JpaRepository<Student11thMarks, Long> {
	
	Student11thMarks findByStudentRollNo(String studentRollNo);

	
}