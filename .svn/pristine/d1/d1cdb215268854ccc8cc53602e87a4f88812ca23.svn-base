/**
 * 查询用户集合
 * @param paginNo 页码
 * @param display 一页的最大记录数$("#user.name").val()
 */
function getUserList(paginNo,display){
	var userList;
	var userName="";
	var userSex="";
	var userRole="";
	if (getQueryVariable('role')==false) {
		userRole="";
	}else{
		userRole=getQueryVariable('role');
	}
	if (getQueryVariable('name')==false) {
		userName="";
	}else{
		userName=getQueryVariable('name');
		$("#userName").val(userName);
	}
	if (getQueryVariable('sex')==false) {
		userSex="";
	}else{
		userSex=getQueryVariable('sex');
		$("#userSex").val(userSex);
	}
	console.log(userName);
	console.log(userSex);
	console.log(userRole);
//	console.log(getQueryVariable('role'));
//	console.log(getQueryVariable('name'));
//	console.log(getQueryVariable('sex'));
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/admin/user/search",
		data:{"paginMap.pageNo":paginNo,"paginMap.display":display,"user.role":userRole,"user.name":userName,"user.sex":userSex},
		type:"post",
		async:false,
		success:function(data){
			userList = data;
		}
	})
	return userList;
}

function initUserList(paginNo,display){
	$(".user_row").remove();
	var data=eval('('+getUserList(paginNo, display)+')');
	//console.log(data);
	var pagin=data.pagin;
	Page({
		num:pagin.pages,		//页码数
		startnum:pagin.pageNo,	//指定页码
		elem:$('#page2'),		//指定的元素
		callback:function(n){	//回调函数console.log(n);
			initUserList(n,display);
		}
	});
	for(var i in data.users) {
		initUser(data.users[i]);
	}
	$("#user_size").remove();
	var initHtml = " <span class='x-right' id='user_size' style='line-height:40px'>共有数据："+data.pagin.count+" 条</span>";
	$("#user_sizebox").append(initHtml);
	console.log(data.pagin.count);
	
}
//frame
function initUser(user){
	var initHtml="<tr class='user_row'><td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div></td>";
	 initHtml+="<td>"+user.account+"</td>";
	 initHtml+="<td>"+user.name+"</td>";
	 initHtml+="<td>"+user.sex.name+"</td>";
	 initHtml+="<td>"+user.age+"</td>";
	 initHtml+="<td>"+user.role.name+"</td>";
	 initHtml+="<td>";
	 //initHtml+="<a href='http://localhost:8080/evaluationmanager/admin/user/user_details.jsp?id="+user.id+" ' target='_blank'>详情</a>";
	 
	 initHtml+="<a onclick=\"x_admin_show('详情','http://localhost:8080/evaluationmanager/admin/user/user_details.jsp?id="+user.id+"')\" href='javascript:;' target='frame'>详情</a>";
	 initHtml+="&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/admin/user/resetPwd?account="+user.account+" ' onclick=\"return getparam('确定将密码重置为123456？')\" target='frame'>重置密码</a>";
	 initHtml+="&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/admin/user/user_update.jsp?id="+user.id+" '>修改</a>";
     initHtml+="</td></tr>";
     $("#userAll").append(initHtml);
}
function getparam(data){
	var state = confirm(data);
	if(state) {
		return true;
	} else {
		return false;
	}
}

//页面加载执行，接收json串
function getRole(){
	  var roles;
	  $.ajax({
		 url:"http://localhost:8080/evaluationmanager/admin/role/getAllRole",
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
	var data=eval('('+getRole()+')');
	var initHtml = "<option value=''>请选择角色类型</option>";
	$("#userRole").append(initHtml);
	//遍历json对象
	for(var i in data) {
		initRole(data[i]);
	}
}
//添加信息
function initRole(role) {
	//alert(getQueryVariable('role'));
	if (getQueryVariable('role')==role.no) {
	 var initHtml = "<option value="+role.no+" selected >"+role.name+"</option>";
	}else{
	var initHtml = "<option value="+role.no+">"+role.name+"</option>";
	}
	$("#userRole").append(initHtml);
}
function getQueryVariable(variable)
{
       var query = window.location.search.substring(1);
       var vars = query.split("&");
       for (var i=0;i<vars.length;i++) {
               var pair = vars[i].split("=");
               if(pair[0] == variable){return decodeURI(pair[1]);}
       }
       return(false);
}

$("#search").click(function(){
	initUserList(1,10);
	initRoles();
 });

$(function(){
	initUserList(1,10);
	initRoles();
})