<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<title>JSP for DilSecForm form</title>
</head>
<body>
	<html:form action="/kayit">
		<bean:message key="name.label" />  : <html:text property="name" />
		<html:errors property="name" />
		<br />
		<bean:message key="surname.label" />  : <html:text property="surname" />
		<html:errors property="surname" />
		<br />
		<html:submit>
			<bean:message key="submit.label" />
		</html:submit>
		<html:cancel />
	</html:form>
</body>
</html>

