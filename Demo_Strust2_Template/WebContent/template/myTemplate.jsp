<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="titles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:a namespace="/home" action="index">Home</s:a>|
	<s:a namespace="/about" action="index">About Us</s:a>|
	<s:a namespace="/new" action="index">New</s:a>
	<br><br>
	<titles:insertAttribute name="content"></titles:insertAttribute>
	<br><br>
	Copyright 2017
</body>
</html>