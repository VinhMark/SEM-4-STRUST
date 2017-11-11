<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" namespace="/category" action="save">
		
		<s:textfield label="Name" required="required" name="category.name"></s:textfield>
		<s:submit value="Save" align="left"></s:submit>
	
	</s:form>
</body>
</html>