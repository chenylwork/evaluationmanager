<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!--
	String path = request.getContextPath();
-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>登录日志信息查询</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <!-- 上下页样式加js效果 -->
    <link rel="stylesheet" href="../../css/pager.css"/>
	<script src="../../js/pager.js">  </script> 
	<script type="text/javascript">
       $(function(){
    	   $("#delAll").click(function(){
    		   if($("[name='batchID']:checked").length == 0){
    			   alert("请选择要删除的行!");
    			   return false;
    		   }else if( !confirm("确定要删除多行记录吗?")){
    			   return false;
    		   }   
    	   });   
       });
    </script>
  </head>
  
  <body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
         <a href="">日志管理</a>
        <a>
          <cite>操作信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form action="http://localhost:8080/evaluationmanager/admin/log/pagin" method="post" class="layui-form layui-col-md12 x-so" >
          <input class="layui-input" placeholder="开始日期" name="loginTime" id="start" value="${loginTime}">
          <input type="text" name="user"  placeholder="请输入用户名" autocomplete="off" class="layui-input" value="${user}">
          <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
	      	<input type="hidden" value="${paginMap.pageNo}" name="paginMap.pageNo" />
	      	<button class="layui-btn" id="batchBtn" lay-filter="sreach">
          <i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <form action="http://localhost:8080/evaluationmanager/admin/log/batch" method="get">
       <script type="text/javascript">
		  $(function(){
		  	$('#batchBtn').click(function(){
		  		$("form").submit();
		  	});
		})
      </script>
      <xblock>
       <button class="layui-btn layui-btn-danger" id="delAll"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px">共有数据：${paginMap.count} 条</span>
      </xblock>
      <!-- 分页隐藏域 -->
	   	<input type="hidden" value="${paginMap.display}" name="paginMap.display" />
	   	<input type="hidden" value="${paginMap.pageNo}" name="paginMap.pageNo" />
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary" onclick="selectAll()"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>编号</th>
            <th>登录用户</th>
            <th>登陆用户名称</th>
            <th>登陆角色</th>
            <th>登录时间</th>
            <th>登录ip地址</th>
            <th>操作</th>
         </tr>
        </thead>
        <tbody>
       <c:forEach var="log" items="${paginMap.data}">
           <tr>
            <td>
              <!-- <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div> -->
             <input type="checkbox" value="${log.id}" name="batchID" />
            </td>
            <td>${log.id}</td>
            <td>${log.user.account}</td>
            <td>${log.user.name}</td>
            <td>${log.user.role.name}</td>
            <td>${log.loginTime }</td>
            <td>${log.ip}</td>
            <td class="td-manage">
              <a title="删除" onclick="return confirm('你确定要删除此记录吗?');" href="delete?id=${log.id }&paginMap.pageNo=${paginMap.pageNo}&paginMap.display=${paginMap.display}">
            		  删除
              </a>
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
				window.location.href = "http://localhost:8080/evaluationmanager/admin/log/pagin?paginMap.pageNo="+n+"&paginMap.display=10";
			}
		});
	</script>

    </div>
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
      //全选和全不选js方法
		function selectAll(){
			//获得名称为“id”的checkbox对象的结合
			var allCheck=document.getElementsByName("batchID");
			//实现全选/全部选的效果
			for(var i=0;i<allCheck.length;i++){
				allCheck[i].checked=!allCheck[i].checked;
			}
		}
    </script>

  </body>

</html>