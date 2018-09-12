<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:choose>
  <c:when test="${empty teacherNo}">
    <title>添加教师信息</title>
  </c:when>
  <c:otherwise>
    <title>修改教师信息</title>
  </c:otherwise>
</c:choose>
<style type="text/css">
</style>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../../css/admin/teacher/teacher_add.css">
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/admin/teacher/teacher_add.js"></script>
</head>
<body>
<div class="top" style="margin-top:10px;">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        <c:choose>
			  <c:when test="${empty teacherNo}">
			    <span>添加教师个人信息</span>
			  </c:when>
			  <c:otherwise>
			    <span>修改教师个人信息</span>
			  </c:otherwise>
			</c:choose>
	      </span>
	       <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"></span>
     	  </a>
	</div>
</div>

	<div class="main">
	<div class="left"><img src="../../images/b11.jpg"></div>
		<!--工号，名称，性别，年龄，角色，所属专业，课程，教师状态-->
		<div class="right">
			<form action='${pageContext.request.contextPath}/admin/teacher/${empty teacherMap.teacherNo?"add" : "update"}' method="post">
				<input type="hidden" value="${!empty teacherMap.teacherNo? teacherMap.id : ''}" name="id">
				<input type="hidden" value="${!empty teacherMap.teacherNo? teacherMap.user.id : ''}" name="userID">
				<input type="hidden" value="${teacherMap.user.password}" name="password" >
				<input type="hidden" value="1" name="paginMap.pageNo">
				<input type="hidden" value="10" name="paginMap.display">
				<ul>
					<li>
						工号：&nbsp;<input type="text" name="teacherNo" value='${!empty teacherNo?fn:trim(teacherMap.teacherNo):""}' id="teacherNo" class="required" placeholder="请输入你的工号">
					</li>
					<li>
						姓名：&nbsp;<input type="text" name="name" value='${!empty teacherNo?fn:trim(teacherMap.user.name):""}' id="name" class="required" placeholder="请输入你的姓名">
					</li>
					<li>
						性别：
						<select class="required" id="sex" name="sex" style="color:#999;width:257px;">
							<option value="-1">请选择</option>
							<c:forEach var="sex" items="${sexList}">
								<option value="${sex.name}" ${teacherMap.user.sex.name == sex.name ? "selected='selected'" : ""}>${sex.name}</option>
							</c:forEach>
						</select>
					<li>
						年龄：&nbsp;<input type="text" name="age" value='${!empty teacherNo?fn:trim(teacherMap.user.age):""}' id="age" class="required" placeholder="请输入你的年龄">
					</li>
					<li>
						职位：
						<select class="required" id="role" name="role" style="color:#999;width:257px;">
							<option value="-1">请选择</option>
							<c:forEach var="r" items="${roleList}">
								<option value="${r.no}" ${teacherMap.role.no == r.no ? "selected='selected'" : ""}>${r.name}</option>
							</c:forEach>
						</select>
					</li>
					<li>
						专业：
						<select class="required" id="major" name="major" style="color:#999;width:257px;">
							<option value="-1">请选择</option>
							<c:forEach var="m" items="${majorList}">
								<option value="${m.majorNo}" ${teacherMap.major.majorNo == m.majorNo ? "selected='selected'" : ""}>${m.name}</option>
							</c:forEach>
						</select>
					</li>
					<li>
						状态：
						<select class="required" id="state" name="state" style="color:#999;width:257px;">
							<option value="-1">请选择</option>
							<c:forEach var="state" items="${stateList}">
								<option value="${state.codeNo}" ${teacherMap.state.codeNo == state.codeNo ? "selected='selected'" : ""}>${state.name}</option>
							</c:forEach>
						</select>
					</li>
					<li style="margin-left:-28px;">
						身份证号：&nbsp;<input type="text" name="pid" value='${!empty teacherNo?fn:trim(teacherMap.user.pid):""}' id="pid" class="required" placeholder="请输入你的身份证号">
					</li>
					<li style="text-align:left;padding-left:70px;">
						<input type="button" name="" id="zxc" class="btn1" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重置" class="btn1">
					</li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>