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
         body {
         font-family: Arial, sans-serif;
         margin: 0;
         padding: 20px;
         }
         .form-container {
         max-width: 500px;
         margin: 0 auto;
         padding: 20px;
         border: 1px solid #ddd;
         border-radius: 5px;
         }
         label {
         display: block;
         margin-bottom: 5px;
         }
         input[type="text"],
         input[type="number"] {
         width: 100%;
         padding: 10px;
         border: 1px solid #ccc;
         border-radius: 3px;
         box-sizing: border-box;
         }
         button[type="submit"] {
         background-color: #4CAF50; /* Green */
         color: white;
         padding: 10px 20px;
         border: none;
         border-radius: 4px;
         cursor: pointer;
         margin-top: 10px;
         }
         @media only screen and (max-width: 600px) {
         .form-container {
         padding: 10px;
         }
         }
      </style>
   </head>
   <body>
      <div class="form-container">
         <form th:action="@{/update11thMarks}" th:object="${student}" method="post">
            <input type="hidden" th:field="*{id}" />
            <label>Student Roll No: : <input type="text"  th:field="*{studentRollNo}" required="required" title="Please enter a numerical value" /></label><br/>
            <label>Hindi: <input type="text" th:field="*{hindi}" required="required" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>English: <input type="text" th:field="*{english}" required="required" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Physics: <input type="text" th:field="*{physics}" required="required" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Biology: <input type="text" th:field="*{biology}" required="required" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Chemistry: <input type="text" th:field="*{chemistry}" required="required" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Mathematics: <input type="text" th:field="*{mathematics}" required="req uired" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>
               Grade:
               <select name="Grade"  class="form-group custom-select">
                  <option name="Grade" value="A++">A++</option>
                  <option name="Grade" value="A+">A+</option>
                  <option name="Grade" value="A">A</option>
                  <option name="Grade" value="B">B</option>
                  <option name="Grade" value="C">C</option>
                  <option name="Grade" value="D">D</option>
                  <option name="Grade" value="E">E</option>
               </select>
            </label>
            <br/>
            <label>
               Result:	
               <select name="Result"  class="form-group custom-select">
                  <option name="Result" value="Pass">Pass</option>
                  <option name="Result" value="Fail">Fail</option>
                  <option name="Result" value="Other">Other</option>
               </select>
            </label>
            <br/>
            <label>Percentage: <input type="text" th:field="*{percentage}" required="req uired" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Practical Physics: <input type="text" th:field="*{praPhysics}" required="req uired" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Practical Chemistry: <input type="text" th:field="*{praChemistry}" required="req uired" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <label>Practical Biology: <input type="text" th:field="*{praBiology}" required="req uired" pattern="[0-9]+(\.[0-9]+)?" title="Please enter a numerical value" /></label><br/>
            <button type="submit">Save</button>
         </form>
      </div>
   </body>
</html>		