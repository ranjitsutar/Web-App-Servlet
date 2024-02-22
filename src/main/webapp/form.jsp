<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Form</title>

	<style>
		.container{
		margin: auto;
		width: 40%;
		border: 5px solid green; 
		padding: 20px;
		font-size: 20px;		
		}
		#form div table tr td input{
			font-size: 20px;
		
		}
		
	
	</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Form</h1>

		<form id="form" action="/form" method="post">

			<div class="container-form">
				<table>
					<tr>
						<td>EnterName</td>
						<td><input type="text" name="name"
							placeholder="Enter your name"></td>
					</tr>
					<tr>
						<td>EnterEmail</td>
						<td><input type="email" name="email"
							placeholder="Enter your email"></td>
					</tr>
					<tr>
						<td>EnterPassword</td>
						<td><input type="password" name="password"
							placeholder="Enter your password"></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><input type="radio" name="radio" value="male">Male
							&nbsp <input type="radio" name="radio" value="female">Female</td>
					</tr>
					<tr>
						<td>Select your course</td>
						<td><select name="course">
								<option value="Java">Java</option>
								<option value="Pyton">Python</option>
								<option value="Spring">Spring</option>
								<option value="React">React</option>
								<option value="Angular">Angular</option>
						</select></td>
					</tr>
					<tr>
						<td style="text-align: right;"><input type="checkbox"
							value="checked" name="condition"></td>
						<td>Agree T&C</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<button type="submit">Submit</button>
							<button type="reset">Reset</button>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>