<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Photo</td>
			<td>Price</td>
			<td>Option</td>
		</tr>
		<c:forEach var="p" items="${products }">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td><img src="${pageContext.request.contextPath }/img/${p.photo}"></td>
				<td>${p.price }$</td>
				<td>
					<s:url id="myurl" namespace="/product" action="detail">
						<s:param name="id">${p.id }</s:param>
					</s:url>
					<s:a href="%{myurl}">Detail</s:a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>