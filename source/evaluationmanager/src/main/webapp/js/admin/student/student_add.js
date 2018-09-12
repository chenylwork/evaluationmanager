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
		//验证学号
		if($(this).is('#account')){
			if(this.value==""){
				var errorMsg='学号不能为空';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		//验证密码
		if($(this).is('#password')){
			if(this.value==""){
				var errorMsg='请输入正确的密码';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
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
		//验证身份证
		if($(this).is('#ID')){
			if(this.value==""|| this.value.length!=18){
				var errorMsg='请输入正确的身份证';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		//验证专业
		if($(this).is('#major')){
			if(this.value==""||this.value==-1){
				var errorMsg='请输入正确的专业';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		//验证班级
		if($(this).is('#classes')){
			if(this.value==""||this.value==-1){
				var errorMsg='请输入正确的班级';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		//验证时间
		if($(this).is('#time')){
			if(this.value==""){
				var errorMsg='请输入正确的时间';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		//验证状态
		if($(this).is('#state')){
			if(this.value==""||this.value==-1){
				var errorMsg='请输入正确的状态';
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
	
	