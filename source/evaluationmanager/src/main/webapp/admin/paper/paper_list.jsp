<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷信息列表</title>
	<link rel="shortcut icon" href="/favicon.ico" type="../../image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <script type="text/javascript" src="../../js/common/common.js"></script>
    
    <!-- 分页样式 -->
    <link rel="stylesheet" href="../../css/pager.css">
    <script type="text/javascript" src="../../js/pager.js"></script>
</head>
<body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">试卷管理</a>
        <a>
          <cite>试卷信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="" id="search_form">
        <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
        <input type="hidden" value="1" name="paginMap.pageNo" />
          <input type="text" name="paperNo"  placeholder="请输入试卷编号" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach">
          <i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px">共有数据：${paginMap.count}条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>试卷编号</th>
            <th>试卷类型</th>
            <th>试卷描述</th>
            <th>测试开始日期</th>
            <th>测试结束日期</th>
            <th>操作</th>
         </tr>
        </thead>
        <tbody>
        <c:forEach items="${paginMap.data }" var="paper">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${paper.paperNo}</td>
            <td>${paper.type.name}</td>
            <td>${empty paper.description ? "暂无描述" : paper.description }</td>
            <td>${paper.startTime}</td>
            <td>${paper.endTime}</td>
            <td>
            <a href="http://localhost:8080/evaluationmanager/admin/paper/paper_question_select.jsp?no=${paper.paperNo}&operation=details&startTime=${paper.startTime}&endTime=${paper.endTime}&description=${paper.description}&paperTypeName=${paper.type.name}">详情</a>
            &nbsp;&nbsp;<a href="javascript:alert('该功能暂未开放！');">删除</a>
            &nbsp;&nbsp;<a href="http://localhost:8080/evaluationmanager/admin/paper/paper_question_select.jsp?no=${paper.paperNo}&operation=update">修改</a>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
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
				num:${paginMap.pages},//页码数
				startnum:${paginMap.pageNo},//指定页码
				elem:$('#page2'),		//指定的元素
				callback:function(n){	//回调函数
					replaceParamVal("paginMap.pageNo",n);
				}
			});
			$(document).ready(function(){
				var url = document.location.toString();
				var action = url.substring(0,url.indexOf("?"));
				console.log(action);
				$("#search_form").attr("action",action);
			});
		</script>
    </div>
  </body>
</html>