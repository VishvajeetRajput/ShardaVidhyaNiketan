<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Sharda Vidhya Niketan</title>
    <link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap">
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            font-family: 'Jost', sans-serif;
            background-color: #f7f7f7; /* Light grey background */
        }

        .login-container {
            width: 400px;
            padding: 40px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            position: relative;
        }

        .login-container h2 {
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
            text-align: center;
        }

        .login-container input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
        }

        .login-container button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background-color: #28a745; /* Green color for the login button */
            color: #fff;
            font-size: 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .login-container button:hover {
            background-color: #218838; /* Darker green on hover */
        }

        /* Loader style */
        .loader {
            display: none; /* Hidden by default */
            border: 5px solid #f3f3f3; /* Light grey */
            border-radius: 50%;
            border-top: 5px solid #3498db; /* Blue */
            width: 40px;
            height: 40px;
            animation: spin 1s linear infinite;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        @keyframes spin {
            0% { transform: rotate(0deg); }
            100% { transform: rotate(360deg); }
        }
    </style>
</head>

<body>
    <div class="login-container">
        <h2>Login</h2>
        <form id="myForm" th:action="@{/v2/adminLogin}" method="post">
            <input type="email" id="email" name="email" placeholder="Email" required="">
            <input type="password" id="password" name="pswd" placeholder="Password" required="">
            <button id="submit" type="submit">Login</button>
        </form>
        <br>
        <div class="error" id="error"></div>
        <div class="loader" id="loader"></div>
    </div>

 <script th:inline="javascript">

 document.getElementById("myForm").addEventListener("submit", function(event) {
            event.preventDefault();
            document.getElementById("submit").style.display = 'none';
            document.getElementById("loader").style.display = 'block';

            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;
            var formData = {
                email,
                password
            };

            fetch('/v2/adminLogin', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            })
            .then(response => response.json())
            .then(data => {

                document.getElementById("loader").style.display = 'none';
                document.getElementById("submit").style.display = 'block';

                console.log(data.JSON);
                console.log(data.json);
                
                if (data.code == '200') {
                    window.location.href = "/AdminLogin";
                } else {
                    
                    document.getElementById("error").innerHTML=data.description;
                    document.getElementById("error").style.color="RED";
                    
					
                    // alert(data.description);
                }
            })
            .catch(error => {
                document.getElementById("loader").style.display = 'none';
                document.getElementById("submit").style.display = 'block';
                console.error('Error:', error);
            //    alert("An error occurred while submitting the login.");
            });
        });

    </script>
</body>
</html>