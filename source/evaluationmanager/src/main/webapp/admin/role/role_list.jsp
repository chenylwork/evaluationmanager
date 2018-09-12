<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色列表</title>
    <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <script type="text/javascript" src="../../js/admin/student/student_list.js"></script>
</head>
<style type="text/css">
	table td{
		text-align:center;
	}
	table th{
		text-align:center;
	}
</style>
<body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">角色管理</a>
        <a><cite>查询角色信息</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <table class="layui-table">
        <thead>
          <tr>
      
            <th style="text-align:center;">角色编号</th>
            <th style="text-align:center;">角色名称</th>
            <th style="text-align:center;">描述信息</th>
            <th style="text-align:center;">操作</th>
         </tr>
        </thead>
        <tbody>
        <c:forEach var="r" items="${roleList}">
          <tr>

            <td>${r.no }</td>
            <td>${r.name }</td>
            <td>${!empty r.description?fn:trim(r.description ):"暂无描述"}</td>
            <td>
             			<a href="../role/delete?id=${r.id }" onclick="return confirm('确定要删除？');">删除</a>
            &nbsp;&nbsp;<a href="../role/roleByNo?no=${r.no}" >修改</a>
            </td>
          </tr>
         </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>