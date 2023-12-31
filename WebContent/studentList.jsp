<%@page import="bean.StudentBean"%>
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
	<%
		List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
	%>

	<table>
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
				<td>
				<a href="StudentDeleteController?sid=<%=studentBean.getsId()%>">DELETE</a>
				</td>
			</tr>

			<%
				}
			%>

		</tbody>

	</table>

</body>
</html>