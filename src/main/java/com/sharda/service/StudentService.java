package com.sharda.service;

import java.util.List;
import java.util.Map;

import com.sharda.entity.StudentSub;
import com.sharda.entity.Students;
import com.sharda.request.Login;
import com.sharda.request.StudentsRequest;
import com.sharda.request.SubjectMarksRequest;

public interface StudentService {

<<<<<<< HEAD
	List<Students> getAllStudents(int merchantId);
=======
	List<Students> getAllStudents();
>>>>>>> vishvajeet_Jadoun

	Students getStudentById(Long id);

	String createStudent(StudentsRequest student);

	Students updateStudent(Long id, Students updatedStudent);

	String createStudentSubjectMarks(SubjectMarksRequest student);

	List<StudentSub> getAllStudentsSubjectMark();

	Map<String, Object> adminLogin(Login loginRequest);

}
