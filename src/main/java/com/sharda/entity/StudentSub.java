package com.sharda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECTS")
public class StudentSub {
<<<<<<< HEAD

=======
>>>>>>> vishvajeet_Jadoun
	
	@Id
	@Column(name = "SUBJECTID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long subjectId;

	@Column(name = "MATHEMATIC", nullable = false, length = 10)
	public String mathematic;

	@Column(name = "ENGLISH", nullable = false, length = 10)
	public String english;

	@Column(name = "HINDI", nullable = false, length = 10)
	public String hindi;

	@Column(name = "ENVIRONMENT", nullable = false, length = 10)
	public String environment;

	@Column(name = "SANSKRIT", nullable = false, length = 10)
	public String sanskrit;

	@Column(name = "SCIENCE", nullable = false, length = 10)
	public String science;

	@Column(name = "SOCIALSCIENCE", nullable = false, length = 10)
	public String socialScience;

	@Column(name = "HISTORY", nullable = false, length = 10)
	public String history;

	@Column(name = "POLITICALSCIENCE", nullable = false, length = 10)
	public String politicalScience;

	@Column(name = "ECONOMICS", nullable = false, length = 10)
	public String economics;

	@Column(name = "BUSINESSSTUDIES", nullable = false, length = 10)
	public String businessStudies;

	@Column(name = "BOOKKEEPINGANDACCOUNTANCY", nullable = false, length = 10)
	public String bookkeepingAndAccountancy;

	@Column(name = "BUSINESSECONOMICS", nullable = false, length = 10)
	public String businessEconomics;

	@Column(name = "PHYSICS", nullable = false, length = 10)
	public String physics;

	@Column(name = "CHEMISTRY", nullable = false, length = 10)
	public String chemistry;

	@Column(name = "BIOLOGY", nullable = false, length = 10)
	public String biology;

	@Column(name = "STUDENTID", nullable = false, length = 10)
	public String studentId;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getMathematic() {
		return mathematic;
	}

	public void setMathematic(String mathematic) {
		this.mathematic = mathematic;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getSanskrit() {
		return sanskrit;
	}

	public void setSanskrit(String sanskrit) {
		this.sanskrit = sanskrit;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getSocialScience() {
		return socialScience;
	}

	public void setSocialScience(String socialScience) {
		this.socialScience = socialScience;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getPoliticalScience() {
		return politicalScience;
	}

	public void setPoliticalScience(String politicalScience) {
		this.politicalScience = politicalScience;
	}

	public String getEconomics() {
		return economics;
	}

	public void setEconomics(String economics) {
		this.economics = economics;
	}

	public String getBusinessStudies() {
		return businessStudies;
	}

	public void setBusinessStudies(String businessStudies) {
		this.businessStudies = businessStudies;
	}

	public String getBookkeepingAndAccountancy() {
		return bookkeepingAndAccountancy;
	}

	public void setBookkeepingAndAccountancy(String bookkeepingAndAccountancy) {
		this.bookkeepingAndAccountancy = bookkeepingAndAccountancy;
	}

	public String getBusinessEconomics() {
		return businessEconomics;
	}

	public void setBusinessEconomics(String businessEconomics) {
		this.businessEconomics = businessEconomics;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getBiology() {
		return biology;
	}

	public void setBiology(String biology) {
		this.biology = biology;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	
}
