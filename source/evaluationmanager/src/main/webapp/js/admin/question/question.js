/**
 * 
 */
$(function(){
	// 初始化问题信息
	initQuestionInfo();
	// 提交按钮添加事件
	$("#submit_btn").click(function(){submit_btn_fun();});
});
/**
 * 初始化问题信息
 * @param questionNo 问题编号
 * @returns
 */
function initQuestionInfo() {
	var optionSize = 4;
	// 获取地址栏问题编号
	var questionNo = param("no");
	// 获取问题数据信息
	if(questionNo != "") {
		// 编号存入表单隐藏域
		$("#questionNo").val(questionNo);
		// 获取试题信息
		var dataChar = getQuestionInfo(questionNo);
		var data = eval('('+dataChar+')'); // 试题信息
		console.log(data);
		// 填充到页面
		pageInitQuestionInfo(data);
		optionSize = data.options.length;
	} else {
		// 填充4个选项
		initOptions(4);
	}
	$("#options_box").attr("data-option-selected",optionSize)
	.attr("data-ratio-selected",optionSize);
}
/**
 * 获取问题后台信息
 * @param questionNo 问题编号
 * @returns
 */
function getQuestionInfo(questionNo) {
	var result = "";
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/question/searchByNo",
		type:"get",
		data:{"questionNo":questionNo},
		async:false,
		success:function(data) {
			result = data;
		}
	});
	return result;
}
/**
 * 页面填充试题
 * @returns
 */
function pageInitQuestionInfo(data) {
	// 填充问题信息
	$(".question_info").val(data.question.question);
	// 初始化本题拥有的选项个数
	initOptions(data.options.length);
	// 遍历选项改变页面值
	var options = data.options;
	for(var i in options) {
		var option = options[i];
		var no = option.option;
		var ratio = option.ratio;
		var oldOption = $("#option"+option.letter+"_select").data("option");
		var oldRatio = $("#ratio"+option.letter+"_select").data("ratio");
		// 改变选项列表默认选中值
		$("#option"+option.letter+"_select")
		.removeClass("option_"+oldOption).val(no).attr("data-option",no)
		.addClass("option_"+no);
		// 改变分值默认选中值
		$("#ratio"+option.letter+"_select").removeClass("ratio_"+oldRatio)
		.val(ratio).attr("data-ratio",ratio).addClass("ratio_"+ratio);
	}
	// 改变分值列表默认选中值
}
/**
 * 选项列表控制对象
 */
var Option = {
		letter : ["A","B","C","D","E","F","G","H","I"],
		position : 0,
		default_position : 0,
};

/**
 * 选项改变事件处理
 * @param node 标识操作节点
 * @returns
 */
function option_change(node) {
	var newNo = $(node).val();
	var oldNo = $(node).data("option");
	if (newNo == oldNo) return;
	// 判断选项是否重复
	if($(".option_"+newNo).size() > 0) { // 重复
		alert("选项重复了！！");
		$(node).val(oldNo);
	} else { // 不重复
		$(node).removeClass("option_"+oldNo).addClass("option_"+newNo);
		$(node).attr("data-option",newNo);
	}
}
/**
 * 分值改变事件
 * @returns
 */
function ratio_change(node) {
	var newNo = $(node).val();
	var oldNo = $(node).data("ratio");
	if (newNo == oldNo) return;
	// 判断选项是否重复
	if($(".ratio_"+newNo).size() > 0) { // 重复
		alert("该分值已经分配！！");
		$(node).val(oldNo);
	} else { // 不重复
		$(node).removeClass("ratio_"+oldNo).addClass("ratio_"+newNo);
		$(node).attr("data-ratio",newNo);
	}
}

/**
 * 获取全部选项信息
 * @returns
 */
function getAllOption() {
	var result = "";
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/option/all",
		type:"get",
		async:false,
		success:function(data) {
			result = data;
		}
	});
	return result;
}
/**
 * 初始化选择项列表
 * @param optionSize
 * @returns
 */
function initOptions(optionSize) {
	// 删除旧的选项列表
	$(".option_li").remove();
	// 选项位置移到初始位置
	Option.position = Option.default_position;
	var optionArray = eval('('+getAllOption()+')');
	// 填充新的选项列表
	for(var i=0; i < optionSize; i++) {
		initOption(optionArray,i);
	}
	$("#options_box").attr("data-options",""+(Option.position)+"");
}
/**
 * 初始化选项内容
 * @param optionArray 选项数组
 * @param initPosition 填充位置
 * @returns 
 */
