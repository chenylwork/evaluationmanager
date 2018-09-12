<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户信息</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/user/users.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pager.css"/>
	<script src="${pageContext.request.contextPath}/js/pager.js">  </script> 
    <style type="text/css">
		table td{
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
      <div class="layui-row">
        <form class="layui-col-md12 x-so">
	        <!--  <div class="layui-input-inline">
		          <select class="select" name="role" id="role" style="color:#999;">
				  </select>
		          <input type="text" name="username"  placeholder="请输入用户名" autocomplete="off" class="layui-input">
		          <input class="layui-input" placeholder="请输入性别" name="start" id="start">
	         </div> -->
	     <div class="layui-input-inline">
            <select name="role" id="userRole" style="color:#999; height: 38px;">
            </select>
         </div>   
	     <input type="text" name="name" id="userName"  placeholder="请输入用户名" autocomplete="off" class="layui-input">
	     <input type="text" placeholder="请输入性别（男/女）" id="userSex" name="sex" autocomplete="off" class="layui-input">
          
          <button class="layui-btn" id="search" >
          <i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock id="user_sizebox">
        <span class="x-right" id='user_size' style="line-height:40px"></span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th style="text-align:center;">
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th style="text-align:center;">账号</th>
            <th style="text-align:center;">用户名</th>
            <th style="text-align:center;">性别</th>
            <th style="text-align:center;">年龄</th>
            <th style="text-align:center;">角色</th>
            <th style="text-align:center;">操作</th>
         </tr>
        </thead>
        <tbody id="userAll">
        </tbody>
      </table>
      </div>
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