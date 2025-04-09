package com.sharda.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentsRequest {

	@NotBlank(message = "studentName can't be empty")
	@Size(max = 70, min = 3, message = "studentName should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentName")
	private String studentName;

	@NotBlank(message = "studentGender can't be empty")
	@Size(max = 10, min = 3, message = "studentGender should be beetween 3 to 10")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Inavalid studentGender")
	private String studentGender;

	@NotBlank(message = "studentRollNo can't be empty")
	@Size(max = 30, min = 3, message = "studentRollNo should be beetween 3 to 30")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Inavalid studentRollNo")
	private String studentRollNo;

	@NotBlank(message = "studentClass can't be empty")
	@Size(max = 20, min = 3, message = "studentClass should be beetween 3 to 20")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentClass")
	private String studentClass;

	@NotBlank(message = "studentDateOfBirth can't be empty")
	@Size(max = 30, min = 3, message = "studentDateOfBirth should be beetween 3 to 30")
	@Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "Inavalid studentDateOfBirth")
	private String studentDateOfBirth;

	@NotBlank(message = "studentEmailOrFatherEmail can't be empty")
	@Size(max = 70, min = 3, message = "studentEmailOrFatherEmail should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9@.-_]+$", message = "Inavalid studentEmailOrFatherEmail")
	private String studentEmailOrFatherEmail;

	@NotBlank(message = "studentMobileNoOrFatherMobileNo can't be empty")
	@Size(max = 10, min = 10, message = "studentMobileNoOrFatherMobileNo should be 10 digit")
	@Pattern(regexp = "^[0-9]+$", message = "Inavalid studentMobileNoOrFatherMobileNo")
	private String studentMobileNoOrFatherMobileNo;

	@NotBlank(message = "studentFatherName can't be empty")
	@Size(max = 70, min = 3, message = "studentFatherName should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentFatherName")
	private String studentFatherName;

	@NotBlank(message = "studentMotherName can't be empty")
	@Size(max = 70, min = 3, message = "studentMotherName should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentMotherName")
	private String studentMotherName;

	@NotBlank(message = "studentAddress1 can't be empty")
	@Size(max = 70, min = 3, message = "studentAddress1 should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentAddress1")
	private String studentAddress1;

	@NotBlank(message = "studentAddress2 can't be empty")
	@Size(max = 70, min = 3, message = "studentAddress2 should be beetween 3 to 70")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentAddress2")
	private String studentAddress2;

	@NotBlank(message = "studentScholarNo can't be empty")
	@Size(max = 20, min = 3, message = "studentScholarNo should be beetween 3 to 20")
	@Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Inavalid studentScholarNo")
	private String studentScholarNo;

	private String studentId;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
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

	public String getStudentScholarNo() {
		return studentScholarNo;
	}

	public void setStudentScholarNo(String studentScholarNo) {
		this.studentScholarNo = studentScholarNo;
	}

	public StudentsRequest() {
	}

	@Override
	public String toString() {
		return "StudentsRequest [studentName=" + studentName + ", studentGender=" + studentGender + ", studentRollNo="
				+ studentRollNo + ", studentClass=" + studentClass + ", studentDateOfBirth=" + studentDateOfBirth
				+ ", studentEmailOrFatherEmail=" + studentEmailOrFatherEmail + ", studentMobileNoOrFatherMobileNo="
				+ studentMobileNoOrFatherMobileNo + ", studentFatherName=" + studentFatherName + ", studentMotherName="
				+ studentMotherName + ", studentAddress1=" + studentAddress1 + ", studentAddress2=" + studentAddress2
				+ ", studentScholarNo=" + studentScholarNo + ", studentId=" + studentId + "]";
	}

	

}
