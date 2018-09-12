<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>评教列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
*{
	margin: 0 auto;
	padding: 0;
}
table td{
	width: 230px;
	height: 25px;
	color: #666;
	border: 1px solid #CBE1FD;
	text-align: center;
}
form{
	color: #666;
	padding-top:10px;
	height: 60px;
}
.inp{
	border: 1px solid #ccc;
	width: 150px;
	border-radius:3px;
}
.btn1{
	width:80px;
	height:25px;
	background-color:#e9f2ff;
	color:#666;
	border:1px solid #fff;
	border-radius:5px;
	font-size:12px;
}
</style>
</head>
<body>
<h4 style="background: #e9f2ff;padding-left:10px;">
	可以评估的教师
</h4>
<table>
	<tr>
		<td><b>测评教师</b></td>
		<td><b>测评试卷</b></td>
		<td><b>试卷类型</b></td>
		<td><b>开始时间</b></td>
		<td><b>结束时间</b></td>
		<td><b>操作</b></td>
	</tr>
	<c:forEach var="paperTeacher" items="${paperTeacherList}">
	<tr class="power_box" id="evaluation${paperTeacher.paperNo}${paperTeacher.teacherNo}${paperTeacher.paperType}" data-paperType="${paperTeacher.paperType}">
			<td>${paperTeacher.teacherName}</td>
			<td>${paperTeacher.description}</td>
			<td>${paperTeacher.paperTypeName}</td>
			<td>${paperTeacher.startTime}</td>
			<td class="endtime_td">${paperTeacher.endTime}</td>
			<td><a href="<%=request.getContextPath() %>/admin/paper/evaluation?paperNo=${paperTeacher.paperNo}&data=${paperTeacher.teacherNo}" target="frame">评估</a></td>
	</tr>
	</c:forEach>
</table>
</body>
<script>
	$(function() {
		<c:forEach var="evaluation" items="${evaluationList}">
		$("#evaluation${evaluation.paper}${evaluation.teacher}P2").remove();
		</c:forEach>
		$(".endtime_td").each(function(){
			var date = new Date();
			var year = date.getFullYear();
			var month = date.getMonth() + 1;
			var day = date.getDate();
			if (month < 10) {
			    month = "0" + month;
			}
			if (day < 10) {
			    day = "0" + day;
			}
			var nowDate = year + "-" + month + "-" + day;
			if(Date.parse(new Date()) > Date.parse($(this).text())) {
				$(this).parents(".power_box").remove();
			} 
		});
	})
</script>
</html>

