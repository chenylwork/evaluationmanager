layui.use('laydate', function(){
        var laydate = layui.laydate;
      
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });
     
	function selectAll(){
		  var allCheck=document.getElementsByName("batchID");
			for(var i=0;i<allCheck.length;i++){
				allCheck[i].checked=!allCheck[i].checked;
			}
	  }
	$(function(){
		$('#batchBtn').click(function(){
			$("form").submit();
		});
	})
	