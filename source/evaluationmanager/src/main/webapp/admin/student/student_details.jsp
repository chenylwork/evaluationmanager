<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生详情</title>
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../../css/admin/student/student_details.css"></link>
</head>
<body>
<h3 style="background: #e9f2ff;padding-left:10px;">Look at the student's personal information</h3>
<span style="font-size:18px;padding-left:10px;">查看学生个人信息</span>
<div class="top">
<!--学号，名称，性别，年龄，角色，所属专业，入学年份，结业日期，学生状态-->
	<div class="left"> 
	<img src="../../images/b4.jpg">
	</div>
	<div class="right">
	<table>
	<tr><td>学号:</td><td>${studentMap.stuNo }</td></tr>
	<tr><td>名称:</td><td>${studentMap.user.name }</td></tr>
	<tr><td>性别:</td><td>${studentMap.user.sex.name }</td></tr>
	<tr><td>年龄:</td><td>${studentMap.user.age }</td></tr>
	<tr><td>身份证号:</td><td>${studentMap.user.pid }</td></tr>
	<tr><td>所属专业:</td><td>${studentMap.major.name }</td></tr>
	<tr><td>所属班级:</td><td>${studentMap.classNo.name }</td></tr>
	<tr><td>入学年份:</td><td>${studentMap.joinTime }</td></tr>
	<tr><td>学生状态:</td><td>${studentMap.state.name }</td></tr>
	</table>
	</div>
</div>
</body>
</html>