<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询班级信息</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/class/classes.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pager.css"/>
	<script src="${pageContext.request.contextPath}/js/pager.js">  </script>
	<script type="text/javascript">
	  var message="${message}";
	  if(message!=""){
		  alert(message);
	  }
      $(function(){
   	   $("#delete").click(function(){
   		   if($("[name='batchID']:checked").length == 0){
   			   alert("请选择要删除的行!");
   			   return false;
   		   }else if( !confirm("确定要删除多行记录吗?")){
   			   return false;
   		   }   
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
</head>
<body class="layui-anim layui-anim-up">
    <input type="hidden" value="${LOGINED_USER.role}" id="userRole" > 
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;班级管理
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-col-md12 x-so">
          <div class="layui-input-inline">
            <select name="major" id="classMajor" style="color:#999; height: 38px;">
            </select>
          </div>
          <input type="text" name="name" id="className" placeholder="请输入班级名称" autocomplete="off" class="layui-input">

         <button class="layui-btn" id="search" >
         <i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <!-- 批量删除 -->
       <form action="../class/delete" method="post">
	      <xblock id="class_sizebox">
	        <button class="layui-btn layui-btn-danger" id="delete" ><i class="layui-icon"></i>批量删除</button>
	        <button type="button" class="layui-btn" onclick="x_admin_show('添加班级','http://localhost:8080/evaluationmanager/admin/class/class_add.jsp',1000,600)"><i class="layui-icon"></i>添加</button>
	        <button type="button" class="layui-btn layui-btn-danger" id="excel" ><i class="layui-icon"></i>导出班级信息</button> 
	        <button type="button" class="layui-btn" id="excel" ><i class="layui-icon"></i>导入班级信息</button>
	        <span class="x-right" id="class_size" style="line-height:40px"></span>
	      </xblock>
	      <table class="layui-table">
	        <thead>
	          <tr>
	            <th>
	             <input type="checkbox" onclick="selectAll()">
	            </th>
	            <th>班级编号</th>
	            <th>班级名称</th>
	            <th>所属专业</th>
	            <c:if test="${LOGINED_USER.role=='0001'}">
	                <th>操作</th>
	            </c:if>
	         </tr>
	        </thead>
	        <tbody id="classAll">
	        </tbody>
	      </table>
      </form>
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
  </body>
</html>