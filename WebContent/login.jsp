<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
</head>
<body class="index">
	<div class="login_box" align="center">
		<form id="login" action="checkUser" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="user.username"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="user.password"></td>
				</tr>
				<tr>
					<td>用户类型：</td>
					<td>
						<input type="radio" name="user.priority" value="0" checked="true">普通用户
						<input type="radio" name="user.priority" value="1" >管理员
					</td>
				</tr>
				<tr>
					<td></td>
					<td >
						<input type="submit" value="登录">
						<input type="reset" value="取消">
					</td>
				</tr>
				<tr></tr>
			</table>
		</form>
		<br>
		<br>
		<h3>${LoginMsg }</h3>
		<h4>没有账号？请先<a href="register.jsp">注册</a></h4>
	</div>
</body>
</html>