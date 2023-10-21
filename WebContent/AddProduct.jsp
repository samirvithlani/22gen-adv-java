<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProductController">
		<div>
			<input type="text" name="pname" placeholder="enter product name">
		</div>
		<div>
			<input type="text" name="pprice" placeholder="enter product price">
		</div>
		<div>
			<label>COLORS</label> <br> RED:<input type="checkbox"
				value="red" name="colors"> <br> BLUE:<input
				type="checkbox" value="blue" name="colors"> <br> GREEN:<input
				type="checkbox" value="green" name="colors"> <br>
		</div>
		<div>
			<input type="submit" value="ADD">
		</div>
	</form>
</body>
</html>