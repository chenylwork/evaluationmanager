<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>教师信息列表</title>
	<link rel="shortcut icon" href="/favicon.ico" type="../../image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    
    <!-- 分页样式 -->
    <link rel="stylesheet" href="../../css/pager.css">
    <script type="text/javascript" src="../../js/pager.js"></script>
      <script type="text/javascript">
       $(function(){
    	   $("#delAll").click(function(){
    		   if($("[name='batchID']:checked").length == 0){
    			   alert("请选择要删除的行!");
    			   return false;
    		   }else if( !confirm("确定要删除多行记录吗?")){
    			   return false;
    		   }   
    	   });   
       });
    </script>
</head>
<body>
	<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">教师管理</a>
        <a>
          <cite>教师信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="${pageContext.request.contextPath}/admin/teacher/select?paginMap.pageNo=1&paginMap.display=10" title="刷新">
      <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form action="${pageContext.request.contextPath}/admin/teacher/select" method="post" class="layui-form layui-col-md12 x-so">
		  <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
		  <input type="hidden" value="1" name="paginMap.pageNo" />
          <input type="text" name="username" value="${username}"  placeholder="请输入教师姓名" autocomplete="off" class="layui-input">
          <div class="layui-input-inline">
            <select name="state">
              <option value="">教师状态</option>
              <c:forEach var="s" items="${stateList}">
              	<c:choose>
              		<c:when test="${s.codeNo == state}">
		              	<option value="${s.codeNo}" selected="selected">${s.name}</option>
              		</c:when>
              		<c:otherwise>
		              	<option value="${s.codeNo}">${s.name}</option>
              		</c:otherwise>
              	</c:choose>
              </c:forEach>
            </select>
          </div>
          <div class="layui-input-inline">
            <select name="role">
              <option value="">职位</option>
              <c:forEach var="r" items="${roleList}">
              	<c:choose>
              		<c:when test="${r.no == role}">
		              	<option value="${r.no}" selected="selected">${r.name}</option>
              		</c:when>
              		<c:otherwise>
		              	<option value="${r.no}">${r.name}</option>
              		</c:otherwise>
              	</c:choose>
              </c:forEach>
            </select>
          </div>
          <div class="layui-input-inline">
            <select name="major">
              <option value="">所属专业</option>
              <c:forEach var="m" items="${majorList}">
              	<c:choose>
              		<c:when test="${m.majorNo == major}">
		              	<option value="${m.majorNo}" selected="selected">${m.name}</option>
              		</c:when>
              		<c:otherwise>
		              	<option value="${m.majorNo}">${m.name}</option>
              		</c:otherwise>
              	</c:choose>
			  </c:forEach>
            </select>
          </div>
          <button class="layui-btn" id="batchBtn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <form action="${pageContext.request.contextPath}/admin/teacher/delete" method="post">
	      <xblock>
	        <button class="layui-btn layui-btn-danger" id="delAll"><i class="layui-icon"> </i>批量删除</button>
	        <button class="layui-btn" type="button" onclick="exportFun();"><i class="layui-icon">&#xe621;</i>导出教师信息</button>
        	<button class="layui-btn" type="button" onclick="window.location.href='http://localhost:8080/evaluationmanager/admin/teacher/import.jsp'"><i class="layui-icon"></i>导入教师信息</button>
	        <span class="x-right" style="line-height:40px">共有数据:${paginMap.count} 条</span>
	      </xblock>
	      <input type="hidden" value="${paginMap.display}" name="paginMap.display" />
	      <input type="hidden" value="${paginMap.pageNo}" name="paginMap.pageNo" />
	      <table class="layui-table">
	        <thead>
	          <tr>
	            <th>
	              <input type="checkbox" onclick="selectAll()">
	            </th>
	            <th>教师工号</th>
	            <th>教师姓名</th>
	            <th>性别</th>
	            <th>职位</th>
	            <th>所属专业</th>
	            <th>教师状态</th>
	            <c:if test="${LOGINED_USER.role == '0001'}">
	            	<th>操作</th>
	            </c:if>
	            </tr>
	        </thead>
	        <tbody>
		        <c:forEach var="t" items="${paginMap.data}">
		          <tr>
		            <td>
		              <input type="checkbox" value="${t.no}" name="batchID" />
		            </td>
		            <td>${t.no}</td>
		            <td>${t.name}</td>
		            <td>${t.sex}</td>
		            <td>${t.roleName}</td>
		            <td>${t.majorName}</td>
		            <td>${t.stateName}</td>
		            <c:if test="${LOGINED_USER.role == '0001'}">
		             <td>
		            <a onclick="x_admin_show('详情','${pageContext.request.contextPath}/admin/teacher/detail?teacherNo=${t.no}')" href="javascript:;" target="frame">详情</a>
		            &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/teacher/resetPwd?account=${t.no}&paginMap.pageNo=${paginMap.pageNo}&paginMap.display=${paginMap.display}" onclick="return confirm('你确定要重置密码吗？')">重置密码</a>
		            &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/teacher/delete?batchID=${t.no}&paginMap.pageNo=${paginMap.pageNo}&paginMap.display=${paginMap.display}" onclick="return confirm('你确定要删除吗？')">删除</a>
		            &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/teacher/updateSelect?teacherNo=${t.no}&paginMap.pageNo=${paginMap.pageNo}&paginMap.display=${paginMap.display}" >修改</a>
		            </td>
		            </c:if>
		          </tr>
		        </c:forEach>
	        </tbody>
	      </table>
      </form>
      	<!-- 分页 -->
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
		<script>
			Page({
				num:parseInt("${paginMap.pages}"),				//页码数
				startnum:parseInt("${paginMap.pageNo}"),		//指定页码
				elem:$('#page2'),		//指定的元素
				callback:function(n){	//回调函数
					window.location.href = "http://localhost:8080/evaluationmanager/admin/teacher/select?paginMap.pageNo="+n+"&paginMap.display=10";
				}
			});
		</script>
    </div>
    <script type="text/javascript">
	    layui.use('laydate', function(){
	        var laydate = layui.laydate;
	        
	        //执行一个laydate实例
	        laydate.render({
	          elem: '#start' //指定元素
	        });
	
	        //执行一个laydate实例
	        laydate.render({
	          elem: '#end' //指定元素
	        });
	      });
	    function selectAll(){
			  var allCheck=document.getElementsByName("batchID");
				for(var i=0;i<allCheck.length;i++){
					allCheck[i].checked=!allCheck[i].checked;
				}
		  }
    </script>
</body>
</html>