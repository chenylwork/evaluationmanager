<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>院系展示</title>
 <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pager.css"/>
	<script src="${pageContext.request.contextPath}/js/pager.js">  </script> 
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
<body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">院系管理</a>
        <a>
          <cite>院系信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="../department/paginAll" method="post">
          <input type="text" name="name" value="${name}"  placeholder="请输入系别名称" autocomplete="off" class="layui-input">
          <input type="hidden" id="search_paginNo" value="1" name="pagin.pageNo">
		  <input type="hidden" value="${pagin.display}" name="pagin.display">
          <button class="layui-btn" id="batchBtn" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      
      <form action="admin/department/batch" method="get">
      
      <script type="text/javascript">
		  $(function(){
		  	$('#batchBtn').click(function(){
		  		$("form").submit();
		  	});
		})
      </script>
      <xblock>
      <button class="layui-btn" id="delAll"><i class="layui-icon"></i>批量添加</button>
      <button class="layui-btn layui-btn-danger" onclick="return confirm('确定删除多个院系吗？');"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px">共有数据：${pagin.count}条</span>
      </xblock>
        <input type="hidden" value="${pagin.display }" name="pagin.display" />
      	<input type="hidden" value="${pagin.pageNo }" name="pagin.pageNo" />
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <input type="checkbox" onclick="selectAll()">
            </th>
            <th>院系编号</th>
            <th>院系名称</th>
            <th>院系简介</th>
            <c:if test="${LOGINED_USER.role == '0001'}">
            <th>操作</th>
            </c:if>
         </tr>
        </thead>
        <tbody>
        <c:forEach var="d" items="${pagin.data}">
          <tr>
            <td>
               <!-- <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div> -->
                <input type="checkbox" value="${d.id}" name="batchID" />
            </td>
            <td>${d.codeNo}</td>
            <td>${d.name}</td>
            <td>${empty d.description ? "暂无简介" : d.description}</td>
            <c:if test="${LOGINED_USER.role == '0001'}">
             <td>
             
            <a onclick="x_admin_show('详情','../department/allMajor?deptId=${d.codeNo }')" href="javascript:;"  target="frame">详情</a>
            &nbsp;&nbsp;
            <a href="../department/deleteDept?id=${d.id }&pagin.pageNo=${pagin.pageNo}&pagin.display=${pagin.display}" onclick="return confirm('系别下有专业等确定要删除？');">删除</a>
            &nbsp;&nbsp;
            <a href="../department/deptByNo?codeNo=${d.codeNo}&pagin.pageNo=${pagin.pageNo}&pagin.display=${pagin.display}" >修改</a>
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
			num:parseInt("${pagin.pages}"),					//页码数
			startnum:parseInt("${pagin.pageNo}"),				//指定页码
			elem:$('#page2'),		//指定的元素
			callback:function(n){	//回调函数
				$("#search_paginNo").val(n);
				$("#batchBtn").click();
				/* window.location.href = "http://localhost:8080/evaluationmanager/admin/department/paginAll?&pagin.pageNo="+n+"&pagin.display=5"; */
			}
		});
	</script>
</div>
    <script>
    //全选和全不选js方法,点击全选
		function selectAll(){
			//获得名称为“id”的checkbox对象的结合
			var allCheck=document.getElementsByName("batchID");
			//实现全选/全部选的效果
			for(var i=0;i<allCheck.length;i++){
				allCheck[i].checked=!allCheck[i].checked;
			}
		}
    </script>
    
</body>
</html>