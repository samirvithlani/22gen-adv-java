<%@page import="bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		StudentBean studentBean = (StudentBean) request.getAttribute("student");
	%>

	<form action="StudentUpdateController">
		<input type="hidden" value="<%=studentBean.getsId()%>"
			name="txtStudentId">
		<div>
			<label>ENTER NAME</label> <input type="text" name="txtStudentName"
				value="<%=studentBean.getsName()%>">
		</div>
		<div>
			<label>ENTER EMAIL</label> <input type="text" name="txtStudentEmail"
				value="<%=studentBean.getsEmail()%>">
		</div>
		<div>
			<label>Student age</label> <input type="text" name="txtStudentAge"
				value="<%=studentBean.getsAge()%>">
		</div>
		<div>
			<input type="submit" value="submit">
		</div>
	</form>

</body>
</html>