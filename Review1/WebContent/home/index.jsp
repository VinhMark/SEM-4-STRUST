<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List books</h2>
	<s:a namespace="/home" action="create">Add book</s:a>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Title</td>
			<td>Price</td>
			<td>Option</td>
		</tr>
		<c:forEach var="b" items="${books }">
			<tr>
				<td>${b.bookId }</td>
				<td>${b.bookTitle }</td>
				<td>${b.bookPrice }</td>
				<td><s:url id="update" namespace="/home" action="update">
						<s:param name="id">${b.bookId }</s:param>
					</s:url> <s:a href="%{update}">Update</s:a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>