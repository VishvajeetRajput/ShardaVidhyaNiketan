package com.sharda.controller;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sharda.entity.Student11thMarks;
import com.sharda.entity.StudentSub;
import com.sharda.entity.Students;
import com.sharda.repo.StudentsRepository;
import com.sharda.repo.StudentsSubjectMarksRepository;
import com.sharda.request.ResponseMessage;
import com.sharda.request.StudentsRequest;
import com.sharda.request.SubjectMarksRequest;
import com.sharda.request.SubjectResponseList;
import com.sharda.service.Student11thService;
import com.sharda.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentsRepository repository;

	@Autowired
	private Student11thService student11thService;

	@Autowired
	private StudentsSubjectMarksRepository marksRepository;

	@RequestMapping(method = RequestMethod.GET, value = "")
	public ModelAndView paymentLink() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/HomePage");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "AdminLogin")
	public ModelAndView adminLogin() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/AdminLogin");

		} catch (Exception e) {
		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/studentRegistration")
	public ModelAndView studentRegistration() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/StudentRegistration");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView login() {

		ModelAndView model = new ModelAndView();
		try {

			model.addObject("baseUrl", ResponseMessage.baseUrlWithoutV2 + "AdminLogin");
			model.setViewName("user/login");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/studentRegistrationRequest")
	public ModelAndView studentRegistrationRequest(StudentsRequest studentsRequest) {

		ModelAndView model = new ModelAndView();
		try {

			String responsejson = studentService.createStudent(studentsRequest);

			System.out.println(responsejson);
			JSONObject jsonObject = new JSONObject(responsejson);
			switch (jsonObject.getString("code")) {
			case "200":
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				model.addObject("studentName", jsonObject.getString("studentName"));
				model.addObject("rollNumber", jsonObject.getString("rollNumber"));
				break;
			case "201":
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				break;
			default:
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				model.addObject("message", jsonObject.getString("message"));
				break;
			}

			model.setViewName("user/errorMessage");

		} catch (Exception e) {
			e.printStackTrace();
			model.addObject("code", "202");
			model.addObject("discription", "Something Went Wrong. Please Try Again!!");
			model.addObject("message", e.getMessage());
		}
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/viewStudentDetails")
	public ModelAndView viewStudentDetails() {

		ModelAndView model = new ModelAndView();
		try {
			Students students = new Students();
			List<Students> responsejson = studentService.getAllStudents();
			Collections.sort(responsejson, Comparator.comparing(Students::getStudentId).reversed());

			System.out.println(responsejson.size());
			if (responsejson == null) {
				model.addObject("code", "201");
				model.addObject("data", "No student details found");
			} else {

				model.addObject("code", "200");
				model.addObject("data", responsejson);
			}
			model.setViewName("user/StudentList");

		} catch (Exception e) {
			model.addObject("code", "202");
			model.addObject("discription", "Something Went Wrong. Please Try Again!!");
			model.addObject("message", e.getMessage());
		}
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/searchStudent")
	public ModelAndView searchStudent() {

		ModelAndView model = new ModelAndView();
		try {

			model.addObject("url", ResponseMessage.baseUrlWithoutV2 + "viewMarksheet");
			model.setViewName("user/searchStudent");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/SubjectMarksAndList")
	public ModelAndView SubjectMarksAndList() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/SubjectMarksAndList");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addSubjectMarkrs")
	public ModelAndView addSubjectMarkrs() {
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("user/addStudentSubjectMarks");
		} catch (Exception e) {

		}
		return model;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addStudentSubjectMarksRequest")
	public ModelAndView addStudentSubjectMarksRequest(SubjectMarksRequest studentsRequest) {

		ModelAndView model = new ModelAndView();
		try {

			String responsejson = studentService.createStudentSubjectMarks(studentsRequest);

			System.out.println(responsejson);
			JSONObject jsonObject = new JSONObject(responsejson);
			switch (jsonObject.getString("code")) {
			case "200":
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				model.addObject("studentName", jsonObject.getString("studentName"));
				model.addObject("rollNumber", jsonObject.getString("rollNumber"));
				break;
			case "201":
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				break;
			default:
				model.addObject("code", jsonObject.getString("code"));
				model.addObject("discription", jsonObject.getString("discription"));
				model.addObject("message", jsonObject.getString("message"));
				break;
			}

			model.setViewName("user/errorMessage");

		} catch (Exception e) {
			model.addObject("code", "202");
			model.addObject("discription", "Something Went Wrong. Please Try Again!!");
			model.addObject("message", e.getMessage());
		}
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/viewStudentSubjectMarks")
	public ModelAndView viewStudentSubjectMarks() {

		ModelAndView model = new ModelAndView();
		try {

			
			List<StudentSub> responsejson = studentService.getAllStudentsSubjectMark();
			List<SubjectResponseList> listres = new ArrayList<>();

			responsejson.stream().forEach(p -> {
				SubjectResponseList list = new SubjectResponseList();
				Students std = repository.findById(Long.parseLong(p.getStudentId())).get();

				list.setMathematic(p.getMathematic());
				list.setEnglish(p.getEnglish());
				list.setHindi(p.getHindi());
				list.setEnvironment(p.getEnvironment());
				list.setSanskrit(p.getSanskrit());
				list.setScience(p.getScience());
				list.setSocialScience(p.getSocialScience());
				list.setHistory(p.getHistory());
				list.setPoliticalScience(p.getPoliticalScience());
				list.setEconomics(p.getEconomics());
				list.setBusinessStudies(p.getBusinessStudies());
				list.setBookkeepingAndAccountancy(p.getBookkeepingAndAccountancy());
				list.setBusinessEconomics(p.getBusinessEconomics());
				list.setPhysics(p.getPhysics());
				list.setChemistry(p.getChemistry());
				list.setBiology(p.getBiology());
				list.setStudentName(std.getStudentName());
				list.setStudentRollNo(std.getStudentRollNo());
				listres.add(list);
			});

			if (listres != null) {
				model.addObject("code", "200");
				model.addObject("data", listres);
			} else {
				model.addObject("code", "201");
				model.addObject("data", "No students Marks found details found");
			}

			model.setViewName("user/SubjectMarksList");

		} catch (Exception e) {
			model.addObject("code", "202");
			model.addObject("discription", "Something Went Wrong. Please Try Again!!");
			model.addObject("message", e.getMessage());
		}
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/viewMarksheet")
	public ModelAndView viewMarksheet(@RequestParam String getRollNumber) {

		System.out.println("in marksheet");

		ModelAndView model = new ModelAndView();
		try {

			System.out.println("getRollNumber " + getRollNumber);
			Students std = repository.findByStudentRollNo(getRollNumber);

			if (std == null) {
				System.out.println("getRollNumber " + getRollNumber);

				model.addObject("code", "201");
				model.addObject("discription",
						"Students with mentioned roll number not found. Please check roll number.!!");
				model.setViewName("user/errorMessage");
			} else {

				StudentSub p = marksRepository.findByStudentId(std.getStudentId() + "");

				if (p == null) {

					model.addObject("code", "201");
					model.addObject("discription", "Student subject marks not register!!");
					model.setViewName("user/errorMessage");

				} else {
					String biology = (p.getBiology().equalsIgnoreCase("NA")) ? "0" : p.getBiology();

					model.addObject("mathematic", p.getMathematic());
					model.addObject("english", p.getEnglish());
					model.addObject("hindi", p.getHindi());
					model.addObject("environment", p.getEnvironment());
					model.addObject("sanskrit", p.getSanskrit());
					model.addObject("science", p.getScience());
					model.addObject("socialScience", p.getSocialScience());
					model.addObject("history", p.getHistory());
					model.addObject("politicalScience", p.getPoliticalScience());
					model.addObject("economics", p.getEconomics());
					model.addObject("businessStudies", p.getBusinessStudies());
					model.addObject("bookkeepingAndAccountancy", p.getBookkeepingAndAccountancy());
					model.addObject("businessEconomics", p.getBusinessEconomics());
					model.addObject("physics", p.getPhysics());
					model.addObject("chemistry", p.getChemistry());
					model.addObject("biology", biology);
					model.addObject("studentName", std.getStudentName());
					model.addObject("studentRollNo", std.getStudentRollNo());
					model.addObject("scholarNo", std.getStudentScholarNo());
					model.addObject("dateOfbirth", std.getStudentDateOfBirth());
					model.addObject("fatherName", std.getStudentFatherName());
					model.addObject("motherName", std.getStudentMotherName());

					// practical mark.

					model.addObject("physicsPrac", p.getPhysics());
					model.addObject("physicsPrac", p.getChemistry());
					model.addObject("physicsPrac", biology);

					model.addObject("totalMarks",
							Double.parseDouble(biology) + Double.parseDouble(p.getChemistry())
									+ Double.parseDouble(p.getMathematic()) + Double.parseDouble(p.getEnglish())
									+ Double.parseDouble(p.getHindi()) + Double.parseDouble(p.getPhysics()));

					model.addObject("code", "200");
					model.addObject("data", "Student Marksheet success");
					model.setViewName("user/viewStudentMarksheet");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			model.addObject("code", "201");
			model.addObject("discription", e.getMessage());
			model.setViewName("user/errorMessage");
		}

		return model;
	}

	@GetMapping("/new")
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student11thMarks());
		return "user/Student11thMarkRagisterForm";
	}

	@PostMapping("/save11thMarks")
	public String saveOrUpdateStudent(@ModelAttribute("student") Student11thMarks student,Model model) {

		Student11thMarks student11thMarks = student11thService.findByStudentRollNumber(student.getStudentRollNo());

		if (student11thMarks == null) {
			student11thService.saveOrUpdate(student);
			return "redirect:/list";
		} else {
			model.addAttribute("discription", "Student 11thMarks already exists");
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}

	}

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {

		Student11thMarks student = student11thService.findById(id);

		if (student == null) {
			model.addAttribute("discription", "Student not found");
			model.addAttribute("code", "201");
			return "user/errorMessage";
		}
		model.addAttribute("student", student);
		return "user/Student11thMarkRagisterForm";
	}

	@GetMapping("/list")
	public String showAllStudents(Model model) {
		try {

			List<Student11thMarks> students = student11thService.findAll();
			model.addAttribute("students", students);
			return "user/student11thMarkslist";
		} catch (Exception e) {
			model.addAttribute("discription", e.getMessage());
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}
	}

}
<<<<<<< HEAD
=======










>>>>>>> 25218e3 (Security changes)
