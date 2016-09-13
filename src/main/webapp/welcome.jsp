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
	<title>Struts tutorial</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/curso.css" />" />
</head>
<body>
	<h1>
		STRUTS 1.3 TUTORIAL WITH JQUERY
	</h1>
	<div class="card welcome">
	<ol>
		<li><html:link action="downloadTutorial">Open the PDF tutorial</html:link></li>
		<li><html:link action="employeeDashboard">Employee Dashboard Java Validation</html:link></li>
		<li><html:link action="employeeXMLValidationForm">Employee Dashboard XML validation</html:link></li>
		<li><html:link action="iOExceptionAction">Action throwing IOException</html:link></li>
		<li><html:link action="permissionExceptionAction">Action throwing PermissionException</html:link></li>
		<li><html:link action="nullPointerExceptionAction">Action throwing NullPointerException</html:link></li>
		<li><html:link action="jquery">JQuery examples</html:link></li>
		<li><html:link action="multipleActionsAction?action=page1" >Multiple Actions page 1</html:link></li>
		<li><html:link action="multipleActionsAction?action=page2" >Multiple Actions page 2</html:link></li>
	</ol>
	</div>
</body>
</html>