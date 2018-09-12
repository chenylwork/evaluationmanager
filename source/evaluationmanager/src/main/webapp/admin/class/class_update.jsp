<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改班级页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/class/class_add.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/class/class_update.js"></script>
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
.onError{
	color: #666;
    background: url(../../images/reg3.gif) no-repeat 0 center;
	padding-left:25px;
}
.onSuccess{
	color: #fff;
    background: url(../../images/reg4.gif) no-repeat 0 center;
	padding-left:25px;
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
}
</style>
<script type="text/javascript">
function getClass(id){
	  var classes="";
	  $.ajax({
		  url:"http://localhost:8080/evaluationmanager/admin/class/classById",
			data:{"classes.id":id},
			type:"post",
			async:false,
			success:function(data){
				classes = data;
				console.log(classes);
			}
	  });
	  return classes;
}
function initUpdate(){
	var data=eval('('+getClass("${param.id}")+')');
	//console.log(data.classes.major.name);
	$("#classId").val(data.classes.id);
	initMajorList();
	$("#classNo").val(data.classes.classNo);
	$("#name").val(data.classes.name);
	$("#checkclassNo").val(data.classes.classNo);

}
//ajax 页面加载完执行
function getMajorList() {
	    	var MajorList;
	    	$.ajax({
	    		url:"http://localhost:8080/evaluationmanager/admin/major/getAllMajor",
	    		data:{},
	    		async:false,//取消异步
	    		success:function(data){
	    			MajorList = data;
	    		}
	    	});
	    	return MajorList;
	    }
	    function initMajorList(){
	    	$("#major").empty();
	    	var data=eval('('+getMajorList()+')');
	    	var initHtml = "<option value=''>请选择</option>";
	    	$("#major").append(initHtml);
	    	for(var i in data.majors) {
	    		initMajor(data.majors[i]);
        	}
	    }
	    function initMajor(major){
	    	var data=eval('('+getClass("${param.id}")+')');
	    	if (data.classes.major.name==major.name) {
	    		var initHtml = "<option value="+major.majorNo+" selected >"+major.name+"</option>";
			}else{
				var initHtml = "<option value="+major.majorNo+">"+major.name+"</option>";
			}
	    	$("#major").append(initHtml);
	    }
	    $(function(){
	    	initUpdate();
	    });	    
</script>
</head>
<body>
<div class="top" style="margin-top:10px;">
	<div class="nav">
	      <span class="layui-breadcrumb">
	        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
	        	修改班级
	      </span>
	      <a class="layui-btn" href="javascript:location.replace(location.href);" title="刷新" style="float:right;" >
        	<span style="width:30px;height:80px; color:#fff;padding-top:10px;" class="glyphicon glyphicon-refresh"> </span>
     	  </a>
	</div>
</div>
<div class="main">
<div class="left"><img src="${pageContext.request.contextPath}/images/b8.jpg"></div>
	<div class="right">
	<!--班级编号，班级名称，所属专业-->
		<form action="admin/class/update" method="post">
		<input type="hidden" value="" id="classId" name="id">
		<input type="hidden" value="" id="checkclassNo" name="checkclassNo">
		<ul>
		    <li>所属专业：
				<select class="required" id="major" name="major" style="color:#999;">
				</select>
			</li>
			<li id="liNo">班级编号：<input type="text" name="classNo" id="classNo" class="required" placeholder="请输入班级编号">                  
			</li>
			<li>班级名称：<input type="text" name="name" id="name" class="required" placeholder="请输入你的名称"></li>
			<li style="text-align:left;padding-left:100px;">
			<input type="button" name="" id="zxc" class="btn1" value="提交">
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" class="btn1"> </li>
		</ul>
		</form>
		</div>
</div>
</body>
<script type="text/javascript">		
 $("#major").change(function(){
	 var $major=$(this).val();
	 console.log($major);
	 $("#classNo").val($major);
 })
</script>
</html>