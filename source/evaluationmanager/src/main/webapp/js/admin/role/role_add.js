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
		if($(this).is('#no')){
			if(this.value==""){
				var errorMsg='请输入正确的编号';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		if($(this).is('#type')){
			if(this.value==""||this.value==-1){
				var errorMsg='请输入正确的角色类型';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		if($(this).is('#name')){
			if(this.value==""){
				var errorMsg='请输入正确的角色名称';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		if($(this).is('#description')){
			if(this.value==""){
				var errorMsg='请输入正确的描述信息';
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