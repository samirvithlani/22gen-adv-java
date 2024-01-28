<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		${loginError}
	<form method="post" action="StudentLoginController">
		<div>
			<label>Email</label> <input type="text" name="txtStudentEmail">
		</div>
		<div>
			<label>Password</label> <input type="text" name="txtStudentPassword">
		</div>
		<div>
		<input type="submit" value="LOGIN">
		</div>
	</form>
</body>
</html>