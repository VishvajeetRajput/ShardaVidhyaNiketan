package com.sharda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "STUDENT_8TH_MARKS")
public class Student8thMarks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "HINDI")
	private String hindi;

	@Column(name = "ENGLISH")
	private String english;
		
	@Column(name = "SCIENCE")
	private String science;
	
	@Column(name = "SO_SCIENCE")
	private String soScience;
	
	@Column(name = "SANSKRIT") 
	private String sanskrit;
	
	@Column(name = "MATHEMATICS")
	private String mathematics;
	
	@Column(name = "StudentRollNo")
	private String studentRollNo;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "percentage")
	private Double percentage;
	
	@Column(name = "GRADE")
	private String grade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getSoScience() {
		return soScience;
	}

	public void setSoScience(String soScience) {
		this.soScience = soScience;
	}

	public String getSanskrit() {
		return sanskrit;
	}

	public void setSanskrit(String sanskrit) {
		this.sanskrit = sanskrit;
	}

	public String getMathematics() {
		return mathematics;
	}

	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
