<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>List category</h2>
	<s:a namespace="/category" action="create">Add Category</s:a>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Action</td>
		</tr>
		<c:forEach var="item" items="${categories }">
			<tr>
				<td>${item.id }</td>
				<td>${item.name }</td>
				<td>
					
					<s:url id="update" namespace="/category" action="update">
						<s:param name="id">${item.id }</s:param>
					</s:url>
					<s:a href="%{update}">Update</s:a>
					
					<s:url id="deleteUrl" namespace="/category" action="delete">
						<s:param name="id">${item.id }</s:param>
					</s:url>
					<s:a href="%{deleteUrl}">Delete</s:a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>