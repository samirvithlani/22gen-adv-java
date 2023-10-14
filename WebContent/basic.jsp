<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HELLO</h1>
	<h1>SCRIPTLET TAG DEMO</h1>
	<%
		int age = 19;
		out.print("age =" + age);
	%>
	<h1>
		<%
			out.print("age = "+age);
		%>
	</h1>
	<h2>EXPRESSION TAG</h2>
	<%=age %>
</body>
</html>