<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组装试卷</title>
	<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
	<link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
</head>
<body>
	<div class="container" style="margin-top:50px;">
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
				<div class="col-md-6 column">
					<form role="form" method="post" id="paper_form" action="http://localhost:8080/evaluationmanager/admin/paper/paper_question_select.jsp">
						<input type="hidden" name="random" id="random_hid" value="0"/>
						<div class="form-group">
							 <label >试卷类型：</label>
							 <select class="form-control" name="type" id="paper_type_select">
							 	<option value="">请选择</option>
							 </select>
						</div>
						<div class="form-group">
							 
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">	
										  <div class="form-group">    
										  	<label for="name">测试开始时间</label> 
										    <input type="text" class="form-control" name="startTime" id="startTime"  autocomplete="off" placeholder="请输入开始时间">
										  </div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">	
										  <div class="form-group">    
										  	<label for="name">测试结束时间</label> 
										    <input type="text" class="form-control" name="endTime" id="endTime"  autocomplete="off" placeholder="请输入结束时间">
										  </div>
									</div>
								</div>
						</div>
						<div class="form-group">
							 <label>试卷描述：</label>
							 <textarea class="form-control" name="description" id="description"></textarea>
						</div>
						<div class="form-group">
							<button id="random_btn" class="btn btn-lg btn-primary btn-block" type="button">随机组装</button>
							<br/>
							<button id="custom_btn" class="btn btn-lg btn-primary btn-block" type="button">自定义组装</button>
						</div>
					</form>
				</div>
			<div class="col-md-3 column"></div>
		</div>
	</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	getPaperType();
})
// 随机选题
$("#random_btn").click(function(){
	if(paper_check() == 1) {
		// 设置随机出题个数
		$("#random_hid").val(10);
		$("#paper_form").submit();
	};
});
$("#custom_btn").click(function(){
	if(paper_check() == 1) {
		$("#paper_form").submit();
	};
});
/**
 * 获取试卷类型
 */
function getPaperType() {
	var url = "http://localhost:8080/evaluationmanager/admin/paper/paperType";
	$.get(url,{},function(data) {
		var typeArray = eval('('+data+')');
		initPaperType(typeArray)
	});
}
/**
 * 填充试卷类型
 */
function initPaperType(data) {
	var initHtml = "";
	for(var i in data) {
		var type = data[i];
		initHtml += "<option value='"+type.codeNo+"'>"+type.name+"</option>";
	}
	$("#paper_type_select").append(initHtml);
}
function paper_check() {
	var description = $("#description").val();
	var paper_type = $("#paper_type_select").val();
	var startTime = $("#startTime").val();
	var endTime = $("#endTime").val();
	if(paper_type == "") {
		alert("请选择试卷类型！！！");
		return;
	}
	if(startTime == "") {
		alert("请选择测评开始时间");
		return;
	}
	if(endTime == "") {
		alert("请选择测评结束时间");
		return;
	}
	if(description == "") {
		alert("请填写描述信息！！！");
		return;
	}
		
	return 1;
}
layui.use('laydate', function(){
    var laydate = layui.laydate;
    //执行一个laydate实例
    laydate.render({
      elem: '#startTime' //指定元素
    });

    //执行一个laydate实例
    laydate.render({
      elem: '#endTime' //指定元素
    });
  });
</script>
</html>