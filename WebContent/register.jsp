<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
</head>
<body>
	<div align="center" class="index">
		<h1>注册</h1>
		<form action="registerUser" method="post">
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
					<td></td>
					<td align="right">
						<input type="submit" value="注册">
						<a href="login.jsp"><input type="button" value="取消"></a>
					</td>
				</tr>
			</table>
		</form>
		<h3 style="background-color: red">${RegisterMsg }</h3>
	</div>
</body>
</html>