<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
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
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe705;</i>
                    <cite>院系管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/department/dept_add.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加院系</cite>
                        </a>
                    </li >
                       <li>
                        <a _href="${pageContext.request.contextPath}/admin/department/paginAll?pagin.pageNo=1&pagin.display=5">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询院系</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6fb;</i>
                    <cite>专业管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
               <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/major/allDept">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加专业</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/major/pagin?paginMap.pageNo=1&paginMap.display=10">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查看专业</cite>
                        </a>
                    </li >
                </ul>
            </li>
			<li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe70c;</i>
                    <cite>班级管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/class/class_add.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加班级</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/class/class_list.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询班级</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6f5;</i>
                    <cite>教师管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/teacher/selectType">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加教师</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/teacher/select?paginMap.pageNo=1&paginMap.display=10">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询教师信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>学生管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/student/selectType">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加学生</cite>  
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/student/paginAll?paginMap.pageNo=1&paginMap.display=5">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询学生信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>用户管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/user/user_list.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询用户</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe74e;</i>
                    <cite>评教管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                	<li>
                        <a _href="${pageContext.request.contextPath}/admin/evaluation/paginAll?paginMap.pageNo=1&paginMap.display=5">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>评教数据信息</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/evaluation/cartogram">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>评教数据统计</cite>
                        </a>
                    </li >
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6fc;</i>
                    <cite>试题管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="question/questionInfo.html">
                        
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加试题</cite>
                        </a>
                    </li >
                     <li>
                        <a _href="question/question.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>试题列表</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6fc;</i>
                    <cite>试卷管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="paper/paper_form.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>组装试卷</cite>
                        </a>
                    </li >
                     <li>
                        <a _href="paper/showPaper?paginMap.pageNo=1&paginMap.display=10">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>试卷列表</cite>
                        </a>
                    </li >
                     <!-- <li>
                        <a _href="http://localhost:8080/evaluationmanager/admin/paper/doAppoint">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>分配试卷</cite>
                        </a>
                    </li > -->
                </ul>
            </li>
            
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ba;</i>
                    <cite>角色管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/role/selectType">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加角色</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/role/getRole">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询角色信息</cite>         
                        </a>
                    </li>
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6fc;</i>
                    <cite>权限管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="power/getAllRole">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>角色权限</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="power/getAllUser?paginMap.pageNo=1&paginMap.display=10">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>用户权限</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
             
         
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe69e;</i>
                    <cite>日志管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                 <li>
                        <a _href="${pageContext.request.contextPath}/admin/log/pagin?paginMap.pageNo=1&paginMap.display=10">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询登录日志</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/olog/pagin?paginMap.pageNo=1&paginMap.display=5">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询操作日志</cite>
                        </a>
                    </li >
                </ul>
            </li>
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ab;</i>
                    <cite>数据管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/admin/data/DataBackup.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>查询数据</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe724;</i>
                    <cite>共用页面</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="../common/excelImport.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>excel导入</cite>
                        </a>
                    </li>
                </ul>
            </li>
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
                <iframe src='${pageContext.request.contextPath}/admin/welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
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
</html>