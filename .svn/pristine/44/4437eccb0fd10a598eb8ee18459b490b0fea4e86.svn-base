//日历插件代码
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
    //全选和全不选js方法,点击全选
		function selectAll(){
			//获得名称为“id”的checkbox对象的结合
			var allCheck=document.getElementsByName("batchID");
			//实现全选/全部选的效果
			for(var i=0;i<allCheck.length;i++){
				allCheck[i].checked=!allCheck[i].checked;
			}
		}