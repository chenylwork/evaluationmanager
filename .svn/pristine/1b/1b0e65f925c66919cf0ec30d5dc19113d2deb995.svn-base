function getClassList(paginNo,display) {
	    	var ClassList;
	    	var classMajor="";
	    	var className="";
	    	
	    	if (getQueryVariable('major')==false) {
	    		classMajor="";
	    	}else{
	    		classMajor=getQueryVariable('major');
	    	}
	    	if (getQueryVariable('name')==false) {
	    		className="";
	    	}else{
	    		className=getQueryVariable('name');
	    		$("#className").val(className);
	    	}
	    	$.ajax({
	    		url:"http://localhost:8080/evaluationmanager/admin/class/search",
	    		data:{"paginMap.pageNo":paginNo,"paginMap.display":display,"classes.name":className,"classes.major":classMajor},
	    		type:"post",
	    		async:false,
	    		success:function(data){
	    			ClassList = data;
	    		}
	    	});
	    	return ClassList;
	    }
	    function initClassList(paginNo,display){
	    	$(".class_row").remove();
	    	var data=eval('('+getClassList(paginNo,display)+')');
	    	var pagin=data.pagin;
	    	Page({
	    		num:pagin.pages,		//页码数
	    		startnum:pagin.pageNo,	//指定页码
	    		elem:$('#page2'),		//指定的元素
	    		callback:function(n){	//回调函数
	    			console.log(n);
	    			initClassList(n,display);
	    		}
	    	});
	    	
	    	for(var i in data.classes) {
        		initClass(data.classes[i]);
        	}
	    	
	    	$("#class_size").remove();
	    	var initHtml = " <span class='x-right' id='class_size' style='line-height:40px'>共有数据："+data.pagin.count+" 条</span>";
	    	$("#class_sizebox").append(initHtml);
	    }
	    function initClass(classes){
	    	var userRole=$("#userRole").val();
	    	var initHtml = "<tr class='class_row' id='"+classes.id+"'><td>";
	    	//initHtml+="<div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i>";
	    	initHtml+="<input type='checkbox' value='"+classes.classNo+"' name='batchID'/>";
	    	initHtml+="</div></td>";
	    	initHtml+="<td>"+classes.classNo+"</td>";
	    	initHtml+="<td>"+classes.name+"</td>";
	    	initHtml+="<td>"+classes.major.name+"</td>";
	    	if (userRole=="0001") {
		    	initHtml+="<td>";
		    	initHtml+="<a onclick=\"x_admin_show('详情','http://localhost:8080/evaluationmanager/admin/class/class_details.jsp?classNo="+classes.classNo+"')\" href='javascript:;' target='frame'>详情</a>";
		    	//initHtml+="<a href='http://localhost:8080/evaluationmanager/admin/class/class_details.jsp?classNo="+classes.classNo+"' target='frame'>详情</a>";
		    	initHtml+="&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/admin/class/delete?batchID="+classes.classNo+"' oncilck='' >删除</a>";
		    	initHtml+="&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/admin/class/class_update.jsp?id="+classes.id+"'>修改</a>";
		    	initHtml+="</td>";
	    	}
	    	initHtml+="</tr>";
	    	$("#classAll").append(initHtml);
	    }
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
	    	$("#classMajor").empty();
	    	var data=eval('('+getMajorList()+')');
	    	var initHtml = "<option value=''>请选择班级专业</option>";
	    	$("#classMajor").append(initHtml);
	    	for(var i in data.majors) {
	    		initMajor(data.majors[i]);
        	}
	    	
	    }
	    function initMajor(major){
	    	if (getQueryVariable('major')==major.majorNo) {
	    		var initHtml = "<option value='"+major.majorNo+"'selected>"+major.name+"</option>";
			}else{
				var initHtml = "<option value='"+major.majorNo+"'>"+major.name+"</option>";
			}
	    	$("#classMajor").append(initHtml);
	    }
	    
	    $("#search").click(function(){
	    	initUserList(1,10);
	    	initMajorList();
	     });
	    
	    $(function(){
	    	initClassList(1,10);
	    	initMajorList();
	    })
	 //从地址栏获取参数   
     function getQueryVariable(variable){
       var query = window.location.search.substring(1);
       var vars = query.split("&");
       for (var i=0;i<vars.length;i++) {
               var pair = vars[i].split("=");
               if(pair[0] == variable){return decodeURI(pair[1]);}
       }
       return(false);
     }
//  //批量删除
	 $("#delete").click(function(){
	    $("form").submit();
//		 alert("adad");
//		 var batchID="";
//		 $('input[name="batchID"]:checked').each(function(){
//			 batchID+=$(this).val();
//		 });
//		 if (batchID!="") {
//		     $.ajax({
//		    	 url:"http://localhost:8080/evaluationmanager/admin/class/delete",
//		    		data:{"batchID":batchID},
//		    		type:"post",
//		    		async:false,
//		    		success:function(data){
//		    			alert(data);
//		    		}
//		    	});	
//		} 
	 });   
	    