<%@page import="bean.ProductBean"%>
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
		List<ProductBean> products = (List<ProductBean>) request.getAttribute("products");

	for (int i = 0; i < products.size(); i++) {
		ProductBean productBean = products.get(i);
	%>
	<div>
		<h1>
			NAME :<%=productBean.getpName()%></h1>
		<h2>
			PRICE :<%=productBean.getpPrice()%></h2>

		<%
			List<String> colors = productBean.getColors();
			for(int j=0;j<colors.size();j++){
			
		%>
		<!-- //colors/// -->
			<%=colors.get(j) %>

		<%
			}
		%>

		<%
			}
		%>
	</div>

</body>
</html>