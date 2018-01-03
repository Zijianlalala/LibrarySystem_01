<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统</title>
<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
<link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" />
</head>
<body class="index">
	<div align="center" id="wrapper">
		<!--导航区域开始-->
		<div id="index_navi">
			<ul id="menu">
				<li><a href="../admin/admin_list.html" class="admin_off"></a></li>
				<li><form action="findBook" id="form1" name="form1">
						<a href="javascript:document.getElementById('form1').submit();"
							class="fee_off"></a>
					</form></li>	
				<li><a href="../user/user_info.html" class="information_off"></a></li>
				<li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
			</ul>
		</div>
		<!--导航区域结束-->
	</div>
</body>
</html>