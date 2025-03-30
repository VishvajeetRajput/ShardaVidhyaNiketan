<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<title>Sharda Vidhya Niketan</title>
	<link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous" />
	<link rel="stylesheet" href="style.module.css" />
<style>
table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	text-align: left;
	padding: 8px;
	border: 1px solid #ddd;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

th {
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<table border="0">
		<thead>
			<tr>

				<th>Student Name</th>
				<th>Gender</th>
				<th>Roll No</th>
				<th>Class</th>
				<th>Date of Birth</th>
				<th>Email</th>
				<th>Mobile No</th>
				<th>Father Name</th>
				<th>Mother Name</th>
				<th>Scholar No</th>
				<th>Address 1</th>
				<th>Address 2</th>
				<th>Actions</th>
				<th>Download Marksheet</th>
				<th>Add Marks</th>

			</tr>
		</thead>
		<tbody>

			<tr th:each="student : ${students}">

				<td th:text="${student.studentName}"></td>
				<td th:text="${student.studentGender}"></td>
				<td th:text="${student.studentRollNo}"></td>
				<td th:text="${student.studentClass}"></td>
				<td th:text="${student.studentDateOfBirth}"></td>
				<td th:text="${student.studentEmailOrFatherEmail}"></td>
				<td th:text="${student.studentMobileNoOrFatherMobileNo}"></td>
				<td th:text="${student.studentFatherName}"></td>
				<td th:text="${student.studentMotherName}"></td>
				<td th:text="${student.studentScholarNo}"></td>
				<td th:text="${student.studentAddress1}"></td>
				<td th:text="${student.studentAddress2}"></td>
				<td><a style="text-decoration: none;"
					th:href="@{/editStudent/{id}(id=${student.studentId})}">Edit</a></td>
				<td><a style="text-decoration: none;"
					th:href="@{/viewMarksheet(getRollNumber=${student.studentRollNo}, classValue=${student.studentClass})}">Download
						Marksheet</a></td>
				<td><a style="text-decoration: none;"
					th:href="@{/addSubjectMarks(className=${student.studentClass},getRollNumber=${student.studentRollNo})}">Add
						Marks</a></td>

			</tr>
		</tbody>
	</table>
</body>
</html>

