<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
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
    <script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });
    Page({
		num:parseInt("${paginMap.pages}"),					//页码数
		startnum:parseInt("${paginMap.pageNo}"),		    //指定页码
		elem:$('#page2'),		    //指定的元素
		callback:function(n){	    //回调函数
			window.location.href = "http://localhost:8080/evaluationmanager/admin/evaluation/paginAll?paginMap.pageNo="+n+"&paginMap.display=5";
		}
	});
    </script>
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
      <div class="layui-row">
        <form action="${pageContext.request.contextPath}/admin/evaluation/paginAll" method="post" class="layui-form layui-col-md12 x-so">
          <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
		  <input type="hidden" id="hidden_paginMap_pageNo" value="1" name="paginMap.pageNo" />
          <input type="text" name="evaluationView.username" value="${username}"  placeholder="请输入测评人" autocomplete="off" class="layui-input">
          <input type="text" name="evaluationView.teacherName" value="${teacherName}"  placeholder="请输入被测老师" autocomplete="off" class="layui-input">
           <div class="layui-input-inline" > 
            <select name="evaluationView.paperType" id="paper" style="width:227px;height:38px;">
				<option value="">请选择试卷类型</option>
	       	  	<c:forEach var="p" items="${paperTypeList}">
              	<c:choose>
              		<c:when test="${p.codeNo == paper}">
		              	<option value="${p.codeNo}" selected="selected">${p.name}</option>
              		</c:when>
              		<c:otherwise>
		              	<option value="${p.codeNo}">${p.name}</option>
              		</c:otherwise>
              	</c:choose>
			  </c:forEach>
			</select>
           </div>
          <input class="layui-input" name="evaluationView.time" placeholder="测评日期" id="start">
          <button class="layui-btn" lay-submit="" id="submit_btn" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <form>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px">共有数据：${paginMap.count }条</span>
      </xblock>
      <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
	  <input type="hidden" value="${paginMap.pageNo}" name="paginMap.pageNo" />
      <table class="layui-table">
        <thead>
          <tr>
            <th style="text-align:center;">
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th style="text-align:center;">测评试卷</th>
            <th style="text-align:center;">试卷类型</th>
            <th style="text-align:center;">测评人</th>
            <th style="text-align:center;">被测教师</th>
            <th style="text-align:center;">测评时间</th>
            <th style="text-align:center;">测评总分</th>
            <th style="text-align:center;">操作</th>
         </tr>
        </thead>
        <tbody>
        <c:forEach var="r" items="${paginMap.data}">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${r.paper }</td>
            <c:forEach var="paperType" items="${paperTypeList}">
            	<c:if test="${paperType.codeNo == r.paperType }">
		            <td>${paperType.name}</td>
            	</c:if>
            </c:forEach>
            <td>${r.username}</td>
            <td>${r.teacherName}</td>
            <td>${r.time }</td>
            <td>${r.score }</td>
            <td>
            <a href="<%=request.getContextPath() %>/admin/paper/evaluation?paperNo=${r.paper }&data=${r.teacher}">详情</a>
            &nbsp;&nbsp;<a href="">删除</a>
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
    </div>
    <script type="text/javascript">
    Page({
		num:${paginMap.pages},		//页码数
		startnum:${paginMap.pageNo},				//指定页码
		elem:$('#page2'),		//指定的元素
		callback:function(n){	//回调函数
			$("#hidden_paginMap_pageNo").val(n);
			$("#submit_btn").click();
		}
	});
    </script>
  </body>
</html>