<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据备份</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/data/database.js"></script>
<style type="text/css">
*{
	margin: 0 auto;
	padding: 0;
}
.top{
	width: 100%;
}
.nav{
	width:100%;
	height:30px;
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
.main{
	width: 100%;
	text-align: center;
}
.main_img{
	padding-top:20px;
	text-align:left;
}
.main_z{
	margin-top: 20px;
	text-align:left;
}
</style>
</head>
<body>
<div class="top" style="margin-top:10px;">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        数据管理&nbsp;&nbsp;/&nbsp;&nbsp;数据备份
	      </span>
	      <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"> </span>
     	  </a>
	</div>
</div>
<div class="main">
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="padding-left:120px;">
			<div class="main_img">
				<h2 style="font-family: 华文新魏;"><b>欢迎您进行数据备份</b></h2>
				<img src="${pageContext.request.contextPath}/images/s1.jpg">
			</div>
			<div class="main_z">
				<b>点击按钮即可进行数据备份</b>
				<br><br>
				<button type="button" class="btn btn-primary btn-lg" id="export">数据备份</button>
			</div>
		</div>
<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="padding-top: 150px;padding-right: 260px;">
	<img src="${pageContext.request.contextPath}/images/s4.png">
	<div><p id="message_id" style="font-family: 华文新魏; font-size: 20px;color: red;"></p></div>
</div>
		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="">
			<div class="main_img">
				<h2 style="font-family: 华文新魏;"><b>欢迎你进行数据还原</b></h2>
				<img src="${pageContext.request.contextPath}/images/s3.jpg">
			</div>
			<div class="main_z">
				<b>点击按钮即可进行数据还原</b>
				<br><br>
				<button type="button" class="btn btn-primary btn-lg" id="import">数据还原</button>
			</div>
		</div>
	</div>
</div>

</body>
</html>