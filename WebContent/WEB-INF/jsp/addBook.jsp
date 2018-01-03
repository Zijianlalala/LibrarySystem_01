<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
<link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" />
<script type="text/javascript" language="javascript">
	function checkData(){
		document.getElementById("addForm").submit();
		}
</script>
</head>
<body>
	<!--Logo区域开始-->
	<div id="header">
		<img src="images/logo.png" alt="logo" class="left" /> [${user }]<a href="#">[退出]</a>
	</div>
	<!--Logo区域结束-->
	<!--导航区域开始-->
        <div id="navi">
            <ul id="menu">
                <li><a href="../admin/admin_list.html" class="admin_off"></a></li>
                <li><a href="../fee/fee_list.html" class="fee_off"></a></li>
                <li><a href="../user/user_info.html" class="information_off"></a></li>
                <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
            </ul>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
	<div id="main">
		<form id="addForm" action="addBook" method="post" class="main_form">
			<div class="text_info clearfix">
				<span>书名：</span>
			</div>
			<div class="input_info">
				<input type="text" class="width300" name="book.name" /> <span
					class="required">*</span>
				<div class="validate_msg_short">50长度的字母、数字、汉字和下划线的组合</div>
			</div>
			<div class="text_info clearfix">
				<span>作者：</span>
			</div>
			<div class="input_info fee_type">
				<input type="text" id="baseDuration" name="book.author"
					class="width100" /> <span class="required">*</span>
				<div class="validate_msg_long">1-600之间的整数</div>
			</div>
			<div class="text_info clearfix">
				<span>价格：</span>
			</div>
			<div class="input_info">
				<input type="text" id="baseDuration" name="book.price"
					class="width100" /> <span class="required">*</span>
				<div class="validate_msg_long">1-600之间的整数</div>
			</div>
			<div class="text_info clearfix">
				<span>备注：</span>
			</div>
			<div class="input_info">
				<input id="unitCost" type="text" name="book.others" class="width100" />
				<span class="required">*</span>
				<div class="validate_msg_long">书的类型</div>
			</div>
			<div class="button_info clearfix">
				<input type="button" value="保存" class="btn_save"
					onclick="checkData();" /> 
				<input type="button" value="取消"
					class="btn_save" onclick="history.back();" />
			</div>
		</form>
		<h3>${addMsg }</h3>
	</div>
	<!--主要区域结束-->
</body>
</html>