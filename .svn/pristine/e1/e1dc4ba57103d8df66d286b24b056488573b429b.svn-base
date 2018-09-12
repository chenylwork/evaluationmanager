
    //非空验证
	$(function(){
	//如果是必填的，则加红星表标识
	$("form :input.required").each(function() {
        var $required=$("<strong class='high'>*</strong>");//创建元素
		$(this).parent().append($required);//然后将它追加到文档中
    });
	//文本框失去焦点

	$('form :input').blur(function(){
		var $parent=$(this).parent();
		$parent.find(".formtips").remove();
		if($(this).is('#classNo')){
			if(this.value==""){
				var errorMsg='班级编号不能为空';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else if(this.value.length!=7){
				var errorMsg='请输入正确的7位班级编号';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
				}else{
					var rename="";
					$.ajax({
						url:"http://localhost:8080/evaluationmanager/admin/class/renameClassbyNo",
			    		data:{"classNo":$("#classNo").val()},
			    		async:false,//取消异步
			    		success:function(data){
			    			rename = data;
			    			console.log(rename);	
			    		}	
					});
					if (rename=="1") {
						var errorMsg='已经存在该班级编号';
						$("#liNo").append('<span class="formtips onError">'+errorMsg+'</span>');
					}else{
						var okMsg='输入正确';
						$("#liNo").append('<span class="formtips onSuccess">'+okMsg+'</span>');
					}
				}
			}
				
			if($(this).is('#name')){
				if(this.value==""){
					var errorMsg='请输入正确的班级名称';
					$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
				}else{
					var okMsg='输入正确';
					$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
			}
			
			if($(this).is('#major')){
			if(this.value==""){
				var errorMsg='请输入正确的专业';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
				
     	}).keyup(function(){
			$(this).triggerHandler("blur");
		}).focus(function(){
			$(this).triggerHandler("blur");
		});
			
	//提交
		$('#zxc').click(function(){
			$("form :input.required").trigger('blur');
			var numError=$('form.onError').length;
			if(numError){
				return false;
			}
		if(($(".onError").length)>0){
				console.log($(".onSuccess").length);
			} else{
				$("form").submit();
			}
			});
		})
	    
	    //ajax 页面加载完执行
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
	    	$("#major").empty();
	    	var data=eval('('+getMajorList()+')');
	    	var initHtml = "<option value=''>请选择</option>";
	    	$("#major").append(initHtml);
	    	for(var i in data.majors) {
	    		initMajor(data.majors[i]);
        	}
	    	
	    }
	    function initMajor(major){
	    	var initHtml = "<option value='"+major.majorNo+"'>"+major.name+"</option>";
	    	$("#major").append(initHtml);
	    }
	    $(function(){
	    	initMajorList();
	    })
/*****************************************/
	    
	    
	    