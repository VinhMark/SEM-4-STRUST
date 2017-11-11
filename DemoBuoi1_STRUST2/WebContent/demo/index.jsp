<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.mylink{
		color : red;
	}
</style>
</head>
<body>
	<s:a namespace="/demo" action="demo2" cssClass="mylink">Click me</s:a>
	<s:a namespace="/product" action="index">Product info</s:a>
	<s:a namespace="/product" action="list">Product List</s:a>
	<br>
	<s:url id="myurl" namespace="/querystring" action="index">
		<s:param name="id">123</s:param>
		<s:param name="username">abc</s:param>
	</s:url>
	<s:a href="%{myurl}">Demo qurey strinh</s:a>
</body>
</html>