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
//import com.itextpdf.io.image.ImageData;
//import com.itextpdf.io.image.ImageDataFactory;
//import com.itextpdf.kernel.colors.ColorConstants;
//import com.itextpdf.kernel.font.PdfFontFactory;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Image;
//import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.property.TextAlignment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


@RestController
@RequestMapping("/v2")
public class StudentController {

	    @Autowired
	    private StudentService studentService;

	    @GetMapping("/getallstudent")
	    public List<Students> getAllStudents() {
	        return studentService.getAllStudents();
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
	    public Map<String, Object> adminLogin(@RequestBody @Valid Login loginRequest) {
	    	
	        return studentService.adminLogin(loginRequest);
	    }
	    
}	
