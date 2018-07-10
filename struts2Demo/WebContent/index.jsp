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
<a href="update.action">update</a>
<a href="delete.action">delete</a>
<a href="suibian">suibian</a>
<a href="actionContext">actionContext</a>
<hr>
<h1>使用ServletActionContext类</h1>
<form action="FormAction" method="post">
姓名：<input name="username" type="text" >
年龄：<input name="age" type="text">
<input type="submit" value="确定">
</form>
<hr>

<h1>使用ActionContext类</h1>
<form action="actionContext.action" method="post">
姓名：<input name="username" type="text" >
年龄：<input name="age" type="text">
<input type="submit" value="确定">
</form>

<h1>使用接口注入</h1>
<form action="jiekouzhuru.action" method="post">
姓名：<input name="username" type="text" >
年龄：<input name="age" type="text">
<input type="submit" value="确定">
</form>

<hr>
<h1>使用拦截器</h1>
<a href="lanjieqi.action">拦截器</a>
<hr>
<h1>ModelDriven</h1>
<form action="register.action" method="post">
用户名：<input name="username" type="text" ><br>
密码：<input name="password" type="password"><br>
邮箱地址：<input name="email" type="text" ><br>
性别：<s:radio name="gender" list="{'男','女'}" /><br>
爱好：<s:checkboxlist name="hobby" list="{'游泳','打篮球','踢足球'}" /><br>
<s:select lable="Country" name="country" list="{'China','America','Russia'}" value="China" />
<input type="submit" value="确定">
</form>
</body>
</html>