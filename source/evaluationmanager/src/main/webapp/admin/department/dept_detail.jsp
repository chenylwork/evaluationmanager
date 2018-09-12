<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>院系下的专业</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/department/dept_detail.css"></link>
</head>
<body>
<div class="top">
<div class="nav">
	      <span>
	        <a href="">首页</a>&nbsp;/&nbsp;
	       	专业详情界面
	      </span>
	</div>
	<div class="left">
	<img src="${pageContext.request.contextPath}/images/b14.jpg"> 
	</div>
	<div class="right">
	<br>
	<table>
		<tr>
            <td>专业编号</td>
            <td>专业名称</td>
            <td>专业简介</td>
         </tr>
      <c:forEach var="m" items="${majorList}">
          <tr>
           
            <td>${m.majorNo}</td>
            <td>${m.name}</td>
            <td>${m.description}</td>
          </tr>
	</c:forEach>
	</table>
	</div>
</div>

</body>

</html>