function initOption(optionArray,initPosition) {
	console.log(initPosition);
	var optionSelectNo = "";
	var ratioSelectNo = "";
	var letter = Option.letter[Option.position];
	var option = "";
	var initHtml = "<li class='option_li'>";
	initHtml += "<form id='option_form"+letter+"'>";
	initHtml += "<span>"+letter+"：</span>";
	initHtml += "<input type='hidden' value='"+letter+"' name='letter' />"
	initHtml += "<select name='option' class='required option_select' id='option"+letter+"_select' onchange='option_change(this)'>";
	// 选项依次默认选中
	for(var i in optionArray) {
		var option = optionArray[i];
		optionSelectNo = (initPosition == i) ? option.optionNo : optionSelectNo;
		var selected = (initPosition == i) ? "selected='selected'" : "";
		initHtml += "<option value='"+option.optionNo+"' "+selected+" >"+option.info+"</option>";
	}
	initHtml += "</select>";
	initHtml += "<select name='ratio'  id='ratio"+letter+"_select' style='width:90px;border-radius:3px;border:1px solid #ccc;height:28px;' onchange='ratio_change(this)'>";
	for(var i=100; i>=10;i=i-10) {
		var selected = "";
		if((100 - initPosition*10) == i) {
			selected = "selected='selected'";
			ratioSelectNo = i;
		}
		initHtml += "<option value='"+i+"' "+selected+">"+i+"</option>";
	}
	initHtml += "</select>";
	initHtml += "</form>";
	
	initHtml += "</li>";
	$("#options_box").append(initHtml);
	Option.position = Option.position + 1;
	// 改变添加选项编号类
	$("#option"+letter+"_select").addClass("option_"+optionSelectNo).attr("data-option",optionSelectNo);
	// 改变分值类
	$("#ratio"+letter+"_select").addClass("ratio_"+ratioSelectNo).attr("data-ratio",ratioSelectNo);
}
/**
 * 提交按住方法
 * @returns
 */
function submit_btn_fun() {
	if(chenkQuestion() == 1) {
		// 获取表单数据处理类型
		var submit_type = ($("#questionNo").val() != "") ? "update" : "add";
		// 提交表单数据
		if(submit(submit_type,initSubmitData()) == "1") {
			alert("保存成功");
		} else {
			alert("保存失败");
		}
		
	}
}
/**
 * 检查该试题信息
 * @returns 通过检查返回1 否则返回0
 */
function chenkQuestion(){
	var oldQuestionInfo = $("#old_question_info").val(); // 旧问题信息
	var newQuestionInfo = $("#question_info").val(); // 新问题信息
	var optionSize = parseInt($("#options_box").data("options")); // 选项列表个数
	var optionSelectedSize = parseInt($("#options_box").data("option-selected")); // 选项选中个数
	var ratioSelectedSize = parseInt($("#options_box").data("ratio-selected")); // 选项分值选中个数
	if(newQuestionInfo == "") {
		alert("请输入问题信息！！");
		return 0;
	}
	if(optionSize > optionSelectedSize){
		alert("请补全问题选项信息！！");
		return 0;
	}
	if(optionSize > ratioSelectedSize) {
		alert("请补分值分配！！");
		return 0;
	}
	if(oldQuestionInfo != newQuestionInfo &&
			checkData(oldQuestionInfo) == "1") {
		alert("该问题信息已经存在！！");
		return 0;
	}
	return 1;
}
/**
 * 初始化提交的数据
 * @returns
 */
function initSubmitData() {
	var submit_data = {
			"question" : $("#question_info").val(),
			"questionNo" : $("#questionNo").val(),
			"options" : [],
	};
	var question = $("#question_info").val();
	var optionSize = parseInt($("#options_box").attr("data-options"));
	for(var i=0; i < optionSize; i++ ) {
		var submitinfo = $("#option_form"+Option.letter[i]).serializeJson();
		submit_data.options[i] = submitinfo;
	}
	return JSON.stringify(submit_data);
}
/**
 * 检查后台，该问题信息是否存在
 * @param questionInfo 需要检查的问题信息
 * @returns 存在返回1，不存在返回0
 */
function checkData(questionInfo) {
	var result = "";
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/question/check",
		data:{"question":questionInfo},
		type:"post",
		async:false,
		success:function(data) {
			result = data;
		}
	});
	return result;
}
/**
 * 数据提交到后台
 * @param Handle_type 数据提交后，数据处理类型  add添加 update修改
 * @param submit_data 提交的数据
 * @returns 处理成功成功返回1 失败返回0
 */
function submit(Handle_type,submit_data) {
	var result = "";
	$.ajax({
		url:"http://localhost:8080/evaluationmanager/question/"+Handle_type,
		data:{"data":submit_data},
		type:"post",
		async:false,
		success:function(data) {
			result = data;
		}
	});
	return result;
}
