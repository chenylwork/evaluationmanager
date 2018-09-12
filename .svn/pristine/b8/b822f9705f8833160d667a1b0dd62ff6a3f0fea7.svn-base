/**
 * 
 */
$(function(){
	initQuestions();
	$("#search_btn").click(function(){
		// 填充页面信息
		initQuestions();
	});
});
/**
 * 获取试题信息
 * @returns
 */
function getData() {
	var result = "";
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/question/search",
		data:$("#search_form").serialize(),//{"pagin.pageNo":paginNo,"pagin.display":display},
		type:"post",
		async:false,
		success:function(data) {
			result = data;
		}
	});
	return result;
}
/**
 * 
 * @returns
 */
function initQuestions() {
	console.log($("#search_form").serialize());
	$(".question_row").remove();
	var pagin = eval('('+getData()+')');
	Page({
		num:pagin.pages,		//页码数
		startnum:pagin.pageNo,				//指定页码
		elem:$('#page2'),		//指定的元素
		callback:function(n){	//回调函数
			$(".pagin_paginNo").val(n);
			initQuestions();
		}
	});
	$("#dataSize").text(pagin.count);
	var questions = pagin.data;
	for(var i in questions) {
		initQuestion(questions[i]);
	}
	// 重置分页信息
	$(".pagin_display").val(pagin.display);
	$(".pagin_paginNo").val(1);
}
function initQuestion(question) {
	var initHtml = "<tr class='question_row'><td>";
	initHtml += "<div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>";
	initHtml += "</td>";
	initHtml += "<td>"+question.questionNo+"</td>";
	initHtml += "<td>"+question.question+"</td>";
	initHtml += "<td>";

	initHtml+="<a onclick=\"x_admin_show('详情','http://localhost:8080/evaluationmanager/admin/question/questionInfo.html?no="+question.questionNo+"')\" >详情</a>";
	initHtml += "&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/quesion/delete?no="+question.questionNo+"'>删除</a>";
	initHtml += "&nbsp;&nbsp;<a href='http://localhost:8080/evaluationmanager/admin/question/questionInfo.html?no="+question.questionNo+"'>修改</a>";
	initHtml += "</td></tr>";
	$("#question_box").append(initHtml);
}