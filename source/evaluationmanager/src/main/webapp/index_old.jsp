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
<script type="text/javascript">

$(document).ready(function(){

		$(".div2").click(function(){ 

			$(this).next("div").slideToggle("slow")  

			.siblings(".div3:visible").slideUp("slow");

		});

	});

</script>
</head>
<body>

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
					<li><a href="" style="color:#F97B7B; font-weight:bold;">注销</a></li>
				</ul>
        	</div>
</nav>




<div class="main" style="">
	<!--左边-->
	<div class="left-nav" style="left: 0px;">
		<div class="div1">
			<div class="left_top"><img src="${pageContext.request.contextPath}/images/bbb_01.jpg"><img src="${pageContext.request.contextPath}/images/bbb_02.jpg" id="2"><img src="${pageContext.request.contextPath}/images/bbb_03.jpg"><img src="${pageContext.request.contextPath}/images/bbb_04.jpg"> </div>
			<div class="div2"><div class="t1"> </div>信息查询</div>
			<div class="div3">
				<ul>
					<!--<li> <a href="${pageContext.request.contextPath}/admin/student/oneClassStudents?classNo=3504041" target="frame">查询本系学生</a></li>
					<li> <a href="${pageContext.request.contextPath}/admin/class/getClassByMajor?major=350404" target="frame">查询本系班级</a></li>
					<li> <a href="selClass.html" target="frame">查询本系老师</a></li>
					<li> <a href="${pageContext.request.contextPath}/admin/major/getMajorBydeptNo?deptNo=35040" target="frame">查询本院系信息</a></li>
					<li> <a href="admin/student/paginAll?paginMap.pageNo=1&paginMap.display=5" target="frame">查询全部学生</a></li>
					<li> <a href="admin/teacher/select?paginMap.pageNo=1&paginMap.display=10" target="frame">查询全部老师</a></li>
					<li> <a href="" target="frame">查询全部班级</a></li>
					<li> <a href="${pageContext.request.contextPath}/admin/department/paginAll?pagin.pageNo=1&pagin.display=5" target="frame">查询全部院系</a></li>-->
					<li><a href="${pageContext.request.contextPath}/admin/department/paginAll?pagin.pageNo=1&pagin.display=5" target="frame">院系信息</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/class/getClassByMajor?deptNo=" target="frame">专业信息</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/class/class_list.jsp" target="frame">班级信息</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/teacher/select?paginMap.pageNo=1&paginMap.display=10" target="frame">教师信息</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/student/paginAll?paginMap.pageNo=1&paginMap.display=5" target="frame">学生信息</a></li>
				</ul>
			</div>
			<div class="div2"><div class="t3"> </div>个人信息</div>
				<div class="div3">
				<ul>
					<li><a href="stu.html" target="frame">查看个人信息</a></li>
					<li><a href="http://localhost:8080/evaluationmanager/admin/major/major_add.jsp" target="frame">修改个人信息</a></li>
				</ul>
			</div>
			<div class="div2"><div class="t4"> </div>网上评教</div>
			<div class="div3">
				<ul>
					<li> <a href="admin/paper/evaluationList?data=${LOGINED_USER.account}" target="frame">开始评教</a></li>
				</ul>
			</div>
			<div class="div2"><div class="t6"> </div>学期测评</div>
			<div class="div3">
				<ul>
					<li> <a href="" target="frame">查看测评记录</a></li>
					<li> <a href="" target="frame">查看测评结果</a></li>
				</ul>
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
</html>
