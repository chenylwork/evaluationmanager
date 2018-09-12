<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../css/admin/student/student_add.css"></link>
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/admin/student/student_add.js"></script>
</head>
<body>
<div class="top" style="margin-top:15px;"> 
	<div class="nav"> 
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        <c:choose>
				<c:when test="${empty stuNo}">
					<span>添加学生信息</span>
				</c:when>
				<c:otherwise>
					<span>修改学生信息</span>
				</c:otherwise>
			</c:choose>
	      </span>
	      <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"> </span>
     	  </a>
	</div>
</div>
<div class="main">
<div class="left"><img src="../../images/z1.jpg"></div>
	<!--学号，名称，性别，年龄，所属专业，入学年份，学生状态-->
	<div class="right">
		<form action='../student/${empty studentMap.stuNo?"add" : "update"}' method="post">
			<input type="hidden" value="${!empty studentMap.stuNo? studentMap.id : ''}" name="id">
			<input type="hidden" value="${!empty studentMap.stuNo? studentMap.user.id : ''}" name="userID">
			<input type="hidden" value="${studentMap.user.password}" name="password" >
			<input type="hidden" value="1" name="paginMap.pageNo">
			<input type="hidden" value="5" name="paginMap.display">
		<ul class="u1">
		    <li>学号：&nbsp;<input type="text" name="stuNo" id="account" class="required" placeholder="请输入你的学号" value='${!empty stuNo?fn:trim(studentMap.stuNo):""}'></li>
			<li>姓名：&nbsp;<input type="text" name="name" id="name" class="required" placeholder="请输入你的姓名" value='${!empty stuNo?fn:trim(studentMap.user.name):""}'></li>
		    <li style="padding-left:23px;">性别：
				<select name="sex" class="required" id="sex" style="color:#999;width:258px;" data-no="${studentMap.user.codeNo}">
				    <option value="-1">请选择性别</option>
					<c:forEach var="s" items="${sexList}">
					   <c:choose>
					    <c:when test="${studentMap.user.sex.name !=null && studentMap.user.sex.name == s.name}">
				      		<option value="${s.name }" selected="selected">${s.name }</option>
				      	</c:when>
					    <c:otherwise>
                    	  <option value="${s.name }">${s.name}</option>
                    	</c:otherwise>
		       	  		</c:choose>
		       	  	</c:forEach>
				</select>
			</li> 
			<li style="margin-left:-28px;">身份证号：&nbsp;<input type="text" name="pid" id="ID" class="required" placeholder="请输入你的身份证号" value='${!empty stuNo?fn:trim(studentMap.user.pid):""}'></li>
			<li>年龄：&nbsp;<input type="text" name="age" id="age" class="required" placeholder="请输入你的年龄" value='${!empty stuNo?fn:trim(studentMap.user.age):""}'></li>
			<li style="padding-left:23px;">专业：
				<select name="major" class="required" id="major" style="color:#999;width:258px;" data-no="${studentMap.major.majorNo}">
					<option value="-1">请选择专业</option>
					<c:forEach var="m" items="${majorList}">
		       	  		<c:choose>
						    <c:when test="${studentMap.major.majorNo !=null && studentMap.major.majorNo == m.majorNo}">
					      		<option value="${m.majorNo }" selected="selected">${m.name }</option>
					      	</c:when>
						    <c:otherwise>
	                    	 	<option value="${m.majorNo }">${m.name}</option>
	                    	</c:otherwise>
		       	  		</c:choose>
		       	  	</c:forEach>
				</select>
			</li>
			<li style="padding-left:23px;">班级：
				<select name="classNo" class="required" id="classes" style="color:#999;width:258px;" data-no="${studentMap.classNo}">
					<option value="-1">请选择班级</option>
				</select>
			</li>
			<li style="margin-left:-33px;">入学时间：&nbsp;&nbsp;<input type="date" name="joinTime" id="time" class="required" placeholder="请输入入学年份" value='${!empty stuNo?fn:trim(studentMap.joinTime):""}'></li>
            <li style="padding-left:23px;">状态：
				<select name="state" class="required" id="state" style="color:#999;width:258px;" data-no="${studentMap.state.codeNo}">
					<option value="-1">请选择状态</option>
		       	  	<c:forEach var="s" items="${stateList}">
					   <c:choose>
					    <c:when test="${studentMap.state.codeNo !=null && studentMap.state.codeNo == s.codeNo}">
				      		<option value="${s.codeNo }" selected="selected">${s.name }</option>
				      	</c:when>
					    <c:otherwise>
                    	  <option value="${s.codeNo }">${s.name}</option>
                    	</c:otherwise>
		       	  		</c:choose>
		       	  	</c:forEach>
				</select>
			</li>
			<li style="text-align:left;padding-left:100px;"><input type="button" name="" id="zxc" class="btn1" value="提交">
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" class="btn1"> </li>
		</ul>
		</form>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		if($("#major").val() != null) {
			$("#major").change();
		}
	});
	$("#major").change(function() {
		$.ajax({
			url : "http://localhost:8080/evaluationmanager/admin/class/classByMajor",
			data :{"major":$(this).val()},
			type: "get",
			success : function(data) {
				var jsonArray ={}; 
				if(data != "") {
					jsonArray = eval('('+data+')').classes;
					$(".classes").remove();
				}
				var initHtml = "";
				for(var i in jsonArray) {
					var classes = jsonArray[i];
					if(classes.classNo == "${studentMap.classNo.classNo}") {
						initHtml += "<option value="+classes.classNo+" class='classes' selected='selected'>"+classes.name+"</option>";
					} else {
						initHtml += "<option value="+classes.classNo+" class='classes'>"+classes.name+"</option>";
					}
				}
				$("#classes").append(initHtml);
			},
		});
	});
</script>
</body>
</html>