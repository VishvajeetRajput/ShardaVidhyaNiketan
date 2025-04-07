package com.sharda.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sharda.entity.Student11thCommMarks;
import com.sharda.entity.Student11thMarks;
import com.sharda.entity.Student8thMarks;
import com.sharda.entity.Student9thMarks;
import com.sharda.entity.Students;
import com.sharda.repo.StudentsRepository;
import com.sharda.request.ResponseMessage;
import com.sharda.request.StudentsRequest;
import com.sharda.request.SubjectMarksRequest;
import com.sharda.request.SubjectResponseList;
import com.sharda.service.Student11thService;
import com.sharda.service.Student9thService;
import com.sharda.service.StudentService;


@Controller
public class HomeController {

	private StudentService studentService;
	private StudentsRepository repository;
	private Student11thService student11thService;
	private Student9thService student9thService;
	

	
	public HomeController(StudentService studentService, StudentsRepository repository,
			Student11thService student11thService, Student9thService student9thService) {
		this.studentService = studentService;
		this.repository = repository;
		this.student11thService = student11thService;
		this.student9thService = student9thService;
	}

	@RequestMapping(method = RequestMethod.GET, value = "")
	public ModelAndView paymentLink() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/HomePage");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/AdminLogin")
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

			model.addObject("student", new Students());
			model.setViewName("user/StudentRegistration");

		} catch (Exception e) {
			e.printStackTrace();
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
	public String studentRegistrationRequest(StudentsRequest studentsRequest, Model model) {

		try {

			String responsejson = studentService.createStudent(studentsRequest);

			JSONObject jsonObject = new JSONObject(responsejson);
			if (jsonObject.getString("code").equalsIgnoreCase("200")) {

				return "redirect:/viewStudentDetails?className="+studentsRequest.getStudentClass();
			} else if (jsonObject.getString("code").equalsIgnoreCase("201")) {
				model.addAttribute("code", jsonObject.getString("code"));
				model.addAttribute("discription", jsonObject.getString("discription"));

			} else {
				model.addAttribute("code", jsonObject.getString("code"));
				model.addAttribute("discription", jsonObject.getString("discription"));
				model.addAttribute("message", jsonObject.getString("message"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("code", "202");
			model.addAttribute("discription", "Something Went Wrong. Please Try Again!!");
			model.addAttribute("message", e.getMessage());
		}

		return "user/errorMessage";
	}
 
	@RequestMapping(method = RequestMethod.GET, value = "/viewStudentDetails")
	public String viewStudentDetails(@RequestParam String className,Model model) {

		
		try {

			List<Students> students = studentService.findByClassName(className);
			
			
			Collections.sort(students, Comparator.comparing(Students::getStudentId).reversed());

			model.addAttribute("students", students);
			return "user/StudentList";

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("code", "202");
			model.addAttribute("discription", "Something Went Wrong. Please Try Again!!");
			model.addAttribute("message", e.getMessage());
		}
		return "user/errorMessage";
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

	@RequestMapping(method = RequestMethod.GET, value = "/subjectMarksAndList")
	public ModelAndView subjectMarksAndList() {

		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/SubjectMarksAndList");

		} catch (Exception e) {

		}

		return model;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addSubjectMarks")
	public ModelAndView addSubjectMarkrs(@RequestParam String className, @RequestParam String getRollNumber) {
		ModelAndView model = new ModelAndView();
		try {
			String hey = "";
			switch (className) {
			case "KG1st":
				hey = "hey";
				break;
			case "KG2st":
				hey = "hey";
				break;
			case "1st":
				hey = "hey";
				break;
			case "2nd":
				hey = "hey";
				break;
			case "3rd":
				
				hey = "hey";
				break;
			case "4th":
				hey = "hey";
				break;
			case "5th":
				hey = "hey";
				break;
			case "6th":
				model.addObject("student", new Student8thMarks());
				hey = "Student6thMarkRagisterForm";
				break;
			case "7th":
				model.addObject("student", new Student8thMarks());
				hey = "Student7thMarkRagisterForm";
				break;
			case "8th":
				
				model.addObject("student", new Student8thMarks());
				hey = "Student8thMarkRagisterForm";
				
				break;
			case "9th":
				model.addObject("student", new Student9thMarks());
				hey = "Student9thMarkRagisterForm";
				break;
			
			 case "11thScience":
			    case "11thCommerce":
				model.addObject("student", new Student11thMarks());
				hey = "Student11thMarkRagisterForm";
				break;
			case "11thCommerce ":
				model.addObject("student", new Student11thCommMarks());
				hey = "Student11thComMarkRagisterForm";
				break;
			
			default:
				hey = "hey";
				break;
			}
			model.addObject("rollNumer", getRollNumber);
			model.setViewName("user/" + hey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addStudentSubjectMarksRequest")
	public String addStudentSubjectMarksRequest(SubjectMarksRequest studentsRequest, Model model) {

		try {

			String responsejson = studentService.createStudentSubjectMarks(studentsRequest);

			JSONObject jsonObject = new JSONObject(responsejson);

			if (jsonObject.getString("code").equalsIgnoreCase("200")) {

				return "redirect:/viewStudentDetails";
			} else {

				model.addAttribute("code", jsonObject.getString("code"));
				model.addAttribute("discription", jsonObject.getString("discription"));
				model.addAttribute("message", jsonObject.getString("message"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("code", "202");
			model.addAttribute("discription", "Something Went Wrong. Please Try Again!!");
			model.addAttribute("message", e.getMessage());
		}

		return "user/errorMessage";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/viewStudentSubjectMarks")
	public ModelAndView viewStudentSubjectMarks() {

		ModelAndView model = new ModelAndView();
		try {

//			List<StudentSub> responsejson = studentService.getAllStudentsSubjectMark();
			List<SubjectResponseList> listres = new ArrayList<>();

//			responsejson.stream().forEach(p -> {
//				SubjectResponseList list = new SubjectResponseList();
//				Students std = repository.findById(Long.parseLong(p.getStudentId())).get();
//
//				list.setMathematic(p.getMathematic());
//				list.setEnglish(p.getEnglish());
//				list.setHindi(p.getHindi());
//				list.setEnvironment(p.getEnvironment());
//				list.setSanskrit(p.getSanskrit());
//				list.setScience(p.getScience());
//				list.setSocialScience(p.getSocialScience());
//				list.setHistory(p.getHistory());
//				list.setPoliticalScience(p.getPoliticalScience());
//				list.setEconomics(p.getEconomics());
//				list.setBusinessStudies(p.getBusinessStudies());
//				list.setBookkeepingAndAccountancy(p.getBookkeepingAndAccountancy());
//				list.setBusinessEconomics(p.getBusinessEconomics());
//				list.setPhysics(p.getPhysics());
//				list.setChemistry(p.getChemistry());
//				list.setBiology(p.getBiology());
//				list.setStudentName(std.getStudentName());
//				list.setStudentRollNo(std.getStudentRollNo());
//				listres.add(list);
//			});

			if (listres != null) {
				model.addObject("code", "200");
				model.addObject("data", listres);
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
	public ModelAndView viewMarksheet(@RequestParam String getRollNumber, @RequestParam String classValue) {

		ModelAndView model = new ModelAndView();
		try {

			Students std = repository.findByStudentRollNo(getRollNumber);

			if (std == null) {
				model.addObject("code", "201");
				model.addObject("discription",
						"Students with mentioned roll number not found. Please check roll number.!!");
				model.setViewName("user/errorMessage");
			} else {
				switch (classValue) {

				case "11th":
					set11thMarksheet(getRollNumber, model);
					break;
				case "9th":
					set9thMarksheet(getRollNumber, model);
				}

				
				model.addObject("studentName", std.getStudentName());
				model.addObject("studentClass", std.getStudentClass());
				model.addObject("studentRollNo", std.getStudentRollNo());
				model.addObject("scholarNo", std.getStudentScholarNo());
				model.addObject("dateOfbirth", std.getStudentDateOfBirth());
				model.addObject("fatherName", std.getStudentFatherName());
				model.addObject("motherName", std.getStudentMotherName());
			}

		} catch (Exception e) {
			e.printStackTrace();
			model.addObject("code", "201");
			model.addObject("discription", e.getMessage());
			model.setViewName("user/errorMessage");
		}

		return model;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/studentRegistrationUpdate")
	public String studentRegistrationUpdate(StudentsRequest studentsRequest, Model model) {

		try {

			studentService.updateStudent(studentsRequest);
			return "redirect:/viewStudentDetails?className="+studentsRequest.getStudentClass();

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("code", "202");
			model.addAttribute("discription", "Something Went Wrong. Please Try Again!!");
			model.addAttribute("message", e.getMessage());
		}

		return "user/errorMessage";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/studentRegistrationRequestUpdate")
	public String studentRegistrationRequestUpdate(StudentsRequest studentsRequest, Model model) {

			try {

				String responsejson = studentService.createStudent(studentsRequest);

				JSONObject jsonObject = new JSONObject(responsejson);
				if (jsonObject.getString("code").equalsIgnoreCase("200")) {

					return "redirect:/viewStudentDetails";
				} else if (jsonObject.getString("code").equalsIgnoreCase("201")) {
					model.addAttribute("code", jsonObject.getString("code"));
					model.addAttribute("discription", jsonObject.getString("discription"));

				} else {
					model.addAttribute("code", jsonObject.getString("code"));
					model.addAttribute("discription", jsonObject.getString("discription"));
					model.addAttribute("message", jsonObject.getString("message"));
				}

			} catch (Exception e) {
				e.printStackTrace();
				model.addAttribute("code", "202");
				model.addAttribute("discription", "Something Went Wrong. Please Try Again!!");
				model.addAttribute("message", e.getMessage());
			}

			return "user/errorMessage";
		}
	
	@GetMapping("/editStudent/{id}")
	public String editStudent(@PathVariable Long id, Model model) {

		Students student = studentService.getStudentById(id);

		if (student == null) {
			model.addAttribute("discription", "Student not found");
			model.addAttribute("code", "201");
			return "user/errorMessage";
		}
		model.addAttribute("student", student);

		return "user/StudentRegistrationUpdate";
	}
	
	
	// <--   11th Science Configuration start from here
	
	@GetMapping("/student11thMarkRagister")
	public String student11thMarkRagister(Model model) {
		model.addAttribute("student", new Student11thMarks());
		return "user/Student11thMarkRagisterForm";
	}

	@PostMapping("/save11thMarks")
	public String save11thMarks(@ModelAttribute("student") Student11thMarks student, Model model) {

		Student11thMarks student11thMarks = student11thService.findByStudentRollNumber(student.getStudentRollNo());

		if (student11thMarks == null) {
			student11thService.saveOrUpdate(student);
			return "redirect:/Student11thMarkslist";
		} else {
			model.addAttribute("discription", "Student 11thMarks already exists");
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}

	}
	
	@PostMapping("/update11thMarks")
	public String update11thMarks(@ModelAttribute("student") Student11thMarks student, Model model) {

		Student11thMarks student11thMarks = student11thService.findByStudentRollNumber(student.getStudentRollNo());

		if (student11thMarks != null) {
			student11thService.saveOrUpdate(student);
			return "redirect:/Student11thMarkslist";
		} else {
			model.addAttribute("discription", "Student 11thMarks Not Found");
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}

	}
	
	@GetMapping("/edit11thSubject/{id}")
	public String edit11thSubject(@PathVariable Long id, Model model) {

		Student11thMarks student = student11thService.findById(id);

		if (student == null) {
			model.addAttribute("discription", "Subject not found");
			model.addAttribute("code", "201");
			return "user/errorMessage";
		}
		model.addAttribute("student", student);

		return "user/Student11thMarkUpdateRagisterForm";
	}

	@GetMapping("/Student11thMarkslist")
	public String student11thMarkslist(Model model) {
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

	public void set11thMarksheet(String getRollNumber, ModelAndView model) {

		Student11thMarks p = student11thService.findByStudentRollNumber(getRollNumber + "");
		if (p == null) {

			model.addObject("code", "201");
			model.addObject("discription", "Student subject marks not register!!");
			model.setViewName("user/errorMessage");
		} else {
			String biology = (p.getBiology().equalsIgnoreCase("NA")) ? "0" : p.getBiology();

			model.addObject("mathematic", p.getMathematics());
			model.addObject("english", p.getEnglish());
			model.addObject("hindi", p.getHindi());
			model.addObject("physics", p.getPhysics());
			model.addObject("chemistry", p.getChemistry());
			model.addObject("biology", biology);
			// practical mark.
			model.addObject("physicsPrac", p.getPraPhysics());
			model.addObject("chemistryPrac", p.getPraChemistry());
			model.addObject("bioPrac", p.getPraBiology());
			
			model.addObject("mathematicTotal", p.getMathematics());
			model.addObject("englishTotal", p.getEnglish());
			model.addObject("hindiTotal", p.getHindi());
			
			
			model.addObject("physicsTotal", (Double.parseDouble(p.getPhysics())+Double.parseDouble(p.getPraPhysics())));
			model.addObject("chemistryTotal", (Double.parseDouble(p.getChemistry())+ Double.parseDouble(p.getPraChemistry())));
			model.addObject("biologyTotal", (Double.parseDouble(biology)+Double.parseDouble(p.getPraBiology())));

			
			
			model.addObject("totalMarkSub", 510);
			model.addObject("totalMarkPacSub", 90);
			model.addObject("totalPacMark", Double.parseDouble(p.getPraPhysics()) + Double.parseDouble(p.getPraChemistry())
			+ Double.parseDouble(p.getPraBiology()));
			
			
			model.addObject("totalMarksWithpra",
					Double.parseDouble(biology) + Double.parseDouble(p.getChemistry())
							+ Double.parseDouble(p.getMathematics()) + Double.parseDouble(p.getEnglish())
							+ Double.parseDouble(p.getHindi()) + Double.parseDouble(p.getPhysics())+Double.parseDouble(p.getPraPhysics()) + Double.parseDouble(p.getPraChemistry())
							+ Double.parseDouble(p.getPraBiology()));
			
			model.addObject("totalMarks",
					Double.parseDouble(biology) + Double.parseDouble(p.getChemistry())
							+ Double.parseDouble(p.getMathematics()) + Double.parseDouble(p.getEnglish())
							+ Double.parseDouble(p.getHindi()) + Double.parseDouble(p.getPhysics()));

			if ( p.getPercentage()>=60) {
				model.addObject("Division", "Ist");

			} else if (p.getPercentage()<=40) {
				model.addObject("Division", "IInd");
			}else {
				model.addObject("Division", "IIIrd");
			}
			
			model.addObject("percentage", p.getPercentage()+"%");
			
			model.addObject("code", "200");
			model.addObject("students", p);
			model.addObject("data", "Student Marksheet success");
			model.setViewName("user/viewStudent11thMarksheet");

		}

	}
	
	// <--   11th Commerce Configuration start from here
	
	@GetMapping("/student11thCommerceMarkRagister")
	public String student11thCommerceMarkRagister(Model model) {
		model.addAttribute("student", new Student11thCommMarks());
		return "user/Student11thCommMarkRagisterForm";
	}

	// <-- 9th Configuration start from here
	
	@GetMapping("/student9thMarkRagister")
	public String student9thMarkRagister(Model model) {
		model.addAttribute("student", new Student9thMarks());
		return "user/Student9thMarkRagisterForm";
	}

	@PostMapping("/save9thMarks")
	public String save9thMarks(@ModelAttribute("student") Student9thMarks student, Model model) {

		Student9thMarks student9thMarks = student9thService.findByStudentRollNumber(student.getStudentRollNo());

		if (student9thMarks == null) {
			student9thService.saveOrUpdate(student);
			return "redirect:/Student9thMarkslist";
		} else {
			model.addAttribute("discription", "Student 9thMarks already exists");
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}

	}

	@PostMapping("/update9thMarks")
	public String update9thMarks(@ModelAttribute("student") Student9thMarks student, Model model) {

		Student9thMarks student9thMarks = student9thService.findByStudentRollNumber(student.getStudentRollNo());

		if (student9thMarks != null) {
			student9thService.saveOrUpdate(student);
			return "redirect:/Student9thMarkslist";
		} else {
			model.addAttribute("discription", "Student 11thMarks Not Found");
			model.addAttribute("code", "201");
			return "user/errorMessage";

		}

	}
	
	@GetMapping("/Student9thMarkslist")
	public String student9thMarkslist(Model model) {
		try {

			List<Student9thMarks> students = student9thService.findAll();
			model.addAttribute("students", students);
			return "user/student9thMarkslist";
		} catch (Exception e) {
			model.addAttribute("discription", e.getMessage());
			model.addAttribute("code", "201");
			return "user/errorMessage";

			
		}
	}
	
	public void set9thMarksheet(String getRollNumber, ModelAndView model) {

		Student9thMarks p = student9thService.findByStudentRollNumber(getRollNumber + "");
		if (p == null) {

			model.addObject("code", "201");
			model.addObject("discription", "Student subject marks not register!!");
			model.setViewName("user/errorMessage");
		} else {

			model.addObject("code", "200");
			model.addObject("students", p);
			model.addObject("data", "Student Marksheet success");
			model.setViewName("user/viewStudent9thMarksheet");

		}

	}
	
	@GetMapping("/edit9thSubject/{id}")
	public String edit9thSubject(@PathVariable Long id, Model model) {

		Student9thMarks student = student9thService.findById(id);

		if (student == null) {
			model.addAttribute("discription", "Subject not found");
			model.addAttribute("code", "201");
			return "user/errorMessage";
		}
		model.addAttribute("student", student);

		return "user/Student9thMarkUpdateRagisterForm";
	}
	
	
	// <-- 8th Configuration start from here

	@GetMapping("/student8thMarkRagister")
	public String student8thMarkRagister(Model model) {
		model.addAttribute("student", new Student11thMarks());
		return "user/Student8thMarkRagisterForm";
	}
	
	
}
