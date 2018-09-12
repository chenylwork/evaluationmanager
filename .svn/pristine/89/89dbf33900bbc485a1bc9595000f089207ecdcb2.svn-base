<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息导入</title>
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/style.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
	<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
	<style type="text/css">
		.error{background-color: red; color: #ffffff;}
	</style>
</head>
<body>
<br><br>
<!--  <ul id="myTab" class="nav nav-tabs" style="">  
		<li class="active" style="width:250px;text-align:center;"><a href="#z1" data-toggle="tab" style="font-weight:bold;">正确数据&nbsp;&nbsp;&nbsp;&nbsp;
		<span class="badge" style="background:#66D841" id="successSize">0</span></a> 
		</li>  
		<li style="width:250px;text-align:center;"><a href="#z2" data-toggle="tab" style="font-weight:bold;">错误数据&nbsp;&nbsp;&nbsp;&nbsp;
		<span class="badge" style="background:#EC5E3E;" id="failSize">0</span></a></li>  
		<li style="width:500px;text-align:center;padding-left:15px;">-->
			<form action="upload" method="post" enctype="multipart/form-data" id="importForm">
				<button type="button" class="btn btn-primary" id="download_tamplate_btn">下载模板</button>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" id="chooseFileBtn" class="btn btn-primary">选择文件</button>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-primary" id="importBtn">保存数据</button>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="file" id="file" style="display: none;" name="file" value="${file}" />
				<button type="button" class="btn btn-primary" id="errorBtn" >错误行</button>
				<a href="http://localhost:8080/evaluationmanager/download/download?file=学生信息模板.xls" id="download_tamplate_a"></a>
				<script type="text/javascript">
					$("#errorBtn").click(function(){
						document.querySelector(".error").scrollIntoView();
					});
				</script>
			</form>
	
<div id="myTabContent" class="tab-content"> 
<!--导入按钮 重新填入-->
<!--///////////////////////////////////////正确数据///////////////////////////////////////////////////-->
	<div class="tab-pane fade in active" id="z1">     
		<table class="layui-table" class="table_box">
	        <thead class="table_header">
	        	<tr>
	        		<th>行号</th>
	        		<th>学号</th>
	        		<th>名称</th>
	        		<th>性别</th>
	        		<th>年龄</th>
	        		<th>身份证号</th>
	        		<th>所属专业</th>
	        		<th>入学日期</th>
	        		<th>毕业日期</th>
	        		<th>现状态</th>
	        		<th>所属班级</th>
	        	</tr>
	        </thead>
	        <tbody id="successBodyID">
	        	<c:if test="${!empty listMapData}">
		        	<c:forEach var="student" items="${listMapData}" varStatus="status">
			        	<tr>
			        		<td>${status.count}</td>
			        		<td class="student_no">${student.studentNo}</td>
			        		<td class="student_name">${student.name}</td>
			        		<td class="student_sex">${student.sex}</td>
			        		<td class="student_age">${student.age}</td>
			        		<td class="student_pid">${student.pid}</td>
			        		<td class="student_major">${student.major}</td>
			        		<td class="student_joinTime">${student.joinTime}</td>
			        		<td class="student_endTime">${student.endTime}</td>
			        		<td class="student_state">${student.state}</td>
			        		<td class="student_class" data-major="${student.major}">${student['class']}</td>
			        	</tr>
		        	</c:forEach>
	        	</c:if>
	        </tbody>
	    </table>
	</div>
<!--///////////////////////////////////////错误数据///////////////////////////////////////////////////-->
	<!--  <div class="tab-pane fade" id="z2">   
	<table class="layui-table">
        <thead class="table_header">
        </thead>
        <tbody id="failBodyID">
        </tbody>
      </table>
	</div>-->

</div>
</body>
<!-- excel操作 -->
<script type="text/javascript">
$("#chooseFileBtn").click(function(){
	$("#file").click();
});
$("#file").change(function(){
	$("#importForm").submit();
});
$("#importBtn").click(function(){
	if($(".error").length > 0) {
		alert("还有错误信息，不可以进行保存！！！");
		return;
	}
	$("#importForm").attr("action","batchInsert").submit();
});
$("#download_tamplate_btn").click(function(){
	if(confirm("确认下载模板？？")) {
		window.location.href = "http://localhost:8080/evaluationmanager/download/download?file=学生信息模板.xls";
	}
});
$(function(){
	var message = "${message}"
	if(message != "") {
		alert(message);
	}
	
	var majors = getAllMajor();
	var classes = getAllClass();
	$(".student_no").each(function(){
		// 获取文本信息
		var text = $(this).text();
		if(text == null || text == "") {
			// 修改属性
			$(this).addClass("error").attr("title","学号不可以为空");
		}
	});
	$(".student_major").each(function(){
		// 获取文本信息
		var text = $(this).text();
		if(text==  "" || checkMajor(majors,text) == "") {
			// 修改属性
			$(this).addClass("error").attr("title","不存在该专业！！");
		}
	});
	$(".student_class").each(function(){
		// 获取文本信息
		var className = $(this).text();
		var majorName = $(this).data("major");
		if(className) {
			
		}
		if(className==  "" || checkClass(classes,majorName,className) == "") {
			// 修改属性
			$(this).addClass("error").attr("title",majorName+"专业没有"+className);
		}
	});
});
/**
 * 专业信息检查
 */
function checkMajor(majors,majorName) {
	for(var i in majors) {
		var major = majors[i];
		if(major.name == majorName) {
			return major.majorNo;
		}
	}
	return "";
}
/**
 * 班级检查
 */
function checkClass(classes,majorName,className) {
	for(var i in classes) {
		var classInfo = classes[i];
		if(className == classInfo.name && majorName == classInfo.major.name) {
			return classInfo.classNo;
		}
	}
	return "";
}
/**
 * 获取全部的专业
 */
function getAllMajor() {
	var result = {};
	$.ajax({
		url : "http://localhost:8080/evaluationmanager/admin/major/getAllMajor",
		async:false,
		type: "get",
		success : function(data) {
			if(data != "") {
				result = eval('('+data+')').majors;
			}
		},
	});
	return result;
}
/**
 * 获取全部的班级
 */
function getAllClass() {
	var result = {};
	$.ajax({
		url : "http://localhost:8080/evaluationmanager/admin/class/ClassMapList",
		async:false,
		type: "get",
		success : function(data) {
			if(data != "") {
				result = eval('('+data+')').classes;
			}
		},
	});
	return result;
}
</script>
</html>