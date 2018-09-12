$(function(){
	//如果是必填的，则加红星表标识
	$("form :input.required").each(function() {
        var $required=$("<strong class='high'>*</strong>");//创建元素
		$(this).parent().append($required);//然后将它追加到文档中
    });
	//文本框失去焦点后
	$('form :input').blur(function(){
		var $parent=$(this).parent();
		$parent.find(".formtips").remove();
		
		//验证姓名
		if($(this).is('#name')){
			if(this.value==""){
				var errorMsg='姓名不能为空';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证性别
		if($(this).is('#sex')){
			if(this.value==""||this.value==-1){
				var errorMsg='性别输入不正确';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
			var okMsg='输入正确';
			$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证年龄
		if($(this).is('#age')){
			if(this.value==""){
				var errorMsg='年龄不能为空';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}

		//验证密码
		if($(this).is('#password')){
			if(this.value==""|| this.value.length!=6){
				var errorMsg='请输入正确的密码.';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证身份证
		if($(this).is('#pid')){
			if(this.value==""|| this.value.length!=18){
				var errorMsg='请输入正确的身份证.';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证工号
		if($(this).is('#teacherNo')){
			if(this.value==""){
				var errorMsg='工号不能为空.';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证职位
		if($(this).is('#role')){
			if(this.value==""||this.value==-1){
				var errorMsg='职位输入不正确';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证专业
		if($(this).is('#major')){
			if(this.value==""||this.value==-1){
				var errorMsg='所属专业输入不正确';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证课程
		if($(this).is('#course')){
			if(this.value==""||this.value==-1){
				var errorMsg='课程输入不正确';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
			}
		}
		//验证教师状态
		if($(this).is('#state')){
			if(this.value==""||this.value==-1){
				var errorMsg='教师状态输入不正确';
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
