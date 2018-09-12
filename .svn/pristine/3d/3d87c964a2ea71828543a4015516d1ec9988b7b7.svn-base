<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色权限管理</title>
	<link rel="shortcut icon" href="/favicon.ico" type="../../image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
</head>
<body>
	<div class="x-body">
		<div class="x-nav">
			<span class="layui-breadcrumb">
				<a href="">首页</a>
				<a href="">权限管理</a>
				<a><cite>角色权限管理</cite></a>
			</span>
			<a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
			<i class="layui-icon" style="line-height:30px">ဂ</i></a>
	    </div>
	   	<xblock>
	   		<a class="layui-btn" type="button" href="${pageContext.request.contextPath}/admin/power/AllRoleAndInfo"><i class="layui-icon"></i>添加权限信息</a>
	   	</xblock>
		<table class="layui-table">
	        <thead>
	          <tr>
	            <th>编号</th>
	            <th>角色编号</th>
	            <th>角色名称</th>
	            <th>描述</th>
	            <th>操作</th></tr>
	        </thead>
	        <tbody>
		        <c:forEach var="role" items="${roleList}">
		          <tr>
		            <td>${role.id}</td>
		            <td>${role.no}</td>
		            <td>${role.name}</td>
		            <td>${empty r.description?"暂无描述":r.description}</td>
		             <td>
		            &nbsp;&nbsp;<a onclick="x_admin_show('权限信息','getRoleName?powerRole.role=${role.no}')" href="javascript:;">权限信息</a>
		            <a href="../power/remove?powerRole.role=${role.no}" onclick="return confirm('确定清除所有权限？');">清除权限</a>
		            </td>
		          </tr>
		        </c:forEach>
	        </tbody>
	      </table>
	</div>
</body>
</html>