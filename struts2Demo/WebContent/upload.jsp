<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>文件上传</h2>
	<form class="form-rel" align="center" method="post"
		action="upload" enctype="multipart/form-data">
		用户名: <input type="text" placeholder="用户名：" name="name"><br>
		密码: <input type="text" placeholder="密码：" name="password"><br>
		图书封面: <input type="file" placeholder="请选择图片：" name="picture"><br>
		<button type="submit">发布</button>

	</form>
<h2>文件上下载</h2>
<a href="downLoad">下载</a>


</body>
</html>