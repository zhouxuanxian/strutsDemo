<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>注册页面</h1>
<s:fielderror />
<form method="post" action="registerValidateAction">
用户名：<input name="name" type="text">
密码：<input name="password" type="password">
手机号码：<input name="phone" type="text">
邮箱：<input name="email" type="text">
<input type="submit" value="确定">
</form>
</body>
</html>