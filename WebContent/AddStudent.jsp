<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div>
		<form action="AddStudentController2">

			<div>
				<label>Student name</label> <input type="text" name="txtStudentName">
				<%-- <%=request.getAttribute("nameError") %> --%>
				<%
					String nameError = (String) request.getAttribute("nameError");
				if (nameError != null) {
					out.print(nameError);
				}
				%>

			</div>
			<div>
				<label>Student Email</label> <input type="text"
					name="txtStudentEmail">
					<%
					String emailError = (String) request.getAttribute("emailError");
				if (emailError != null) {
					out.print(emailError);
				}
				%>
			</div>
			<div>
				<label>Student Age</label> <input type="text" name="txtStudentAge">
					<%
					String ageError = (String) request.getAttribute("ageError");
				if (ageError != null) {
					out.print(ageError);
				}
				%>
			</div>
			<div>
				<label>Skills</label> <br> HTML : <input type="checkbox"
					value="HTML" name="chStudentSkills"><br> CSS : <input
					type="checkbox" value="CSS" name="chStudentSkills"><br>
				JS : <input type="checkbox" value="JS" name="chStudentSkills"><br>
			</div>
			<div>
				<input type="submit" value="submit">
			</div>

		</form>
	</div>
</body>
</html>