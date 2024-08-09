package com.sharda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
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

	@Column(name = "STUDENT_ID")
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

}
