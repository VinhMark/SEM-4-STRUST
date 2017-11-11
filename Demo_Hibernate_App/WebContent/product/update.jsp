<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Product info</h2>
	<s:form namespace="/product" action="updatePOST" method="POST">
		<s:hidden name="product.id"></s:hidden>
		<s:textfield label="Name" name="product.name" />
		<s:textfield label="Price" name="product.price" />
		<s:submit value="Update"></s:submit>
	</s:form>
</body>
</html>