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
<c:if test="${age>18}">
<h1>OK....</h1>
</c:if>
<c:forEach items="${users }" var="user">
	<p>${user }</p>
</c:forEach>
</body>
</html>