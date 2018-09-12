<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评教前台界面</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
*{
	margin: 0px;
	padding: 0px;
}

.left_open{
	width: 100px;
	height: 50px;
	float: left;
}
.left_open ul li{
	list-style: none;
}

.main{
	float: left;
	width: 1410px;
	height: 650px;
	margin-top: -20px;
}
/*垂直导航条*/

.left-nav {
  	width: 200px;
  	height: 100%;
  	float: left;
    border-right: 1px solid #e5e5e5;
}
.div1{text-align:center; width:200px; padding-top:10px;}

.div2{height:40px; line-height:40px;cursor: pointer; font-size:13px; position:relative;border-bottom:#ccc 1px dotted;}

.t1 {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/1.png);}

.t2 {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/2.png);}
.t3 {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/4.png);}

.t4 {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/5.png);}
.t6 {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/6.png);}
.div3{display: none;cursor:pointer; font-size:13px;}

.div3 ul{margin:0;padding:0;}

.div3 li{ height:30px; line-height:30px; list-style:none; border-bottom:#ccc 1px dotted; text-align:center;}
</style>

</head>
<body>
<a href="javavava" class="id" ></a>
<nav class="navbar navbar-default" role="navigation" style="background:#3A3C3E; height:60px;" >
	<div class="navbar-header" style="width:250px;float:left;">
		<a class="navbar-brand" href="#" style="margin-top:-5px;">
			<img src="${pageContext.request.contextPath}/images/f_logo.png" width="85%" style="float:left;">
		</a> 
		
	</div>
	<div class="left_open" style="padding-top:10px;float:right;">
	            <ul>
					<li class="dropdown">
					<a href="#" style="color:#fff;"> <b>${LOGINED_USER.name}</b></a>
					</li>
					<li><a href="${pageContext.request.contextPath}/admin/user/dologout" style="color:#F97B7B; font-weight:bold;" onclick="return confirm('你确定要注销吗？')">注销</a></li>
				</ul>
        	</div>
</nav>
<div class="main" style="">
	<!--左边-->
	<div class="left-nav" style="left: 0px;">
		<div class="div1" id="reception_power_list">
			<div class="left_top">
				<img src="${pageContext.request.contextPath}/images/bbb_01.jpg"><img src="${pageContext.request.contextPath}/images/bbb_02.jpg" id="2"><img src="${pageContext.request.contextPath}/images/bbb_03.jpg"><img src="${pageContext.request.contextPath}/images/bbb_04.jpg"> 
			</div>
		</div>
	</div>
	<!--右边-->
	<div class="right" style=" float:left; width:85%;height:105%;margin-left:10px;">
		 <!-- <iframe src='http://localhost:8080/evaluationmanager/student.html' id="frame" name="frame" frameborder="0" scrolling="0" class="x-iframe" width="100%" height="100%" ></iframe> -->
	 <iframe src='${pageContext.request.contextPath}/admin/welcome.jsp' id="frame" name="frame" frameborder="0" scrolling="0" class="x-iframe" width="100%" height="100%"></iframe>
	</div>
</div>	
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/power.js"></script>
<script type="text/javascript">$(function(){power_load("${LOGINED_USER.account}","Q");})</script>
<script type="text/javascript">
$(document).ready(function(){
		$(".div2").click(function(){ 
			$(this).next("div").slideToggle("slow")  
			.siblings(".div3:visible").slideUp("slow");
		});
var power_1601 = "${pageContext.request.contextPath}/admin/user/user_details.jsp?id=${LOGINED_USER.id}";
var power_1602 = "${pageContext.request.contextPath}/admin/user/user_update.jsp?id=${LOGINED_USER.id}";
var power_1801 = "${pageContext.request.contextPath}/admin/paper/evaluationList?data=${LOGINED_USER.account}";
$("#power_1601 a").attr("href",power_1601);
$("#power_1602 a").attr("href",power_1602);
$("#power_1801 a").attr("href",power_1801);
});

</script>
</html>
