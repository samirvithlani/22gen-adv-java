<%@page import="bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		StudentBean studentBean1 = (StudentBean) session.getAttribute("studentBean");
	if (studentBean1 != null) {
	%>
	
	<%@include file="navbar.jsp"%>
	<%
		List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
	%>

	<table class="table table-dark">
		<thead>
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>EMAIL</td>
				<td>AGE</td>
				<td>ACTION</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < students.size(); i++) {

				StudentBean studentBean = students.get(i);
			%>
			<tr>
				<td><%=studentBean.getsId()%></td>
				<td><%=studentBean.getsName()%></td>
				<td><%=studentBean.getsEmail()%></td>
				<td><%=studentBean.getsAge()%>
				<td><a class="btn btn-danger"
					href="StudentDeleteController?sid=<%=studentBean.getsId()%>">DELETE</a>
					&nbsp; <a class="btn btn-info"
					href="StudentDetailController?sid=<%=studentBean.getsId()%>">DETAIL</a>&nbsp;
					<a class="btn btn-primary"
					href="StudentEditController?sid=<%=studentBean.getsId()%>">Update</a>
				</td>
			</tr>

			<%
				}
			%>

		</tbody>

	</table>
	<%
		} else {
		response.sendRedirect("Login.jsp");
	}
	%>

</body>
</html>