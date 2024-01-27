<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddBookController">
		<div>
			<label>Name:</label> <input type="text" name="txtBookName">
			<%
				String bookNameError = (String) request.getAttribute("bookNameError");
			if (bookNameError != null) {
				out.print(bookNameError);
			}
			%>
		</div>
		<div>
			<label>Price</label> <input type="text" name="txtBookPrice">
			<%-- <%
				String bookPriceError = (String) request.getAttribute("bookPriceError");
			if (bookPriceError != null) {
				out.print(bookPriceError);
			}
			%> --%>
			${bookPriceError}
		</div>
		<div>
			<input type="submit" value="submit">
		</div>
	</form>
</body>
</html>