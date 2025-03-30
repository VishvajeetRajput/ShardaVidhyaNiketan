package com.sharda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharda.entity.Student9thMarks;


@Repository
public interface Student9thRepository extends JpaRepository<Student9thMarks, Long> {
	
	Student9thMarks findByStudentRollNo(String studentRollNo);

	
}