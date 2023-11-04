<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="AddStudentController">

			<div>
				<label>Student name</label> <input type="text" name="txtStudentName">
			</div>
			<div>
				<label>Student Email</label> <input type="text"
					name="txtStudentEmail">
			</div>
			<div>
				<label>Student Age</label> <input type="text" name="txtStudentAge">
			</div>
			<div>
				<label>Skills</label>
				<br>
				HTML : <input type="checkbox" value="HTML" name="chStudentSkills"><br>
				CSS : <input type="checkbox" value="CSS" name="chStudentSkills"><br>
				JS : <input type="checkbox" value="JS" name="chStudentSkills"><br>
			</div>
			<div>
				<input type="submit" value="submit">
			</div>
			
		</form>
	</div>
</body>
</html>