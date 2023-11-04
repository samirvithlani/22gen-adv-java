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
	<h1>PRINT STUDENT DEtAIL</h1>
	<%
		StudentBean studentBean = (StudentBean) request.getAttribute("studentBean");
	%>
	<h1>
		NAME =
		<%=studentBean.getsName()%>
	</h1>
	<h1>
		Email =
		<%=studentBean.getsEmail()%>
	</h1>
	<h1>
		Age =
		<%=studentBean.getsAge()%>
	</h1>
	<%
		String skills[] = studentBean.getsSkills();
	for (int i = 0; i < skills.length; i++) {
	%>

	<h1><%=skills[i]%></h1>

	<%
		}
	%>
</body>
</html>