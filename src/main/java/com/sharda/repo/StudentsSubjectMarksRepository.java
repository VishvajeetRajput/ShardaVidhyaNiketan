package com.sharda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sharda.entity.StudentSub;
import com.sharda.entity.Students;

@Repository
public interface StudentsSubjectMarksRepository extends JpaRepository<StudentSub, Long> {

	boolean existsByStudentId(String id);
	
	@Query(value = "SELECT * FROM subjects  WHERE STUDENTID=?1 ", nativeQuery = true)
	StudentSub findByStudentId(String id);
	
	
}
