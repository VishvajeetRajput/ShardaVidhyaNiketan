<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Sharda Vidhya Niketan</title>
    <link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type" />

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.module.css" />
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
      }

      .container {
        max-width: 600px;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }

      h2 {
        text-align: center;
        color: #333;
      }

      form {
        margin-top: 20px;
      }

      label {
        font-weight: bold;
        display: block;
        margin-bottom: 8px;
      }

      input[type="text"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        margin-bottom: 15px;
        box-sizing: border-box;
      }

      input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
      }

      input[type="submit"]:hover {
        background-color: #45a049;
      }
    </style>
  </head>

  <body>
    <div class="container">
      <h2>Enter Subject Marks</h2>
      <form action="addStudentSubjectMarksRequest" method="post">
        <label for="Mathematic">Mathematics:</label>
        <input type="text" id="Mathematic" name="Mathematic" value />
        <label for="English">English:</label>
        <input type="text" id="English" name="English" value />
        <label for="Hindi">Hindi:</label>
        <input type="text" id="Hindi" name="Hindi" value />
        <label for="Environment">Environment:</label>
        <input type="text" id="Environment" name="Environment" value />
        <label for="Sanskrit">Sanskrit:</label>
        <input type="text" id="Sanskrit" name="Sanskrit" value />
        <label for="Science">Science:</label>
        <input type="text" id="Science" name="Science" value />
        <label for="SocialScience">Social Science:</label>
        <input type="text" id="SocialScience" name="SocialScience" value />
        <label for="History">History:</label>
        <input type="text" id="History" name="History" value />
        <label for="PoliticalScience">Political Science:</label>
        <input 
          type="text"
          id="PoliticalScience"
          name="PoliticalScience"
          value
        />
        <label for="Economics">Economics:</label>
        <input type="text" id="Economics" name="Economics" value />

        <label for="BusinessStudies">Business Studies:</label>
        <input type="text" id="BusinessStudies" name="BusinessStudies" value />

        <label for="BookkeepingAndAccountancy"
          >Bookkeeping and Accountancy:</label
        >
        <input
          type="text"
          id="BookkeepingAndAccountancy"
          name="BookkeepingAndAccountancy"
          value
        />
        <label for="BusinessEconomics">Business Economics:</label>
        <input
          type="text"
          id="BusinessEconomics"
          name="BusinessEconomics"
          value
        />
        <label for="Physics">Physics:</label>
        <input type="text" id="Physics" name="Physics" value />
        <label for="Chemistry">Chemistry:</label>
        <input type="text" id="Chemistry" name="Chemistry" value />
        <label for="Biology">Biology:</label>
        <input type="text" id="Biology" name="Biology" value />
        <label for="studentRollNumber">Student rollNo:</label>
        <input
          type="text"
          id="studentRollNumber"
          name="studentRollNumber"
          value
        />
        <input type="submit" value="Submit" />
      </form>
    </div>
  </body>
</html>
