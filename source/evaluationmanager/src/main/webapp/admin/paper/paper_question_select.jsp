<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组装试卷</title>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="http://localhost:8080/evaluationmanager/css/result.css">
<link rel="stylesheet" type="text/css" href="../../css/admin/paper/paper.css">
<script type="text/javascript" src="http://localhost:8080/evaluationmanager/js/jquery.min.js"></script>
<script type="text/javascript" src="http://localhost:8080/evaluationmanager/js/common/common.js"></script>
<style type="text/css">
.fr{float:right;}
.submit_btn{float:right;cursor: pointer;}
.question_box{width:90%;height:65px;line-height:35px;margin:0 auto; background: #fff;}
.add_question_btn{width:90%;margin:0 auto; margin-top: 15px;}
.options_box{overflow:hidden;}
.option{float:left;width:200px;margin-right:50px;}
.xx{
width:20px;
height:20px;
	position: absolute;
}
.xx span{
 position: relative;
 cursor:pointer;
 top:5px;
 left:985px;
}
.xx a{
 	color:#333;
}
.xx a:hover{
	color:#DA3242;
}
</style>
</head>
<body>
<div class="container">
	<h3>${param.description}
		<span style="margin-right: 150px;"></span>
		${param.startTime}<span style="margin:0 30px;">至</span>${param.endTime}
		<span id="submit_btn" class="fr submit_btn"><a >保存</a></span>
	</h3>
	<div id="question_list">
		
	
	</div>
	<div class="add_question_btn form-group">
		<select id="select_question" class="btn btn-lg btn-primary btn-block">
			<option value="">添加试题</option>
		</select>
	</div>
</div>
</body>
<script type="text/javascript" src="http://localhost:8080/evaluationmanager/js/bootstrap.min.js"></script>
<script type="text/javascript">
var maxQuestionSize = 10;
function add_load_fun() {
	// 随机获取试题
	var random = "${param.random}";
	if(random != null && random != "0") {
		randomGetQuestion(random);
	}
	// 根据试卷编号获取问题信息
	if(param("no") != "") {
		byPaperNoSearch(param("no"));
	}
	// 添加事件
	$("#select_question").change(function(){
		getQuestionByNo($(this).val());
		$(this).val("");
	});
	// 获取试题下拉框
	getQuestionList();
	// 提交试卷
	$("#submit_btn").click(function(){
		var submitData = {
				paper:{
					"type":"${param.type}",
					"description":"${param.description}",
					"startTime":"${param.startTime}",
					"endTime":"${param.endTime}"
					},
				questions:[]
		};
		var question_box = $(".question_box>form");
		var length = question_box.length;
		if(length!=maxQuestionSize) {alert("一张试卷只能是10到题！！！");return;}
		for(var i=0; i<length;i++) {
			submitData.questions[i] = $(question_box[i]).serializeJson();
		} 
		console.log(submitData);
		var submit_data
		var url = "http://localhost:8080/evaluationmanager/admin/paper/add";
		var data = {"data":JSON.stringify(submitData)};
		$.post(url,data,function(data){
			if(data == "1") {
				alert("保存成功");
			} else {
				alert("保存失败");
			}
		});
	});
}
$(document).ready(function(){
	add_load_fun();
});
/**
 * 随机抽取试题信息
 * @param randomSize 随机抽取的试题个数
 */
function randomGetQuestion(randomSize) {
	var url = "http://localhost:8080/evaluationmanager/question/randomSearch";
	var data = {"randomSize":randomSize};
	$.get(url,data,function(resultData){
		var questionArray = eval('('+resultData+')');
		for(var i in questionArray) {
			initQuestion(questionArray[i]);
		}
	});
}
/**
 * 通过试卷编号获取试题业务信息
 */
function byPaperNoSearch(no) {
	var url = "http://localhost:8080/evaluationmanager/question/searchByPaperNo";
	var data = {"data":no};
	$.get(url,data,function(resultData){
		var questionArray = eval('('+resultData+')');
		console.log(questionArray);
		for(var i in questionArray) {
			initQuestion(questionArray[i]);
		}
	});
}
/**
 * 获取试题列表
 */
function getQuestionList() {
	var url = "http://localhost:8080/evaluationmanager/question/getAll";
	$.get(url,{},function(data){
		var questions = eval('('+data+')');
		var initHtml = "";
		for(var i in questions) {
			var question = questions[i];			
			initHtml += "<option value='"+question.questionNo+"'>"+question.question+"</option>";
		}
		$("#select_question").append(initHtml);
	});
}
/**
 * 页面填充试题
 */
function initQuestion(question) {
	var number = $(".question_box").length+1;
	var num = number;
	if(number > maxQuestionSize) {alert("试卷只能有"+maxQuestionSize+"道题！！！");return;}
	var initHtml = "<div class='question_box' id='question_number_"+number+"'><form>";
	initHtml += "<input type='hidden' name='question' value='"+question.question.questionNo+"' />";
	initHtml += "<input type='hidden' name='number' value='"+($(".question_box").length+1)+"'/>";
	initHtml += "<input type='hidden' name='score' value='10'/>";
	initHtml += "<h5><span class='number_box'>"+number+"</span>."+question.question.question+"</h5>";
	initHtml += "<div class='options_box'>";
	initHtml += "<div class='xx'><span onclick='cleanBox(this);' class='glyphicon glyphicon-remove'></span></div>";
	for(var i in question.options) {
		var option = question.options[i];
		initHtml += "<div class='option'><label>"+option.letter+"."+option.option+"</label></div>";
	}
	initHtml += "<div>";
	initHtml += "</form></div>";
	$("#question_list").append(initHtml);
}
/**
 * 通过试题编号，获取试题业务信息
 */
function getQuestionByNo(questionNo) {
	var url = "http://localhost:8080/evaluationmanager/question/getQuestionByNoName";
	var data = {"questionNo":questionNo};
	$.get(url,data,function(data){
		var question = eval('('+data+')');
		initQuestion(question);
	});
}
function cleanBox(node) {
	$(node).parents(".question_box").remove();
	var i = 0;
	$(".number_box").each(function(data,index) {
		$(index).text(++i);
	});
}
</script>
</html>

<!-- 

<div class='question_box'>
			<form>
				<h5>1.教学态度端正，爱岗敬业，治学严谨，认真负责，为人师表，言传身教；课前认真准备，上课认真，按时上下课，及时布置作业批改作业。 </h5>
				<div class='options_box'>
					<div class='option'>
						<label>A.优秀</label>
					</div>
					<div class='option'>
						<label>A.优秀</label>
					</div>
					<div class='option'>
						<label>A.优秀</label>
					</div>
					<div class='option'>
						<label>A.优秀</label>
					</div>
				</div>
			</form>
		</div>
 -->