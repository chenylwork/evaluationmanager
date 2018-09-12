<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级详情界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/class/class_detail.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/class/class_detail.js"></script>
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<script type="text/javascript">
function getStudent(classNo){
	 var students;
	 $.ajax({
		 url:"http://localhost:8080/evaluationmanager/admin/class/getStudentByclassNo",
		 data:{"classes.classNo":classNo},
		 type:"post",
		 async:false,
		 success:function(data){
			 students = data;
				console.log(students);
			}
	 });
	 return students;
}
function initStudents(){
	 $(".student_row").remove();
	 var data=eval('('+getStudent("${param.classNo}")+')');
	 $("#student_th").remove();
	 var initHtml = "<tr id='student_th'><th>学号</th><th>姓名</th><th>性别</th><th>入学时间</th></tr>";
	 $("#detailAll").append(initHtml);
	 for(var i in data.student) {
		initStudent(data.student[i]);
	}

}
function initStudent(student){
	 var initHtml="<tr class='student_row'>";
	 initHtml+="<td>"+student.stuNo+"</td>";
	 initHtml+="<td>"+student.user.name+"</td>";
	 initHtml+="<td>"+student.user.sex.name+"</td>";
	 initHtml+="<td>"+student.joinTime+"</td>";
	 initHtml+="</tr>";
	 $("#detailAll").append(initHtml);
}
$(function(){
	 initStudents();
	})
</script>
</head>
<body>

<div class="top">
	<div class="nav">
      <span>
        <a href="">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
    	班级管理&nbsp;&nbsp;/&nbsp;&nbsp;班级详情界面
      </span>
	</div>
	<div class="left">
	<img src="${pageContext.request.contextPath}/images/b8.jpg"> 
	<table id="detailAll">
	
	</table>
	</div>

</div>
</body>
</html>