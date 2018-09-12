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
		
		if($(this).is('#codeNo')){
			if(this.value==""){
				var errorMsg='系别编号不能为空';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		if($(this).is('#name')){
			if(this.value==""){
				var errorMsg='请输入系别';
				$parent.append('<span class="formtips onError">'+errorMsg+'</span>');
			}else{
				var okMsg='输入正确';
				$parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
				}
				}
		
		if($(this).is('#des')){
			if(this.value==""){
				var errorMsg='描述信息不能为空';
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