<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProductController1">
		<div>
			<label>NAME:</label> <input type="text" name="txtProductName">
		</div>
		<div>
			<label>PRICE</label> <input type="text" name="txtProductPrice">
		</div>
		<div>
			<label>COLORS</label> <br> RED :<input type="checkbox"
				value="red" name="colors"><br> BLUE :<input
				type="checkbox" value="blue" name="colors"><br> WHITE :<input
				type="checkbox" value="white" name="colors"><br>
		</div>
		<div>
			<input type="submit" value="SUBMIT">
		</div>


	</form>
</body>
</html>