<%@page import="bean.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>DATA JSP FILE</h1>
	<%
		String name = (String) request.getAttribute("name");
	%>
	<%=name%>
	<%
		List users = (ArrayList<String>) request.getAttribute("userList");
	for (int i = 0; i < users.size(); i++) {
	%>
	<ul>
		<li><%=users.get(i)%></li>
	</ul>

	<%
		}
	%>

	<%
		List<EmployeeBean> employees = (List<EmployeeBean>) request.getAttribute("empList");
	for (int i = 0; i < employees.size(); i++) {
		//emp1
		//emp2
		EmployeeBean employeeBean = employees.get(i);
	%>
	<ul>
		<li><%=employeeBean.geteId() %>   <%=employeeBean.geteName() %>  <%=employeeBean.geteAge() %></li>
	</ul>

	<%
		}
	%>



</body>
</html>