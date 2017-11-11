<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>List Product</h2>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Price</td>
			<td>&npsb;</td>
		</tr>
		<c:forEach var="p" items="${products }">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.price } $</td>
				<td>
					<s:url id="update" namespace="/product" action="updateGET">
						<s:param name="id">${p.id }</s:param>
					</s:url>
					<s:a href="%{update}" >Update</s:a>|
					<s:url id="delete" namespace="/product" action="delete">
						<s:param name="id">${p.id }</s:param>
					</s:url>
					<s:a href="%{delete}">Delete</s:a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>