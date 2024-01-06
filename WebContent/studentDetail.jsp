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
	if (studentBean != null) {
		String message = (String) request.getAttribute("message");
	%>
	<h1><%=message%></h1>
	<h1><%=studentBean.getsName()%></h1>
	<h2><%=studentBean.getsEmail()%></h2>
	<h3><%=studentBean.getsAge()%></h3>

	<%
		} else {
		String message = (String) request.getAttribute("message");
	%>
	<h1><%=message%></h1>
	<%
		}
	%>
</body>
</html>