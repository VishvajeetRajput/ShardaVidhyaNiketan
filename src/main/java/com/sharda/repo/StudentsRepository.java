package com.sharda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sharda.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

	boolean existsByStudentRollNo(String rollNo);
	
	
	boolean existsByStudentScholarNo(String scholarNo);
	
	@Query(value = "SELECT * FROM students  WHERE STUDENT_ROLL_NO=?1 ", nativeQuery = true)
	Students findByStudentRollNo(String rollNo);
	
}
