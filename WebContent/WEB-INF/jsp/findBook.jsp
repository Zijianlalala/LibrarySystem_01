<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理</title>
<link type="text/css" rel="stylesheet" media="all"
	href="styles/global.css" />
<link type="text/css" rel="stylesheet" media="all"
	href="styles/global_color.css" />
</head>
<script type="text/javascript" language="javascript">
//删除图书
function deleteBook(id) {
	var r = window.confirm("确定要删除此图书吗？");
	if(r){
		window.location.href="deleteBook?id="+id;
	}
}
</script>
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
			<li><form action="findCost.do" id="form1" name="form1"><a href="javascript:document.getElementById('form1').submit();" class="fee_off" ></a></form></li>
			<li><a href="../user/user_info.html" class="information_off"></a></li>
			<li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
		</ul>
	</div>
	<!--导航区域结束-->
	<!--主要区域开始-->
	<div id="main">
		<form action="" >
			<div class="search_add">
				<input type="button" value="增加" class="btn_add"
					onclick="location.href='toAddBook';" />
			</div>
			
			<!--数据区域：用表格展示数据-->
			<div id="data">
				<table id="datalist">
					<tr>
						<th>书号</th>
						<th>书名</th>
						<th>作者</th>
						<th>价格</th>
						<th>备注</th>
					</tr>

					<c:forEach items="${books }" var="c" >
						<tr>
							<td>${c.id }</td>
							<td>${c.name }</td>
							<td>${c.author }</td>
							<td>${c.price }</td>
							<td>${c.others }</td>
							<td><a href="toUpdateBook?id=${c.id}">
								<input type="button" value="修改" class="btn_modify"/>
								</a>
								<input type="button" value="删除" class="btn_delete"
								onclick="deleteBook(${c.id});" /></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
		<h3>${deleteMsg }</h3>
	</div>
	<!--主要区域结束-->
</body>
</html>