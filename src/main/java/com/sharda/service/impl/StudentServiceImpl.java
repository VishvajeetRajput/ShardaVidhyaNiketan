package com.sharda.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharda.entity.DateAndTime;
import com.sharda.entity.StudentSub;
import com.sharda.entity.Students;
import com.sharda.repo.AdminRepository;
import com.sharda.repo.StudentsRepository;
import com.sharda.repo.StudentsSubjectMarksRepository;
import com.sharda.request.Login;
import com.sharda.request.ResponseMessage;
import com.sharda.request.StudentsRequest;
import com.sharda.request.SubjectMarksRequest;
import com.sharda.service.StudentService;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentsRepository repository;

	@Autowired
	private StudentsSubjectMarksRepository ssrepo;

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Students> getAllStudents(int merchantId) {
		return repository.findAll();
	}

	@Override
	public Students getStudentById(Long id) {
		
			return null;
	}

	@Override
	public String createStudent(StudentsRequest stu) {
		JSONObject map = new JSONObject();

		try {
			Timestamp trxnDate = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());
			if (!(repository.existsByStudentRollNo(stu.getStudentRollNo())
					|| repository.existsByStudentScholarNo(stu.getStudentScholarNo()))) {

				Students students = new Students();
				students.setStudentName(stu.getStudentName());
				students.setStudentGender(stu.getStudentGender());
				students.setStudentRollNo(stu.getStudentRollNo());
				students.setStudentClass(stu.getStudentClass());
				students.setStudentDateOfBirth(stu.getStudentDateOfBirth());
				students.setStudentEmailOrFatherEmail(stu.getStudentEmailOrFatherEmail());
				students.setStudentMobileNoOrFatherMobileNo(stu.getStudentMobileNoOrFatherMobileNo());
				students.setStudentFatherName(stu.getStudentFatherName());
				students.setStudentMotherName(stu.getStudentMotherName());
				students.setStudentAddress1(stu.getStudentAddress1());
				students.setStudentAddress2(stu.getStudentAddress2());
				students.setStudentScholarNo(stu.getStudentScholarNo());
				students.setStudentRegistrationDate(trxnDate);

				map.put("code", "200");
				map.put("discription", "Student Registeration Successful.!!");
				map.put("studentName", stu.getStudentName());
				map.put("rollNumber", stu.getStudentRollNo());
				repository.save(students);

			} else {
				map.put("code", "201");
				map.put("discription", "StudentRollNo or StudentScholarNo already exists.!!");

			}

		} catch (Exception e) {

			map.put("code", "202");
			map.put("discription", "Something went wrong. Please try again");
			map.put("message", e.getMessage());

		}

		return map.toString();
	}

	@Override
	public Students updateStudent(Long id, Students updatedStudent) {

		return null;
	}

	@Override
	public String createStudentSubjectMarks(SubjectMarksRequest student) {
		JSONObject map = new JSONObject();

		try {
			Students stu = repository.findByStudentRollNo(student.getStudentRollNumber());
			if (stu != null) {
				if (!ssrepo.existsByStudentId("" + stu.getStudentId())) {

					StudentSub students = new StudentSub();

					students.setMathematic((student.getMathematic().isEmpty()) ? "NA" : student.getMathematic());
					students.setEnglish((student.getEnglish().isEmpty()) ? "NA" : student.getEnglish());
					students.setHindi((student.getHindi().isEmpty()) ? "NA" : student.getHindi());
					students.setEnvironment((student.getEnvironment().isEmpty()) ? "NA" : student.getEnvironment());
					students.setSanskrit((student.getSanskrit().isEmpty()) ? "NA" : student.getSanskrit());
					students.setScience((student.getScience().isEmpty()) ? "NA" : student.getScience());
					students.setSocialScience(
							(student.getSocialScience().isEmpty()) ? "NA" : student.getSocialScience());
					students.setHistory((student.getHistory().isEmpty()) ? "NA" : student.getHistory());
					students.setPoliticalScience(
							(student.getPoliticalScience().isEmpty()) ? "NA" : student.getPoliticalScience());
					students.setEconomics((student.getEconomics().isEmpty()) ? "NA" : student.getEconomics());
					students.setBusinessStudies(
							(student.getBusinessStudies().isEmpty()) ? "NA" : student.getBusinessStudies());
					students.setBookkeepingAndAccountancy((student.getBookkeepingAndAccountancy().isEmpty()) ? "NA"
							: student.getBookkeepingAndAccountancy());
					students.setBusinessEconomics(
							(student.getBusinessEconomics().isEmpty()) ? "NA" : student.getBusinessEconomics());
					students.setPhysics((student.getPhysics().isEmpty()) ? "NA" : student.getPhysics());
					students.setChemistry((student.getChemistry().isEmpty()) ? "NA" : student.getChemistry());
					students.setBiology((student.getBiology().isEmpty()) ? "NA" : student.getBiology());
					students.setStudentId("" + stu.getStudentId());

					map.put("code", "200");
					map.put("discription", "Student Subject Mark Successfully Added.!!");
					map.put("studentName", stu.getStudentName());
					map.put("rollNumber", stu.getStudentRollNo());
					ssrepo.save(students);
				} else {
					map.put("code", "201");
					map.put("discription", "Student Marks Already Added.!!");
				}
			} else {
				map.put("code", "201");
				map.put("discription", "StudentRollNo Not Found.!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			map.put("code", "202");
			map.put("discription", "Something went wrong. Please try again");
			map.put("message", e.getMessage());

		}

		return map.toString();
	}

	@Override
	public List<StudentSub> getAllStudentsSubjectMark() {
		return ssrepo.findAll();
	}

	@Override
	public Map<String, Object> adminLogin(Login loginRequest) {

		Map<String, Object> response = (adminRepository.existsByAdminEmail(loginRequest.getEmail()))
				? adminRepository.existsByPassword(loginRequest.getPassword())
						? Map.of(ResponseMessage.CODE, ResponseMessage.SUCCESS, ResponseMessage.DESCRIPTION,
								"Login successful")
						: Map.of(ResponseMessage.CODE, ResponseMessage.FAILED, ResponseMessage.DESCRIPTION,
								"Invalid Password")
				: Map.of(ResponseMessage.CODE, ResponseMessage.FAILED, ResponseMessage.DESCRIPTION, "Invalid Email");

		return response;
	}
}
