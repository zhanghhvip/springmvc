<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" isELIgnored = "false" %>
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>success page</h1>
time:${requestScope.time }<br>
names:${requestScope.names }<br>
request user:${requestScope.user }<br>
session user:${sessionScope.user }<br>
request school:${requestScope.school }<br>
session school:${sessionScope.school }<br>\
<fmt:message key="i18n.username"></fmt:message><br>
<fmt:message key="i18n.password"></fmt:message><br>
</body>
</html>