<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	<s:form namespace="/account" action="save" method="post">
		<s:textfield label="Username" name="account.username"></s:textfield>
		<s:textfield label="Password" name="account.password"></s:textfield>
		<s:textfield label="Age" name="account.age"></s:textfield>
		<s:textfield label="Email" name="account.email"></s:textfield>
		<s:textfield label="Website" name="account.website"></s:textfield>
		<s:submit value="Login" align="left"></s:submit>
	</s:form>
</body>
</html>