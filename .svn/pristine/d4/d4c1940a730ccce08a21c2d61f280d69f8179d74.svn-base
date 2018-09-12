<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>专业信息查询</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <!-- 上下页样式加js效果 -->
    <link rel="stylesheet" href="../../css/pager.css"/>
	<script src="../../js/pager.js">  </script> 
    <style type="text/css">
		table td{
			text-align:center;
		}
		table th{
			text-align:center;
		}
    </style>
  </head>

  <body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <form>
	      	<input type="hidden" value="${paginMap.display}" name="paginMap.display" />
	      	<input type="hidden" value="${paginMap.pageNo}" name="paginMap.pageNo" />
	      <table class="layui-table">
	        <thead>
	          <tr>
	            <th style="text-align:center;">编号</th>
	            <th style="text-align:center;">专业名称</th>
	            <th style="text-align:center;">操作</th>
	         </tr>
	        </thead>
	        <tbody>
	         <c:forEach var="major" items="${majorMaplist}">
	        <tr>
	            <td>${major.deptNo.name}</td>
	            <td>${major.name }</td>
	            <td>
	             <a onclick="x_admin_show('详情','../major/detail?majorNo=${major.majorNo}')" href="javascript:;" target="frame">详情</a>
	            </td>
	          </tr>
	         </c:forEach>
	        </tbody>
	      </table>
      </form>
    <!-- 分页 -->
    <div class="page">
	<ul class="pagination" id="page2">
    </ul>
	<div class="pageJump">
		<span>跳转到</span>
		<input type="text"/>
		<span>页</span>
		<button type="button" class="button">确定</button>
	</div>
	</div>
		<script>
		Page({
			num:parseInt("${paginMap.pages}"),					//页码数
			startnum:parseInt("${paginMap.pageNo}"),				//指定页码
			elem:$('#page2'),		//指定的元素
			callback:function(n){	//回调函数
				window.location.href = "http://localhost:8080/evaluationmanager/admin/major/pagin?paginMap.pageNo="+n+"&paginMap.display=10";
			}
		});
	</script>
    </div>
  </body>
  <script type="text/javascript">
  	console.log("专业编码 = ${deptNo}");
  	console.log("每页显示行号 = ${paginMap.display}");
  	console.log("页码 = ${paginMap.pageNo}");
  </script>
</html>
