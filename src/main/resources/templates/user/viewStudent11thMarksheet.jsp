<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Sharda Vidhya Niketan</title>
<link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous" />
<link rel="stylesheet" href="style.module.css" />


</head>

<body>
	
	<br/>
	<header class="responsive-header">
	        <div class="header-content" >
	            <div class="header-logo"style="display: flex; justify-content: space-between;">
	                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNtiML_ZRiUjLiFSzpmDKf6ssIG-dhHgND5rKzavWJ_oi48XhvVP9E-fJ8UnC1vqm7a-c&usqp=CAU" alt="School Logo"style="width: 150px; height: 50px" >
	            </div>
	        </div>
	    </header>
	
	
		<center>
	<div>
		<div class="section_containerop"
			style="display: flex; justify-content: space-evenly; align-items: center; padding: 5Px;">

			<div class="section_wrapper_right"
				style="padding: 10px 30px; display: flex; justify-content: space-between; flex-direction: column; box-shadow: 0 15px 15px rgb(0 0 0/ 0.2); border-radius: 8px;">

				

					<table class="responsive-table">
						<thead>
							<tr>
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
							</tr>
						</thead>
						<tbody>
							<tr th:each="student : ${students}">
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
							</tr>
						</tbody>
					</table>


					<div class="containerio" id="11thMath">



						<img style="height: 10%; width: 50%; display: none;" id="image"
							src="Images/MarksheetUp1.jpg"> 
					<!--	<a id="downloadLink"
							download="Marked_Marksheet.jpg" href="#" style="display: block;">Download
							Marksheet</a>-->
							<a id="downloadLink"
							 download="Marked_Marksheet.jpg" href="#" style="display: none;">Download Marksheet</a>


					</div>


				</center>


			</div>
		</div>
	</div>
	<footer class="footer">
		<div class="container4">
			<center>
				<p>&copy; 2024 Vishvajeet Rajput. All rights reserved.</p>

			</center>


		</div>

	</footer>
</body>

<style>
.responsive-table {
	width: 100%;
	border-collapse: collapse;
	margin: 20px 0;
	font-size: 16px;
	color: #333;
	background-color: #f0f8ff; /* Light blue background */
}

.responsive-table th, .responsive-table td {
	padding: 12px;
	text-align: left;
	border: 1px solid #ddd; /* Light gray border */
}

.responsive-table th {
	background-color: #87cefa; /* Light sky blue */
	color: #fff;
}

.responsive-table tr:nth-child(even) {
	background-color: #e6f7ff; /* Even row color */
}

.responsive-table tr:hover {
	background-color: #d0e8ff; /* Row hover color */
}

.containerio {
	position: relative;
	width: 100%;
}

.text {
	position: absolute;
	/* Text color */
	font-size: 11px; /* Adjust font size as needed */
	color: rgb(0, 112, 192);
	font-weight: bold;
}

.bottom-left {
	bottom: 0;
	left: 0;
}

.studentName {
	top: 235px;
	left: 162px;
}

.fatherName {
	top: 282px;
	left: 419px;
}

.motherName {
	top: 276px;
	left: 111px;
}

.dateOfBirth {
	top: 320px;
	left: 223px;
}

.scholarNo {
	top: 189px;
	left: 290px;
}

.studentRollNo {
	top: 192px;
	left: 494px;
}

.physics {
	left: 435px;
}

.chemistry {
	top: 591px;
	left: 434px;
	left: 434px;
}

.biology {
	top: 626px;
	left: 437px;
}

.mathematic {
	top: 664px;
	left: 434px;
}

.totalMarks {
	top: 691px;
	left: 434px;
}

.english {
	top: 516px;
	left: 435px;
}

.hindi {
	top: 480px;
	left: 435px;
}

.top-right {
	top: 0;
	right: 0;
}

.bottom-right {
	bottom: 0;
	right: 0;
}

