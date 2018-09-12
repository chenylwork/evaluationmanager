<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录-X-admin2.0</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    
	<style type="text/css">
	    .container{
	        background: #3E8ACC;
	    }
	</style>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
    <img src="${pageContext.request.contextPath}/images/f_logo.png" width="12%" style="float:left;padding:5px;">
        <div class="left_open" style="margin-left:15px;">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${LOGINED_USER.name}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','http://localhost:8080/evaluationmanager/admin/user/user_details.jsp?id=${LOGINED_USER.id}')" href="javascript:;" target="frame">个人信息</a></dd>
              <dd><a onclick="x_admin_show('修改个人信息','http://localhost:8080/evaluationmanager/admin/user/user_update.jsp?id=${LOGINED_USER.id}')" href="javascript:;" target="frame">修改个人信息</a></dd>
              <dd><a href="${pageContext.request.contextPath}/admin/user/dologout" onclick="return confirm('你确定要注销吗？')">注销</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="http://localhost:8080/evaluationmanager/index.jsp">前台首页</a></li>
        </ul>
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
           <!--  <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe705;</i>
                    <cite>${t.name}</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                	<c:forEach var="i" items="${infoList}">
                    <li>
                        <a _href="${pageContext.request.contextPath}/${i.uri}">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>${i.name}</cite>
                        </a>
                    </li >
                    </c:forEach>
                </ul>
            </li> -->
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${pageContext.request.contextPath}/admin/welcome.jsp' frameborder="0" name="right_frame" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">The teaching evaluation system of Shijiazhuang Vocational Technology Institute  ：&nbsp;&nbsp;评教系统</div>  
    </div>
    <!-- 底部结束 -->

</body>
<script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/power.js"></script>
<script type="text/javascript">$(function(){power_load("${LOGINED_USER.account}","H");})</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
</html>