<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加院系</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/department/dept_add.css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/department/dept_add.js"></script>
<style type="text/css">
.onError{
	color: #666;
    background: url(${pageContext.request.contextPath}/images/reg3.gif) no-repeat 0 center;
	padding-left:25px;
}
.onSuccess{
	color: #fff;
    background: url(${pageContext.request.contextPath}/images/reg4.gif) no-repeat 0 center;
	padding-left:25px;
}
.layui-btn {
    display: inline-block;
    height: 38px;
    line-height: 38px;
    padding: 0 15px;
    background-color: #009688;
    color: #fff;
    white-space: nowrap;
    text-align: center;
    font-size: 14px;
    border: none;
    border-radius: 2px;
    margin-top:-8px;
    margin-right:15px;
}
</style>
</head>
<body>

<div class="top" style="margin-top:15px;">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        <c:choose>
				<c:when test="${empty codeNo}">
					<span>添加系别信息</span>
				</c:when>
				<c:otherwise>
					<span>修改系别信息</span>
				</c:otherwise>
			</c:choose>
	      </span>
	       <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"> </span>
     	  </a>
	</div>
</div>

<div class="main">
<div class="left"><img src="${pageContext.request.contextPath}/images/b14.jpg"></div>
	<div class="right">
		<form action='admin/department/${empty codeNo ? "saveDept" : "updateDept"}' method="post">
		   <input type="hidden" value="${!empty deptMap.codeNo ? deptMap.typeNo : ''}" name="updateCode.typeNo">
		    <input type="hidden" value="${!empty deptMap.codeNo ? deptMap.id : ''}" name="updateCode.id">
			<input type="hidden" value="1" name="pagin.pageNo">
			<input type="hidden" value="5" name="pagin.display">
		<ul>
			<li>系别编号：<input type="text" name="updateCode.codeNo" id="codeNo" class="required" placeholder="请输入院系编号" value='${!empty deptMap.codeNo ?fn:trim(deptMap.codeNo):""}'></li>
			<li>系别名称：<input type="text" name="updateCode.name" id="name" class="required" placeholder="请输入院系名称" value='${!empty deptMap.codeNo ? fn:trim(deptMap.name):""}'></li>
			<li>描述信息：<input type="text" name="updateCode.description" id="des" class="required" placeholder="请输入描述信息" value='${!empty deptMap.codeNo ?fn:trim(deptMap.description):""}'></li>
			<li style="text-align:left;padding-left:100px;">
			<input type="button" id="zxc" class="btn1" value="提交">
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" class="btn1"> </li>
		</ul>
		</form>
		</div>
</div>
</body>
</html>