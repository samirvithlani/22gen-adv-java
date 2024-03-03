<%@page import="util.GetRoleUtils"%>
<%@page import="bean.RoleBean"%>
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
	<form action="AddEmployeeController" method="POST">
		<%
			List<RoleBean> roles = GetRoleUtils.getAllRoles();
		%>
		<select name ="txtRole">
			<%
				for (int i = 0; i < roles.size(); i++) {
			%>
			<option value="<%=roles.get(i).getrId()%>"><%=roles.get(i).getrName()%></option>
			<%
				}
			%>
		</select>
		<div>
		<input type="submit" value="ADD EMP">
		</div>
	</form>
</body>
</html>