<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>urunleriListele.jsp</title>

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
   
   <font size="5"><strong>&Uuml;r&uuml;n Listesi</strong></font><br><br>
  <table border="1">
  <tr><td>Urun Kod</td><td>Urun Ad</td><td>Miktar</td></tr>
	
  <logic:iterate id="urun" name="urunler">
  <tr><td><bean:write name="urun" property="urunKod"/></td>
    <td><bean:write name="urun" property="urunAd"/></td>
    <td><bean:write name="urun" property="fiyat"/></td>
   
    </tr>
 </logic:iterate>
  
  </table>
   
  </body>
</html:html>
