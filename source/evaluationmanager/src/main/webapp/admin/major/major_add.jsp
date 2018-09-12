<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专业添加页面</title>
	<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../../css/admin/major/major_add.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/admin/major/major_add.js"></script>
</head>
<body>
<div class="top" style="margin-top:10px;">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        <c:choose>
				<c:when test="${empty majorNo}">
					<span>添加专业信息</span>
				</c:when>
				<c:otherwise>
					<span>修改专业信息</span>
				</c:otherwise>
			</c:choose>
	      </span>
	      <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"> </span>
     	  </a>
	</div>
</div>
<div class="main">
<div class="left"><img src="../../images/b2.jpg"></div>
	<!---->
	<div class="right">

		<form action='../major/${empty majorMap.majorNo?"add" : "update"}' method="post">
			<input type="hidden" value="${!empty majorMap.majorNo? majorMap.id : ''}" name="updateMajor.id">
			<input type="hidden" value="1" name="paginMap.pageNo">
			<input type="hidden" value="10" name="paginMap.display">
			<input type="hidden" value="${majorMap.majorNo }" id="Majorzz">
		<ul>
			<li style="padding-left:23px;" id="majNo">编号：
				<input type="text" name="updateMajor.majorNo" id="id" class="required" placeholder="请输入专业编号" value='${!empty majorNo?fn:trim(majorMap.majorNo):""}'>
			</li>
			<li style="padding-left:23px;">专业：
			<input type="text" name="updateMajor.name" id="name" class="required" placeholder="请输入专业名称" value='${!empty majorNo?fn:trim(majorMap.name):""}'></li>
			<li style="padding-left:23px;">系别：
			
			
			
			
			<select name="updateMajor.deptNo" class="required" id="xb" style="color:#999;" data-no="${majorMap.deptNo.codeNo}">
			<option value="-1">请选择</option>
					<c:forEach var="dept" items="${deptList}">
			       	  	<c:choose>
				      		<c:when test="${majorMap.deptNo.codeNo !=null && majorMap.deptNo.codeNo == dept.codeNo}">
				      			<option value="${dept.codeNo }" ${dept.codeNo==majorMap.deptNo.codeNo?"selected":"" }>${dept.name }</option>
				      		</c:when>
				      		<c:otherwise>
				      			<option value="${dept.codeNo }">${dept.name}</option>
				      		</c:otherwise>
		      			</c:choose>
	       	  		</c:forEach>
				</select>
			</li>
			<li>描述：<input type="text" name="updateMajor.description" id="xx" class="required" placeholder="请输入描述信息" value='${!empty majorNo?fn:trim(majorMap.description):""}'></li>
			<li style="text-ailgn:left;padding-left:100px;">
			
			<input type="button" name="" id="zxc" class="btn1" value="提交">
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" class="btn1">
			</li>
		</ul>
		</form>
		</div>
</div>
</body>
</html>


