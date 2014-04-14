<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">

	<title>My JSF 'bas.jsp' starting page</title>
	
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
	<f:loadBundle basename="org.csytem.resources.message" var="msg"/>
		<h:form>
		<h:outputText value="#{msg.name }"/>:<h:inputText id="ad"  value="#{userBean.ad }" required="true"/><h:message  for="ad"/><br>
		<h:outputText value="#{msg.surname }"/>:<h:inputText id="soyad"  value="#{userBean.soyad }" required="true"/><h:message for="soyad"/><br>
		<h:commandButton value="#{msg.buttonMessage }"/>
		</h:form>
	</f:view>
</body>
</html>