package com.sharda.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Students {

	@Id
	@Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	@Column(name = "STUDENT_NAME", nullable = false, length = 70)
	private String studentName;

	@Column(name = "STUDENT_GENDER", nullable = false, length = 20)
	private String studentGender;

	@Column(name = "STUDENT_ROLL_NO", nullable = false, length = 30)
	private String studentRollNo;
	
	@Column(name = "STUDENT_CLASS", nullable = false, length = 20)
	private String studentClass;

	@Column(name = "STUDENT_DATE_OF_BIRTH", nullable = false, length = 20)
	private String studentDateOfBirth;

	@Column(name = "STUDENT_EMAIL_OR_FATHER_EMAIL", nullable = false, length = 700)
	private String studentEmailOrFatherEmail;
	
	@Column(name = "STUDENTMOBILENO_OR_FATHERMOBILENO", nullable = false, length = 50)
	private String studentMobileNoOrFatherMobileNo;
	
	@Column(name = "STUDENT_FATHER_NAME", nullable = false, length = 70)
	private String studentFatherName;
	
	@Column(name = "STUDENT_MOTHER_NAME", nullable = false, length = 70)
	private String studentMotherName;
	
	@Column(name = "STUDENT_SCHOLAR_NO", nullable = false, length = 20)
	private String studentScholarNo;
	
	@Column(name = "STUDENT_ADDRESS1", nullable = false, length = 200)
	private String studentAddress1;
	
	@Column(name = "STUDENT_ADDRESS2", nullable = false, length = 200)
	private String studentAddress2;

	@Column(name = "STUDENT_REGISTRATION_DATE", nullable = false, length = 200)
	private Timestamp studentRegistrationDate;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	public String getStudentEmailOrFatherEmail() {
		return studentEmailOrFatherEmail;
	}

	public void setStudentEmailOrFatherEmail(String studentEmailOrFatherEmail) {
		this.studentEmailOrFatherEmail = studentEmailOrFatherEmail;
	}

	public String getStudentMobileNoOrFatherMobileNo() {
		return studentMobileNoOrFatherMobileNo;
	}

	public void setStudentMobileNoOrFatherMobileNo(String studentMobileNoOrFatherMobileNo) {
		this.studentMobileNoOrFatherMobileNo = studentMobileNoOrFatherMobileNo;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public String getStudentScholarNo() {
		return studentScholarNo;
	}

	public void setStudentScholarNo(String studentScholarNo) {
		this.studentScholarNo = studentScholarNo;
	}

	public String getStudentAddress1() {
		return studentAddress1;
	}

	public void setStudentAddress1(String studentAddress1) {
		this.studentAddress1 = studentAddress1;
	}

	public String getStudentAddress2() {
		return studentAddress2;
	}

	public void setStudentAddress2(String studentAddress2) {
		this.studentAddress2 = studentAddress2;
	}

	public Timestamp getStudentRegistrationDate() {
		return studentRegistrationDate;
	}

	public void setStudentRegistrationDate(Timestamp studentRegistrationDate) {
		this.studentRegistrationDate = studentRegistrationDate;
	}
	
	
	
	
}
