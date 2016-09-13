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
	<title>Employees</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/curso.css" />" />
</head>
<body>
	<h1>
		<bean:write name="welcomeForm" property="message" />
	</h1>
	<div class="employees-list" >
		<logic:iterate name="atosEmployees" id="atosEmployee">
			<div class="employee-box" >
				<p>
					<label>Employee Name: </label>
					<bean:write name="atosEmployee" property="name" />
				</p>
				<p>
					<label>Employee SurName: </label>
					<bean:write name="atosEmployee" property="surname" />
				</p>
				<p>
					<label>Employee Address: </label>
					<bean:write name="atosEmployee" property="address" />
				</p>
			</div>
		</logic:iterate>
	</div>
	<div>
		<html:form action="/saveEmployee.do">

			<div class="error" >
				<html:errors />
			</div>
			<html:text property="name" size="20" maxlength="20" />
			<html:text property="surname" size="20" maxlength="20" />
			<html:text property="address" size="20" maxlength="20" />

			<div style="padding: 16px">
				<div style="float: left; padding-right: 8px;">
					<html:submit>
						Save Employee
					</html:submit>
				</div>
				<html:reset>
					Reset form
				</html:reset>
			</div>
		</html:form>

	</div>
</body>
</html>