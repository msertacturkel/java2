<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

</head>

<body>
	<jsp:useBean id="mybean" class="beans.PersonelBean" />
	<jsp:setProperty property="ad" name="mybean" value="Utku" />
	<!-- <jsp:getProperty property="ad" name="mybean" />-->
	<jsp:getProperty property="table" name="mybean"/>
	
</body>
</html>
