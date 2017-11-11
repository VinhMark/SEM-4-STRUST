<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/demo.js"></script>
</head>
<body>
Product info
<table border="1">
	<tr>
		<td>id</td>
		<td>${product.id }</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>${product.name }</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${product.price }</td>
	</tr>
	<tr>
		<td>Photo</td>
		<td><img alt="" onclick="clickMe()" src="${pageContext.request.contextPath }/img/${product.photo}">
		</td><!-- để đi vào từ đường dẫn gốc -->
	</tr>
	
</table>
<s:a namespace="/product" action="list">back to list</s:a>
</body>
</html>