.centered {
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
</style>

<script th:inline="javascript">
	
	window.onload = function() {
		
		document.getElementById("downloadLink").style.display = "block";

 
let studentRollNo=[[${studentRollNo}]];
let name=[[${studentName}]];
let studentClass=[[${studentClass}]];
let fatherName=[[${fatherName}]];
let motherName=[[${motherName}]];
let scholarNo=[[${scholarNo}]];

let physics=[[${physics}]];
let chemistry=[[${chemistry}]];
let biology=[[${biology}]];
let mathematic=[[${mathematic}]];
let english=[[${english}]];
let hindi=[[${hindi}]];

let physicsTotal=[[${physicsTotal}]];
let chemistryTotal=[[${chemistryTotal}]];
let biologyTotal=[[${biologyTotal}]];
let mathematicTotal=[[${mathematicTotal}]];
let englishTotal=[[${englishTotal}]];
let hindiTotal=[[${hindiTotal}]];


let totalMarks=[[${totalMarks}]];
let dateOfBirth=[[${dateOfbirth}]];
let totalMarkSub=[[${totalMarkSub}]];
let totalMarkPacSub=[[${totalMarkPacSub}]];
let totalPacMark=[[${totalPacMark}]];
let totalMarksWithpra=[[${totalMarksWithpra}]];
let percentage=[[${percentage}]];
let division=[[${Division}]];


let physicsPrac=[[${physicsPrac}]];
let chemistryPrac=[[${chemistryPrac}]];
let bioPrac=[[${bioPrac}]];
	
document.getElementById("downloadLink").addEventListener("click", function() {
  
	  
		var image = document.getElementById("image");
	    var canvas = document.createElement("canvas");
	    var context = canvas.getContext("2d");

	    // Ensure the image is fully loaded before drawing it
	    if (image.complete) {
	        drawCanvas();
	    } else {
	        image.onload = drawCanvas;
	    }

	    function drawCanvas() {
	        // Set canvas dimensions to match the natural image dimensions
	        canvas.width = image.naturalWidth;
	        canvas.height = image.naturalHeight;

	        // Draw the image on the canvas
	        context.drawImage(image, 0, 0, canvas.width, canvas.height);

	        // Draw text on the canvas
	        context.font = "40px Arial"; // Adjust font size and style as needed
	        context.fillStyle = "rgb(0, 112, 192)"; // Using an RGB color value
	        context.fillText(dateOfBirth, 645, 1540);
	        context.fillText(dateOfBirth, 770, 1650);

	        context.fillText(studentRollNo, 1950, 930);
	        context.fillText(name, 600, 1220); 
	        context.fillText(fatherName, 450, 1420);
	        context.fillText(motherName, 720, 1320);
	        context.fillText(scholarNo, 820, 930);
	        
			context.fillText(hindi, 1370, 2280);
	        context.fillText(english, 1370, 2360);        
	        context.fillText(physics, 1370, 2440);
	        context.fillText(chemistry, 1370, 2520);
	        context.fillText(biology, 1370, 2600);
	        context.fillText(mathematic, 1370, 2670);


			context.fillText(physicsPrac, 1800, 2440);
			context.fillText(chemistryPrac, 1800, 2520);
			context.fillText(bioPrac, 1800, 2600);
			
			context.fillText(totalMarkSub, 850, 2750);
			context.fillText(totalMarkPacSub, 1090, 2750);
	        context.fillText(totalMarks, 1370, 2750);
	        context.fillText(totalPacMark, 1800, 2750);
	        context.fillText(totalMarksWithpra, 2170, 2750);
	       
			 context.fillText(percentage, 500, 3010);
			 context.fillText(division, 1370, 3010);

				
	        context.fillText(hindiTotal, 2170, 2280);
	        context.fillText(englishTotal, 2170, 2360);        
	        context.fillText(physicsTotal, 2170, 2440);
	        context.fillText(chemistryTotal, 2170, 2520);
	        context.fillText(biologyTotal, 2170, 2600);
	        context.fillText(mathematicTotal, 2170, 2680);
			
		    var downloadFileName = `Marksheet_${studentRollNo}_${name}_${studentClass}.jpg`;

	        var downloadLink = document.getElementById("downloadLink");
	        downloadLink.href = canvas.toDataURL("image/jpeg");
			
	        downloadLink.setAttribute('download', downloadFileName);
	    
	    }
	
		
});

}
</script>
</html>