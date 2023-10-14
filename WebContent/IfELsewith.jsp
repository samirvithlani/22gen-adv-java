<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		int age = 19;
		if(age>18){
			
			out.print("eligbile...");
		}
		else{
			out.print("not eligible..");
		}
		
	%> --%>
	
	<%
		int age =15;
		if(age>=18){
	%>
		<h1>ELIGIBLE</h1>
			
	<%}else{ %>
		
		<h1>ELSE</h1>
		
	<%} %>
	
</body>
</html>