package com.sharda.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sharda.entity.Students;
import com.sharda.request.Login;
import com.sharda.request.StudentsRequest;
import com.sharda.service.StudentService;

@RestController
@RequestMapping("/v2")
public class StudentController {

	    @Autowired
	    private StudentService studentService;

	    @GetMapping("/getallstudent")
<<<<<<< HEAD
	    public List<Students> getAllStudents(@RequestParam int merchantId) {
	        return studentService.getAllStudents(merchantId);
=======
	    public List<Students> getAllStudents() {
	        return studentService.getAllStudents();
>>>>>>> vishvajeet_Jadoun
	    }

	    @GetMapping("getStudentById/{id}")
	    public Students getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PostMapping("/createStudent")
	    public String createStudent( @Valid @RequestBody StudentsRequest student) {
	        return studentService.createStudent(student);
	    }

	    @PutMapping("/updatestudent/{id}")
	    public Students updateStudent(@PathVariable Long id, @RequestBody Students updatedStudent) {
	        return studentService.updateStudent(id, updatedStudent);
	    }
	    
	    @PostMapping("/adminLogin")
	    public Map<String, Object> adminLogin(@RequestBody @Valid Login LoginRequest) {
	        return studentService.adminLogin(LoginRequest);
	    }
	
<<<<<<< HEAD
}
=======
}	
>>>>>>> vishvajeet_Jadoun
