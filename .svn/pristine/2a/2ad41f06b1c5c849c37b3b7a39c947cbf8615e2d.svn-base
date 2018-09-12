<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评教登陆界面</title>
     <!-- 网页左侧小图标 -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
	<!--验证码插件-->
	<style type="text/css">
	    *{
        margin: 0 auto;
    }
    .verify{
        width: 500px;
        height: 40px;
        margin-top:5px;
    }
    .verify span{
        font-family: ﻿MicrosoftYaHei;
        font-size: 14px;
        font-weight: normal;
        font-style: normal;
        font-stretch: normal;
        line-height: 25px;
        letter-spacing: 0px;
        color: #302f41;
        margin-right: 23px;
    }
    #verify_box{
        width: 200px;
        height: 25px;
        text-align: center;
        line-height:25px;
        font-size: 14px;
        color:#fff;
        position: relative;
        background-color: rgba(212, 212, 212, 1);
        top:-25px;
        left:-80px;
    }
    #verify_xbox{
        width: 30px;
        height: 25px;
        text-align: center;
        line-height: 25px;
        font-size: 14px;
        color:#fff;
        position: absolute;
        background: #7BBB55;
    }
    #btn{
        cursor: pointer;
        width: 30px;
        height: 25px;
        background-color: rgba(255, 255, 255, 1);
        border: solid 1px rgba(212, 212, 212, 1);
        float: right;
    }
    .continue{
        width: 120px;
        height: 40px;
        background-color: rgba(212, 212, 212, 1);
        margin: 0 70px;
        border: none;
        color: #302f41;
        font-size: 16px;
    }
    .continue:hover{
        background-color: rgba(235, 54, 38, 1);
        color: #ffffff;
    }
    #btn img {
        max-width: 100%;
        padding-top:5px;
    }
	</style>
	
	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/yzm/jquery.idcode.css" />
		<script src="${pageContext.request.contextPath}/yzm/jquery.idcode.js"></script>
	<script type="text/javascript">
	       //页面加载执行，接收json串
          function getAllrole(){
        	  var roles;
        	  $.ajax({
        		 url:"http://localhost:8080/evaluationmanager/admin/role/getAllLogin",
        		 data:{},
  	    		 async:false,
  	    		 success:function(data){
  	    			roles=data;
  	    			console.log(roles);
  	    		}
  	    	});
  	    	 return roles;
          }
	    //初始化下拉框，将json串转成json对象 
        function initRoles(){
        	var data=eval('('+getAllrole()+')');
        	console.log(data);
        	var initHtml = "<option value='-1'>请选择</option>";
    		$("#role").append(initHtml);
    		//遍历json对象
        	for(var i in data) {
        		initRole(data[i]);
        	}
        }
	    //添加信息
        function initRole(role) {
        	var initHtml = "<option value="+role.codeNo+">"+role.name+"</option>";
        	$("#role").append(initHtml);
        }  
          $(function(){
        	  initRoles();
  	    })
	</script>
    <script type="text/javascript">
	  var message="${message}";
	  if(message!=""){
		  alert(message);
	  }
	</script> 
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
</head>
<body>
<div class="height">
	<div class="top">
		<div class="left">
			<img src="${pageContext.request.contextPath}/images/logo1.png">
		</div>
		<div class="right">
			<img src="${pageContext.request.contextPath}/images/text.png">
		</div>
	</div>
	<div class="tu">
		<img src="${pageContext.request.contextPath}/images/banner.gif">
	</div>

	<div class="dl" id="zz">
	<form action="${pageContext.request.contextPath}/admin/user/login" method="post">
		<ul>
			<li>
				<span class="glyphicon glyphicon-book"></span>
				身&nbsp;&nbsp;&nbsp;份:&nbsp;&nbsp;
				<select class="select" name="role" id="role" style="color:#999;">
				</select>
			</li>
			<li class="user">
				<span class="glyphicon glyphicon-user"></span>
				用户名:&nbsp;&nbsp;
				<input type="text" name="account" class="required" placeholder="请输入你的用户名" id="account">
			</li>
			<li class="pass">
				<span class="glyphicon glyphicon-lock"></span>
				密&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;
				<input type="password" name="password" class="required" placeholder="请输入你的密码" id="password">
				<!--&nbsp;&nbsp; <a href="" style="font-size:12px;color:#999;">忘记密码?</a>-->
			</li>
			<li style="width:500px;">
			<span class="glyphicon glyphicon-send"></span>
			<!--  <span class="glyphicon glyphicon-send"></span>
				<label class="lblVerification" style="font-weight:500;">验证码:</label>&nbsp;&nbsp;
				<input type="text" name="yz" id="Txtidcode" class="required" placeholder="请输入你的验证码" />
				<span id="idcode"></span>
				<script>
				$.idcode.setCode();
				var IsBy = $.idcode.validateCode(); 
				</script>-->
			
				
				    验&nbsp;&nbsp;证:
			    <div id="verify_box">
			        <div id="verify_xbox">
			            <div id="btn">
			                <img src="${pageContext.request.contextPath}/images/lllllll.png"/>
			            </div>
			        </div>
			        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;按住滑块，拖动到最右边
			    </div>
   			
			</li>
			<li class="deng">
			
				<input type="button" name="" value="登陆" id="submitBtn" style="">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" name="" value="忘记密码">
				&nbsp;&nbsp;
				<a href="" style="color:#666;font-size:12px;font-weight:500;">忘记密码？</a>
			</li>
		</ul>
	
	</form>
	</div>
</div>
<div class="footer">
 Copyright © 2004-2017 评教登陆（le.com）All rights reserved.<br>
电话:0575 - 66611168   0371 - 56565656 <br>
地址:河北省 石家庄市 石家庄职业技术学院 技术支持:吉利信息
</div>

</body>
     <script type="text/javascript">
     var box=document.getElementById('verify_box');
     var xbox=document.getElementById('verify_xbox');
     var element=document.getElementById('btn');
     var b=box.offsetWidth;
     var o=element.offsetWidth;
     var isOk=false;
     element.ondragstart = function() {
         return false;
     };
     element.onselectstart = function() {
         return false;
     };
     element.onmousedown = function(e) {
         var disX = e.clientX - element.offsetLeft;
         document.onmousemove = function (e) {
             var l = e.clientX - disX +o;
             if(l<o){
                 l=o
             }
             if(l>b){
                 l=b
             }
             xbox.style.width = l + 'px';
         };
         document.onmouseup = function (e){
             var l = e.clientX - disX +o;
             if(l<b){
                 l=o
             }else{
                 l=b;isOk=true;
                 xbox.innerHTML='验证通过<div id="btn"><img style="margin-top:-4px" src="${pageContext.request.contextPath}/images/kkkk.png"/></div>';
             }
             xbox.style.width = l + 'px';
             document.onmousemove = null;
             document.onmouseup = null;
         };
     }
     
     </script>
	<!-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/slide.js"></script> -->
</html>