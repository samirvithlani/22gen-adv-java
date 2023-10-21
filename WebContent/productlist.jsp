<%@page import="java.util.List"%>
<%@page import="bean.ProductBean"%>
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
		ProductBean productBean = (ProductBean) request.getAttribute("product");
	%>
	<%=productBean.getpName()%>
	<%=productBean.getpPrice()%>
	<%
		List<String> colors = productBean.getColors();
		for(int i=0;i<colors.size();i++){
	%>
	<%=colors.get(i) %>
	<%} %> --%>

	<%
		List<ProductBean> products = (List<ProductBean>) request.getAttribute("products");
	for (int i = 0; i < products.size(); i++) {
		ProductBean productBean = products.get(i);
	%>
	<h1>
		<%=productBean.getpName()%>
	</h1>
	<h1>
		<%=productBean.getpPrice()%>
	</h1>
	<ul>
		<%
			List<String> colors = productBean.getColors();
		for (int j = 0; j < colors.size(); j++) {
		%>
		<li><%=colors.get(j)%></li>

		<%
			}
		%>
	</ul>

	<%
		}
	%>
</body>
</html>