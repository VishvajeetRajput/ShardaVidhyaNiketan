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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_11TH_MARKS")
public class Student11thMarks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "HINDI")
	private String hindi;

	@Column(name = "ENGLISH")
	private String english;
	
	@Column(name = "physics")
	private String physics;
	
	@Column(name = "biology")
	private String biology;
	
	@Column(name = "chemistry")
	private String chemistry;
	
	@Column(name = "mathematics")
	private String mathematics;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "percentage")
	private Double percentage;
	
	@Column(name = "praPhysics") 
	private String praPhysics;
	
	@Column(name = "praChemistry")
	private String praChemistry;
	
	@Column(name = "praBiology")
	private String praBiology;
	
	@Column(name = "StudentRollNo")
	private String studentRollNo;

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

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getBiology() {
		return biology;
	}

	public void setBiology(String biology) {
		this.biology = biology;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getMathematics() {
		return mathematics;
	}

	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String getPraPhysics() {
		return praPhysics;
	}

	public void setPraPhysics(String praPhysics) {
		this.praPhysics = praPhysics;
	}

	public String getPraChemistry() {
		return praChemistry;
	}

	public void setPraChemistry(String praChemistry) {
		this.praChemistry = praChemistry;
	}

	public String getPraBiology() {
		return praBiology;
	}

	public void setPraBiology(String praBiology) {
		this.praBiology = praBiology;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
	
}
