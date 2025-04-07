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
        <th>ID</th>
        <th>Hindi</th>
        <th>English</th>
        <th>Physics</th>
        <th>Biology</th>
        <th>Chemistry</th>
        <th>Mathematics</th>
        <th>Grade</th>
        <th>Result</th>
        <th>Percentage</th>
        <th>Practical Physics</th>
        <th>Practical Chemistry</th>
        <th>Practical Biology</th>
		 <th>Student Roll No</th>
        <th>Actions</th>
        
      </tr>
    </thead>
    <tbody>
      <tr th:each="student : ${students}">
        <td th:text="${student.id}"></td>

        <td th:text="${student.hindi}"></td>
        <td th:text="${student.english}"></td>
        <td th:text="${student.physics}"></td>
        <td th:text="${student.biology}"></td>
        <td th:text="${student.chemistry}"></td>
        <td th:text="${student.mathematics}"></td>
        <td th:text="${student.grade}"></td>
        <td th:text="${student.result}"></td>
        <td th:text="${student.percentage}"></td>
        <td th:text="${student.praPhysics}"></td>
        <td th:text="${student.praChemistry}"></td>
        <td th:text="${student.praBiology}"></td>
        <td th:text="${student.studentRollNo}"></td>

        <td>
          <a th:href="@{/edit11thSubject/{id}(id=${student.id})}">Edit</a> 
        </td>
      </tr>
    </tbody>
  </table>
</body>
</html>
