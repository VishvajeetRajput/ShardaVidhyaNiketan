package com.sharda.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.HashSet;
>>>>>>> vishvajeet_Jadoun
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
<<<<<<< HEAD
	public List<Students> getAllStudents(int merchantId) {
=======
	public List<Students> getAllStudents() {

>>>>>>> vishvajeet_Jadoun
		return repository.findAll();
	}

	@Override
	public Students getStudentById(Long id) {
<<<<<<< HEAD
		
			return null;
=======

		Map<String, String> map = new HashMap<>();
		
		try {
			
			
			
			OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
					MediaType mediaType = MediaType.parse("text/plain");
					RequestBody body = RequestBody.create(mediaType, "");
					Request request = new Request.Builder()
					  .url("https://api.fidypay.com/admin/merchantServiceCharge/getChargeListByMerchantServiceId?merchantServiceId="+id)
					  .method("GET", null)
					  .addHeader("accept", "application/json, text/plain, */*")
					  .addHeader("accept-language", "en-US,en;q=0.9")
					  .addHeader("origin", "https://admin.fidypay.com")
					  .addHeader("priority", "u=1, i")
					  .addHeader("referer", "https://admin.fidypay.com/")
					  .addHeader("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126\"")
					  .addHeader("sec-ch-ua-mobile", "?0")
					  .addHeader("sec-ch-ua-platform", "\"Windows\"")
					  .addHeader("sec-fetch-dest", "empty")
					  .addHeader("sec-fetch-mode", "cors")
					  .addHeader("sec-fetch-site", "same-site")
					  .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36")
					  .addHeader("x-client-id", "tiFANIMp/fxEy8GNKHyCAg==")
					  .addHeader("x-client-secret", "NRmIJMChRiJIYN8onwn2i6kuuXz6+GsABAf2YXWIFX5Ly4KzBEmQxmPYPay57KEy")
					  .build();
					Response response = client.newCall(request).execute();

					
					ResponseBody responseBody = response.body();
					String ss = responseBody.string();
										JSONObject jsonObject = new JSONObject(ss);
					
					if (jsonObject.getString("code").equalsIgnoreCase("0x0202")) {
						
						System.out.println(id);
						
					} else {

					}
					
//		
//			OkHttpClient client = new OkHttpClient().newBuilder().build();
//			MediaType mediaType = MediaType.parse("application/json");
//			RequestBody body = RequestBody.create(mediaType, "");
//			Request request = new Request.Builder()
//					.url("https://api.fidypay.com/admin/merchantService/merchantServiceListByMerchantId?merchantId="
//							+ id)
//					.method("POST", body).addHeader("accept", "*/*").addHeader("content-type", "application/json")
//					.addHeader("x-client-id", "tiFANIMp/fxEy8GNKHyCAg==")
//					.addHeader("x-client-secret", "NRmIJMChRiJIYN8onwn2i6kuuXz6+GsABAf2YXWIFX5Ly4KzBEmQxmPYPay57KEy")
//					.build();
//			Response response = client.newCall(request).execute();
//			ResponseBody responseBody = response.body();
//			String ss = responseBody.string();
//			JSONObject jsonObject = new JSONObject(ss);
//			JSONArray merchantServiceList = jsonObject.getJSONArray("merchantServiceList");
// 			
//			
//			for (int i = 0; i < merchantServiceList.length(); i++) {
//
//				JSONObject merchantService = merchantServiceList.getJSONObject(i);
//
//				int merchantServiceId = merchantService.getInt("merchantServiceId");
//
//				if (merchantService.getString("serviceName").equalsIgnoreCase("ESIGN REJECTED")) {
//					
//					System.out.println(merchantServiceId);
//					
//				}else {
//
//				}
				

			
//			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
>>>>>>> vishvajeet_Jadoun
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

<<<<<<< HEAD
		Map<String, Object> response = (adminRepository.existsByAdminEmail(loginRequest.getEmail()))
=======
		return (adminRepository.existsByAdminEmail(loginRequest.getEmail()))
>>>>>>> vishvajeet_Jadoun
				? adminRepository.existsByPassword(loginRequest.getPassword())
						? Map.of(ResponseMessage.CODE, ResponseMessage.SUCCESS, ResponseMessage.DESCRIPTION,
								"Login successful")
						: Map.of(ResponseMessage.CODE, ResponseMessage.FAILED, ResponseMessage.DESCRIPTION,
								"Invalid Password")
				: Map.of(ResponseMessage.CODE, ResponseMessage.FAILED, ResponseMessage.DESCRIPTION, "Invalid Email");
<<<<<<< HEAD

		return response;
	}
=======
	}

>>>>>>> vishvajeet_Jadoun
}
