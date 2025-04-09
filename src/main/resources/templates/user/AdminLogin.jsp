<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Sharda Vidhya Niketan</title>
    <link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous" />
    <link rel="stylesheet" href="style.module.css" />
  </head>
  <body>
    <header style="box-shadow: 0 5px 10px rgb(0 0 0/ 0.2)">
      <div class="header_section"
        style="padding: 3px; display: flex; justify-content: space-between; align-items: center; margin: 0px 30px;">
        <div>
            </div>
        <div>
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNtiML_ZRiUjLiFSzpmDKf6ssIG-dhHgND5rKzavWJ_oi48XhvVP9E-fJ8UnC1vqm7a-c&usqp=CAU" style="width: 150px; height: 50px" />
        </div>
      </div>
    </header>
    <div>
      <div class="section_container" style="display: flex; justify-content: space-evenly; align-items: center;">
        <div class="section_wrapper_left"
          style="width: auto; display: flex; align-items: center; justify-content: center;">
          <img src="https://img.freepik.com/free-vector/happy-girl-alphabet-flashcard-letter_1308-72210.jpg?t=st=1710906294~exp=1710909894~hmac=0494fe218ce7f988996675db286050a99e5dde4281ad0dd3246004cf2a365336&w=740" style=" width: 50%; height: 70%;" class="img-fluid" />
        </div>
        <div class="section_wrapper_right"
          style="width: 420px; height: 500px; margin: 16px; padding: 10px 30px; display: flex; justify-content: space-between; flex-direction: column; box-shadow: 0 15px 15px rgb(0 0 0/ 0.2); border-radius: 8px;">
          <div style="margin-top: 2px">
            <h2 style="color: rgb(56, 23, 118); letter-spacing: 1px">
              Sharda Vidhya Niketan
            </h2>
          </div>
          <div>
            <label
              style="color: rgb(56, 23, 118); display: block; letter-spacing: 3px; font-weight: 600; font-size: 16px; line-height: 10px; ">Register Students 
            </label></br> 
            <a th:href="@{/studentRegistration}" style="text-decoration: none;"> 
            <button class="button-63" role="button">Click here to Register Students</button>
            </a>
          </div>
          <div>
            <label
              style="color: rgb(56, 23, 118); display: block; letter-spacing: 3px; font-weight: 600; font-size: 16px; line-height: 10px;">Students List
            </label> 
            <br/>
            <select id="studentClassSelect" name="studentClass"
              class="form-group custom-select">
              <option name="studentRollNo" value="Select Class">Select Class</option>
              <option name="studentRollNo" value="KG1st">KG1st</option>
              <option name="studentRollNo" value="KG2nd">KG2nd</option>
              <option name="studentRollNo" value="1st">1st</option>
              <option name="studentRollNo" value="2nd">2nd</option>
              <option name="studentRollNo" value="3th">3th</option>
              <option name="studentRollNo" value="4th">4th</option>
              <option name="studentRollNo" value="5th">5th</option>
              <option name="studentRollNo" value="6th">6th</option>
              <option name="studentRollNo" value="7th">7th</option>
              <option name="studentRollNo" value="8th">8th</option>
              <option name="studentRollNo" value="9th">9th</option>
              <option name="studentRollNo" value="11th">11th</option>
              <option name="studentRollNo" value="11thBio">11thBio</option>
              <option name="studentRollNo" value="11thCommerce">11thCommerce</option>
              <option name="studentRollNo" value="11thArt">11thArt</option>
              <option name="studentRollNo" value="11thMath">11thMath</option>
              
            </select>
            <br/></br> 
            <br> <a id="addMarksLink" href="#" style="text-decoration: none;">
            <button id="StudentScholarNoBtn"
              type="button" class="button-63">Click here
            to add student marks</button>
            </a>
          </div>
          <div></div>
          <div></div>
        </div>
      </div>
    </div>
    <footer class="footer">
      <div class="container4">
        <p>&copy; 2024 Vishvajeet Rajput. All rights reserved.</p>
      </div>
    </footer>
  </body>
  <style>
    .footer {
    background-color: #333;
    color: #fff;
    padding: 20px 0;
    }
    .container4 {
    width: 80%;
    margin: 0 auto;
    text-align: center;
    }
    @media (max-width : 768px) {
    .section_wrapper_left img {
    display: none;
    }
    .section_container {
    margin-left: -65px;
    height: 600px;
    }
    .section_wrapper_left {
    margin: 16px;
    padding: 16px;
    }
    }
    .button-63 {
    align-items: center;
    background-image: linear-gradient(144deg,#AF40FF, #5B42F3 50%,#00DDEB);
    border: 0;
    border-radius: 8px;
    box-shadow: rgba(151, 65, 252, 0.2) 0 15px 30px -5px;
    box-sizing: border-box;
    color: #FFFFFF;
    display: flex;
    font-family: Phantomsans, sans-serif;
    font-size: 20px;
    justify-content: center;
    line-height: 1em;
    max-width: 100%;
    min-width: 140px;
    padding: 15px 20px;
    text-decoration: none;
    user-select: none;
    -webkit-user-select: none;
    touch-action: manipulation;
    white-space: nowrap;
    cursor: pointer;
    }
    .button-63:active,
    .button-63:hover {
    outline: 0;
    }
    @media (min-width: 768px) {
    .button-63 {
    font-size: 20px;
    min-width: 196px;
    }
    }
    /* Media Query for smaller screens */
    @media only screen and (max-width: 768px) {
    .main {
    width: 90%; /* Adjust width */
    }
    }
  </style>
  <script th:inline="javascript">
    document.getElementById('studentClassSelect').addEventListener('change', function() {
        var selectedValue = this.value;
        var link = document.getElementById('addMarksLink');
        link.href = '/viewStudentDetails?className=' + encodeURIComponent(selectedValue);
    });
    	
    
  </script>
</html>