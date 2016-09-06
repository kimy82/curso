<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employees Validation</title>
</head>
<body>


	<h1>Employee Registeration with XML validation</h1>
	<br />
	<br />

	<font color="red"> <html:errors />
	</font>

	<html:form action="/saveWithXMLValidation.do">

		<br />
		<bean:message key="label.user.username" /> : 
		<html:text property="name" size="20" />
		<br />
		Surname : 
		<html:text property="surname" size="20" />
		<br />
		Address : 
		<html:text property="address" size="20" />
		<br />
		<html:submit>
		Save employee
		</html:submit>

	</html:form>

</body>
</html>