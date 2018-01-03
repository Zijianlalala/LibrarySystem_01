<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书信息</title>
<link type="text/css" rel="stylesheet" media="all"
	href="styles/global.css" />
<link type="text/css" rel="stylesheet" media="all"
	href="styles/global_color.css" />
</head>
<body>
	<!--Logo区域开始-->
	<div id="header">
		<img src="../images/logo.png" alt="logo" class="left" /> <a href="#">[退出]</a>
	</div>
	<!--Logo区域结束-->
	<!--导航区域开始-->
	<div id="navi">
		<ul id="menu">
			<li><a href="../index.html" class="index_off"></a></li>
			<li><a href="findBook" class="admin_off"></a></li>
			<li><a href="../fee/fee_list.html" class="fee_off"></a></li>
			<li><a href="../user/user_info.html" class="information_off"></a></li>
			<li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
		</ul>
	</div>
	<!--导航区域结束-->
	<!--主要区域开始-->
	<div id="main">
		<form action="updateBook" method="post" class="main_form">
			<div class="text_info clearfix">
				<span>图书ID：</span>
			</div>
			<div class="input_info">
				<input name="book.id" type="text" class="readonly" readonly
					value="${id }" />
			</div>
			<div class="text_info clearfix">
				<span>图书名称：</span>
			</div>
			<div class="input_info">
				<input type="text" class="width300" name="book.name" /> 
				<span class="required">*</span>
			</div>
			<div class="text_info clearfix">
				<span>作者：</span>
			</div>
			<div class="input_info fee_type">
				<input type="text" class="width300" name="book.author" />
				<span class="required">*</span>
			</div>
			<div class="text_info clearfix">
				<span>价格：</span>
			</div>
			<div class="input_info">
				<input type="text" name="book.price" class="width100" />
				<span class="required">*</span>
			</div>
			<div class="text_info clearfix">
				<span>备注：</span>
			</div>
			<div class="input_info">
				<input type="text" name="book.others" class="width100" />
			</div>
			<div class="button_info clearfix">
				<input type="submit" value="保存" class="btn_save" /> <input
					type="button" value="取消" class="btn_save" />
			</div>
		</form>
	</div>
</body>
</html>