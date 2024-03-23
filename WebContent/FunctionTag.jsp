<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="sname" value="jay">
</c:set>
<c:set var="sname1" value="${fn:toUpperCase(sname) }"></c:set>
<c:out value="${sname1 }"></c:out>
<h1>in upper: <c:out value="${fn:toUpperCase(sname) }"></c:out></h1>
<c:set var="name" value="Hi this is India"></c:set>
<c:if test="${fn:contains(name,'india') }">
<p>India found</p>
</c:if>
<c:if test="${fn:containsIgnoreCase(name,'india') }">
<p>India found</p>
</c:if>
<c:if test="${fn:endsWith(name,'a') }">
<p>True</p>
</c:if>

<c:set var="email" value="  samir@gmail.com  "></c:set>
<h1>${fn:length(email) }</h1>
<c:set var ="email1" value = "${fn:trim(email) }"></c:set>
<h1>${fn:length(email1) }</h1>
<c:set var ="address" value="201 surbhi complex opp municiapl market cg road ahmedabad"></c:set>
<c:set var ="add" value="${fn:split(address,' ') }"></c:set>
<c:set var ="x" value="${fn:join(add,', ') }"></c:set>
<c:out value="${x }"></c:out>

<c:forEach var="a" items="${add }">
<h1>${a }</h1>
</c:forEach>










</body>
</html>