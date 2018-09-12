<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>分配试卷</title>
	<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
	<link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
	<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
*{
	margin: 0 auto;
	padding: 0;
}
body{

}
.top{
	width: 100%;
	height: 80px;
	background: #F5F4F4;
	font-size: 24px;
	line-height: 80px;
	text-align: center;
	font-family: 宋体;
	margin-top:15px; 
}
.container{
	margin-top: 20px;
}
.footer{
	width: 100%;
	margin-top: 30px;
	text-align: center;
}
</style>
<script type="text/javascript">

</script>
</head>
<body>
<div class="top">
	<span>分配试卷</span>
</div>
<form role="form" id="appoint_form" action="http://localhost:8080/evaluationmanager/admin/paper/appoint" method="post">
<div class="container">
	<div class="row">
		<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">	
			  <div class="form-group">    
			  	<label for="name">测试开始时间</label> 
			    <input type="text" class="form-control" name="startTime" id="startTime" placeholder="请输入开始时间">
			  </div>
		</div>
		<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">	
			  <div class="form-group">    
			  	<label for="name">测试结束时间</label> 
			    <input type="text" class="form-control" name="endTime" id="endTime" placeholder="请输入结束时间">
			  </div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">	
			  <div class="form-group">    
			  	<label for="name">可被测评教师</label>
			  	<select multiple id="teacherSelect" class="form-control">
			  		<c:forEach var="teacher" items="${mapList}">
			  		<option value="${teacher.teacherNo}">${teacher.user.name}</option>
			  		</c:forEach>
			  	</select> 
			   
			  </div>
		</div>
		<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">	
			  <div class="form-group" style="padding-top:20px;text-align:center;">    
			  	<span id="addTea" class="btn btn-primary">添加选中教师&gt;&gt;</span>
			  	<br><br>
			  	<span id="removeTea" class="btn btn-warning">&lt;&lt;移除选中教师</span>
			  </div>
		</div>
		<div class="clearfix visible-xs"></div>
		<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">	
			  <div class="form-group">    
			  	<label for="name">已选择教师</label>
			  	<select multiple id="teacherSelected" name="teacherNos" class="form-control">
			  		
			  	</select> 
			  </div>
		</div>
	</div>
	
	<div class="row">
		<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">	
			  <div class="form-group">    
			  	<label for="name">可选择试卷</label>
			  	<select multiple id="paperSelect" class="form-control">
			  		<c:forEach var="paper" items="${paperList }">
			  		<option value="${paper.paperNo}">${paper.description}</option>
			  		</c:forEach>
			  	</select> 
			   
			  </div>
		</div>
		<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">	
			  <div class="form-group" style="padding-top:20px;text-align:center;">    
			  	<span id="add" class="btn btn-primary">添加选中试卷&gt;&gt;</span>
			  	<br><br>
			  	<span id="remove" class="btn btn-warning">&lt;&lt;移除选中试卷</span>
			  </div>
		</div>
		<div class="clearfix visible-xs"></div>
		<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">	
			  <div class="form-group">    
			  	<label for="name">已选择试卷</label>
			  	<select multiple id="paperSelected" name="paperNos" class="form-control">
			  		
			  	</select> 
			  </div>
		</div>
	</div>
	<div class="footer">
		<button type="button" onclick="teaAllRight()"  id="allAdd" class="btn btn-default">移动教师</button>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="testAllRight()"  id="allAdd" class="btn btn-success">移动试卷</button>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="qk()" class="btn btn-default">清空</button>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" id="appoint_submit_btn" class="btn btn-success">分配试卷</button>
	</div>
</div>
</form>
</body>
 <script>
 var message = "${message}";
 if(message != "") {
	 alert(message);
 }
 $(function(){
	//移到右边
		$('#add').click(function(){
	//获取选中的选项，删除并追加给对方
		$('#paperSelect option:selected').appendTo('#paperSelected');
	});
	//移到左边
	$('#remove').click(function(){
		$('#paperSelected option:selected').appendTo('#paperSelect');
	});
	//移到右边
	$('#addTea').click(function(){
	//获取选中的选项，删除并追加给对方
	$('#teacherSelect option:selected').appendTo('#teacherSelected');
	});
	//移到左边
	$('#removeTea').click(function(){
	$('#teacherSelected option:selected').appendTo('#teacherSelect');
	});
	//双击选项
	$('#paperSelect').dblclick(function(){//绑定双击事件
	//获取全部的选项，删除并追加给对方
	$("option:selected",this).appendTo('#paperSelected');//追加给对方
	});
	//双击选项
	$('#paperSelected').dblclick(function(){//绑定双击事件
	//获取全部的选项，删除并追加给对方
	$("option:selected",this).appendTo('#paperSelect');//追加给对方
	});
	//双击选项
	$('#teacherSelect').dblclick(function(){//绑定双击事件
	//获取全部的选项，删除并追加给对方
	$("option:selected",this).appendTo('#teacherSelected');//追加给对方
	});
	//双击选项
	$('#teacherSelected').dblclick(function(){//绑定双击事件
	//获取全部的选项，删除并追加给对方
	$("option:selected",this).appendTo('#teacherSelect');//追加给对方
	});


	});
	function teaAllRight(){
	    $("#teacherSelect>option").appendTo("#teacherSelected");
	}
	function testAllRight(){
	    $("#paperSelect>option").appendTo("#paperSelected");
	}
	function qk(){
		$("#paperSelected>option").appendTo("#paperSelect");
		 $("#teacherSelected>option").appendTo("#teacherSelect");
	}
    layui.use('laydate', function(){
      var laydate = layui.laydate;
      //执行一个laydate实例
      laydate.render({
        elem: '#startTime' //指定元素
      });

      //执行一个laydate实例
      laydate.render({
        elem: '#endTime' //指定元素
      });
    });
    // 提交表单信息
    $("#appoint_submit_btn").click(function(){
  	  	var startTime = $("#startTime").val();
  	  	var endTime = $("#endTime").val();
  	  	var teacherSelectedSize = $("#teacherSelected>option").length;
  	  	var paperSelectedSize = $("#paperSelected>option").length;
  	  	if(startTime == "") {
  	  		alert("请确定开始时间！！");
  	  		return;
  	  	}
  	  	if(endTime == "") {
  	  		alert("请确定结束时间！！");
  	  		return;
  	  	}
  	  	if(teacherSelectedSize <= 0) {
  	  		alert("请确定分配教师！！");
  	  		return;
  	  	}
  	  	if(paperSelectedSize <= 0) {
  	  		alert("请确定分配试卷！！");
  	  		return;
  	  	}
  	  $("#teacherSelected>option").attr("selected","selected");
  	  $("#paperSelected>option").attr("selected","selected");
  	  	$("#appoint_form").submit();
    });
    </script>
</html>
