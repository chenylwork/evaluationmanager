<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情页面</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
*{
	margin: 0 auto;
	padding: 0;
}
body{
	background:#fff;

}
.top{
	width: 100%;
	height: 500px;
	padding-top: 15px;

}
.left{
	width: 800px;
	height: 300px;
	margin-left: 100px;
	float: left;
}
img{
	padding-top:40px;
	float: left;
}
table{
	float: left;
	margin-top:30px;
	margin-left: 20px;
}
table,td{
	color:#333;
	width:500px;
	height: 40px;
	border:1px solid #ccc;
	padding:5px;
	border-collapse:collapse;
	background:#f9f9f9;
	}
.nav{
	width:100%;
	height:30px;
	font-size:14px;
	padding-left:15px;
	border-bottom: 1px solid #ccc;
}
.nav a{
	color:#999;
	text-decoration:none;
}
.nav a:hover{
     color:#36C706;
}
.nav span{
	color:#999;
}
</style>
<script type="text/javascript">
  function getUser(id){
	  var user="";
	  $.ajax({
		  url:"http://localhost:8080/evaluationmanager/admin/user/getuserById",
			data:{"user.id":id},
			type:"post",
			async:false,
			success:function(data){
				user = data;
				console.log(user);
			}
	  });
	  return user;
  }
   function initDetail(){
	   var data=eval('('+getUser("${param.id}")+')');
	   console.log(data.user);
	   $(".detail_row").remove();
	   var initHtml="<tr class='detail_row'><td>编号:</td><td>"+data.user.account+"</td></tr>";
       initHtml+="<tr class='detail_row'><td>用户名:</td><td>"+data.user.name+"</td></tr>";
       initHtml+="<tr class='detail_row'><td>性别:</td><td>"+data.user.sex.name+"</td></tr>";
       initHtml+="<tr class='detail_row'><td>年龄:</td><td>"+data.user.age+"</td></tr>";
       initHtml+="<tr class='detail_row'><td>角色类型:</td><td>"+data.user.role.name+"</td></tr>";
       initHtml+="<tr class='detail_row'><td>身份证号:</td><td>"+data.user.pid+"</td></tr>";
       $("#detailAll").append(initHtml);
   }
  $(function(){
	  initDetail();
	})
</script>
</head>
<body>
<div class="top">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			查看用户个人信息
	      </span>
	</div>
	<div class="left">
	<img src="${pageContext.request.contextPath}/images/b5.jpg"> 
	<table id="detailAll">
	</table>
	</div>
</div>
</body>
</html>