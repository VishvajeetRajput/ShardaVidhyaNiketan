<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<title>Sharda Vidhya Niketan</title> 
	<link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">

	<link rel="stylesheet" type="text/css" href="slide navbar style.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<style>
body{
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
	font-family: 'Jost', sans-serif;
	background-color:#CCCCFF;
}

.main{
	width: 350px;
	height: 250px;
	background: red;
	background: url("https://doc-08-2c-docs.googleusercontent.com/docs/securesc/68c90smiglihng9534mvqmq1946dmis5/fo0picsp1nhiucmc0l25s29respgpr4j/1631524275000/03522360960922298374/03522360960922298374/1Sx0jhdpEpnNIydS4rnN4kHSJtU1EyWka?e=view&authuser=0&nonce=gcrocepgbb17m&user=03522360960922298374&hash=tfhgbs86ka6divo3llbvp93mg4csvb38") no-repeat center/ cover;
	border-radius: 10px;
	padding-top: 152px;;
	box-shadow: 5px 20px 50px #000;
}

label{
	color: #fff;
	font-size: 2.3em;
	justify-content: center;
	display: flex;
	margin: 50px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}
input{
	width: 60%;
	height: 10px;
	background: #e0dede;
	justify-content: center;
	display: flex;
	margin: 20px auto;
	padding: 12px;
	border: none;
	outline: none;
	border-radius: 5px;
}
button{
	width: 60%;
	height: 40px;
	margin: 10px auto;
	justify-content: center;
	display: block;
	color: #fff;
	background: #573b8a;
	font-size: 1em;
	font-weight: bold;
	margin-top: 30px;
	outline: none;
	border: none;
	border-radius: 5px;
	transition: .2s ease-in;
	cursor: pointer;
}
button:hover{
	background: #6d44b8;
}
.login{
	transform: translateY(-180px);
}
.login label{
	color: #573b8a;
	transform: scale(.6);
}

  /* Media Query for smaller screens */
        @media only screen and (max-width: 768px) {
            .main {
                width: 90%; /* Adjust width */
            }
        }

</style>
<body>
	<div class="main">  	
	<center>
			<div class="login">
			<div class="alert alert-danger" role="alert">Bad credentials</div>
				<form id="myForm" th:action="@{v2/adminLogin}" method="post">
					<label for="chk" aria-hidden="true" style="color:white;">Login</label>
					<input type="email" id="email" name="email" placeholder="Email" required="">
					<input type="password" id="password" name="pswd" placeholder="Password" required="">
					<button id="submit" type="submit">Login</button>
				</form>
				<img id="loder" style="margin-left: 110px; height: 113px; display: none;" src="Images/lodder.gif">
				 <div>
       			<b> <p id="message" ></p></b>
   				 </div>
			</div>
			</center>
	</div>
</body>

 <script th:inline="javascript">

 var url=[[${baseUrl}]];
 document.getElementById("myForm").addEventListener("submit", function(event) {
            event.preventDefault();
            document.getElementById("submit").style.display ='none';
            document.getElementById("loder").style.display ='block';
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
                if (data.code==200) {
                  //  document.getElementById("loder").style.display ='none';
                    //document.getElementById("message").innerText = data.description;
                    //document.getElementById("message").style.color = "Green";
                    //document.getElementById("submit").style.display ='block';
                	//window.location.href =url;
                } else {
                    document.getElementById("loder").style.display ='none';
                    document.getElementById("message").innerText = data.description;
                    document.getElementById("message").style.color = "Red";
                    document.getElementById("submit").style.display ='block';
                }
            })
            .catch(error => {
                document.getElementById("loder").style.display ='none';
                document.getElementById("submit").style.display ='block';
                console.error('Error:', error);
                document.getElementById("message").innerText = "An error occurred while submitting the login.";
            });
        });
    </script>
</html>