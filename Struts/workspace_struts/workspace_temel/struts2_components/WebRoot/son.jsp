<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>


</head>

<body>

	<s:form action="renkGoster">
		<s:select name="renk" list="renkler"></s:select>
		<s:submit label="renk goster" />
	</s:form>
</body>
</html>
