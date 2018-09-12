<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评教</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<style type="text/css">
*{
	margin: 0 auto;
	padding: 0;
}
body{
    font-size:12px;
    font-family:宋体;
	background: #F8F8F8;
}
.error{color: red;}
.t1{
	width: 1000px;
	padding: 5px;
}
.tt{
	width:100%;
	height:100px;
	padding-left:10px;
	border:1px solid;
	border-radius:6px;
	background:#fff;
	margin-top:10px;
}
.zz{
	width: 1000px;
	margin-top:15px;
	float: left;
	text-align: right;
} 
h3{
	font-weight:bold;
}
h5{
	font-size: 12px;
}
h4{
padding-left:30px;
font-weight:bold;
font-family:微软雅黑;
}
.btn1{
	width:50px;
	height:30px;
	background-color:#81ACFB;
	color:#FFFFFF;
	border-radius:5px;
	font-size:12px;
	font-weight:bold;
	border:1px solid;
}
ul li {
 	width:25%;
 	height:30px;
 	padding-top:5px;
 	float:left;
 	list-style:none;
}
</style>
<script type="text/javascript">
var number = ["一","二","三","四","五","六","七","八","九","十",
              "十一","十二","十三","十四","十五","十六","十七","十八","十九","二十"];
</script>
</head>
<body>
<form action="<%=request.getContextPath()%>/admin/evaluation/add" method="post" id="evaluation_form">
	<input name="paper" type="hidden" value="${paperTeacher.paperNo}" />
	<input name="teacher" type="hidden" value="${paperTeacher.teacherNo}" />
	<input name="user" type="hidden" value="${LOGINED_USER.account}" />
	<input name="score" type="hidden" id="hidden_score" value="0" />
	<input name="options" type="hidden" id="hidden_options" value="0" />
 <div class="t1">
	<h3> 
		${paperTeacher.paperTypeName}评估[学年学期:2017-2018]&nbsp;
		[评估时间：${paperTeacher.startTime}至${paperTeacher.endTime}]
	</h3>
	<span>
		测评人：${LOGINED_USER.name}&nbsp;&nbsp;&nbsp;
		类别：${paperTeacher.paperTypeName}&nbsp;&nbsp;&nbsp;
		教师：${paperTeacher.teacherName}&nbsp;&nbsp;&nbsp;
		总分：<span class="paper_score"></span>
	</span>
	
	<c:forEach var="i" step="1" begin="0" end="${fn:length(paperViewList) -1}" >
		<c:if test="${paperViewList[i].letter == 'A'}">
			<div class="tt" data-question="${paperViewList[i].questionNo}" data-letter="">
				<h4 class="quesstion_title">
				第
				<script>document.write(number[parseInt("${paperViewList[i].number}")-1])</script>
				题</h4>
				<span>${paperViewList[i].number}.${paperViewList[i].questionInfo}</span>
				<br>
				<ul>
		</c:if>
		<li>
			<input type="radio" name="rad${paperViewList[i].number}" 
			class="option_radio" data-name="rad${paperViewList[i].number}"
			data-option="${paperViewList[i].optionNo}" data-sum="0" data-score="${paperViewList[i].score}"  data-ratio="${paperViewList[i].ratio}" data-letter="${paperViewList[i].letter}">
			&nbsp;&nbsp;${paperViewList[i].letter}.${paperViewList[i].optionInfo }
		</li>
		<c:if test="${paperViewList[i].letter == 'D'}">
				</ul>
				</div>
		</c:if>
	</c:forEach>
	<div class="zz" style="float:left;">
		<input type="button" value="提交" id="evaluation_submit_btn" class="btn1" >&nbsp;&nbsp;&nbsp;&nbsp;
	</div>
 </div>
</form>
<script type="text/javascript">
	$(".option_radio").click(function() {
		var score = parseInt($(this).data("score"));
		var ratio = parseInt($(this).data("ratio"));
		var letter = $(this).data("letter");
		var sum = score*ratio/100;
		$(this).parents(".tt").addClass("question_box").attr({"data-letter":letter}).data("sum",sum);
	});
	/*提交表单按钮事件*/
	$("#evaluation_submit_btn").click(function() {
		check();
		if($(".question_box").length < 10) {
			alert("请答完试卷！！");
			return;
		}
		// 总分计算,选项汇总
		var score = 0;
		var options = "";
		$(".question_box").each(function(index,node){
			score += parseInt($(this).data("sum"));
			options += $(this).data("letter");
		});
		$("#hidden_score").val(score);
		$(".paper_score").text(score);
		$("#hidden_options").val(options);
		if(confirm("总分"+score+"确定提交吗？")) {
			submit_evaluation_form();
		}
	});
	/**
	 * 试卷选项验证 
	 */
	function check() {
		$(".quesstion_title").removeClass("error");
		$(".tt").each(function(){
			if(!$(this).hasClass("question_box")) {
				$(this).find(".quesstion_title").addClass("error");
			}
		});
	}
	/*提交表单*/
	function submit_evaluation_form() {
		$(".option_radio").removeAttr("name");
		console.log($("#evaluation_form").attr("action"));
		$.ajax({
			url : $("#evaluation_form").attr("action"),
			data: $("#evaluation_form").serialize(),
			type: "post",
			success:function(data) {
				if(data == "1") {
					alert("提交成功!!总分"+$("#hidden_score").val());
					$("#evaluation_submit_btn").remove();
				} else {
					alert(data);
				}
			},
			error : function(){
				alert("服务器维护中！！！");
			}
		});
		add_ratio_name();
	}
	// 添加单选按钮name属相值
	function add_ratio_name() {
		$(".option_radio").each(function(index,node){
			$(node).attr("name",$(this).data("name"));
		});
	}
</script>
</body>
</html>

