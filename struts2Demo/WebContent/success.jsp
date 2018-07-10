<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
成功跳转
<hr>
request:${requestScope.username}<br>
session:${sessionScope.username }<br>
application:${applicationScope.username }<br>
<hr>
<s:property value="#actionContextMap"/>
<s:property value="#session.sessionMap"/>
<s:property value="#request.requestMap"/>
<s:property value="#application.applicationMap"/>
<hr>
<s:property value="[0].top.name" />


</body>
</html>