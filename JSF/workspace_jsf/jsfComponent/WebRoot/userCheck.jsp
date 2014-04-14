<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSF 'userCheck.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<f:view>
		<h:form>
		user: <h:inputText id="user" value="#{userBean.user }"  style="color:yellow;background:green"/>
			<br>
		password:<h:inputSecret value="#{userBean.password }"/>
			<br>
			<h:outputLink value="http://www.csystem.org">siteye git</h:outputLink>
			<h:commandButton value="git" action="#{userBean.userControl }" />
		</h:form>
	</f:view>
</body>
</html>