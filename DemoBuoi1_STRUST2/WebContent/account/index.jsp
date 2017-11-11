<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<s:form method="post" namespace="/account" action="save">
		<s:textfield label="Username" name="account.username"></s:textfield>
		<s:password label="Password" name="account.password"></s:password>
		<s:textarea label="Description" name="account.description" rows="5"
			cols="20"></s:textarea>
		<s:checkbox label="Status" name="account.status"></s:checkbox>
		
		<s:checkboxlist label="Languages" list="languages" listKey="id"
			listValue="name" name="account.language"></s:checkboxlist>
			

			
		<s:radio list="#{'m':'Male' ,'f' :'Female'}" name="account.gender"></s:radio>
		<s:select label="Role" list="roles" listKey="id" listValue="name"
			name="account.role"></s:select>
		<s:submit value="Save" align="left"></s:submit>

	</s:form>

</body>
</html>