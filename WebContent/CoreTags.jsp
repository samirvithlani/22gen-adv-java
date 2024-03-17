<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("print");
	%>
	<c:out value="ok"></c:out>
	<c:set var="amount" value="1000"></c:set>
	<h1>
		AMOUNT =
		<c:out value="${amount }"></c:out>
	</h1>
	<c:set var="age" value="19"></c:set>
	<c:if test="${age>18 }">
		<p>you are eligible</p>
	</c:if>

	<c:set var="income" value="110000"></c:set>
	<c:choose>
	<c:when test="${income>=15000}">
		<p>your earning is good...</p>
	</c:when>
	
	<c:otherwise>
		<p>your income is not good</p>
	</c:otherwise>
	</c:choose>



</body>
</html>