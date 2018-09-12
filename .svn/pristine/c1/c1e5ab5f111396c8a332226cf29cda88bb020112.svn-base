/**
 * 
 */
/**
 * 加载页面执行方法
 * @param account 用户账户
 * @param type 页面类别
 * @returns
 */
function power_load(account,type) {
	initPowerTypes(type); // 填充列表并隐藏
	initPowerInfos(type); // 填充子列表并隐藏
	$(".power_type_"+type).removeClass("hidden"); // 去除当前页的列表隐藏
	showPowerInfo(account); // 显示当前用户拥有的权限功能
	$(".remove_type").remove(); // 移除无用的列表
}
// 类别图标
var powerIcon = {
		"01":"&#xe696;",
		"02":"&#xe6b5;",
		"03":"&#xe70c;",
		"04":"&#xe6c7;",
		"05":"&#xe6b8;",
		"06":"&#xe726;",
		"07":"&#xe6f5;",
		"08":"&#xe74e;",
		"09":"&#xe69e;",
		"10":"&#xe6ba;",
		"11":"&#xe70b;",
		"12":"&#xe744;",
		"13":"&#xe812;",
		"14":"&#xe6a9;",
		"15":"t1",
		"16":"t2",
		"18":"t3",
		"19":"t4",
};
/**
 * 获取全部权限
 * @returns
 */
function allPower() {
	var info = "";
	$.ajax({
		url : "http://localhost:8080/evaluationmanager/admin/power/allPower",
		type : "post",
		async : false,
		success : function(data) {
			info = data;
		}
	});
	return info;
}
/**
 * 获取全部权限类别
 * @returns
 */
function allPowerType() {
	var info = "";
	$.ajax({
		url : "http://localhost:8080/evaluationmanager/admin/power/allPowerType",
		type : "post",
		async : false,
		success : function(data) {
			info = data;
		}
	});
	return info;
}
/**
 * 填充全部权限类别
 * @returns
 */
function initPowerTypes(type) {
	//将json字符串转换成json对象
	var data =  eval('('+allPowerType()+')');
	if(type == "Q") {//前台
		$(".reception_power_box").remove();
		for(var i in data) {
			initPowerType_Q(data[i]);
		}
	} else { // 后台
		$(".nav_li").remove;
		for(var i in data) {
			initPowerType(data[i]);
		} 
	}
}

/**
 * 填充权限类别项
 * @param info
 * @returns
 */
function initPowerType(info) {
	var initHtml = "<li class='nav_li power_type remove_type power_type_"+info.codeNo+" hidden'><a href='javascript:;'>";
	initHtml += "<i class='iconfont'>"+powerIcon[info.powerTypeNo]+"</i>";
	initHtml += "<cite>" + info.name+"</cite><i class='iconfont nav_right'>&#xe697;</i></a>";
	initHtml += "<ul class='sub-menu' id='powerType_"+info.powerTypeNo+"'></ul></li>";
	$("#nav").append(initHtml);
}
function initPowerType_Q(info) {
	var initHtml = "<div class='reception_power_box power_type hidden remove_type power_type_"+info.codeNo+"'>";
	initHtml += "<div class='div2'><div class='"+powerIcon[info.powerTypeNo]+"'> </div>"+info.name+"</div>";
	initHtml += "<div class='div3'><ul id='powerType_"+info.powerTypeNo+"'></ul></div></div>";
	$("#reception_power_list").append(initHtml);
}
/**
 * 填充全部子权限 
 * @returns
 */
function initPowerInfos(type) {
	//将json字符串转换成json对象
	var data =  eval('('+allPower()+')');
	//遍历json对象data.powerInfo
	//$(".nav_li").remove;
		for(var i in data) {
			if(type == "Q") {
				initPowerInfo_Q(data[i]);
			} else {
				initPowerInfo(data[i]);
			}
		}
}
/**
 * 填充子权限项
 * @param powerInfo
 * @returns
 */
function initPowerInfo(powerInfo) {
	var initHtml = "";
	initHtml += "<li id='power_"+powerInfo.powerInfoNo+"' class='power_menu hidden'><a _href='"+getRootUrl()+powerInfo.uri+"'>";
	initHtml += "<i class='iconfont'>&#xe6a7;</i><cite>"
			+ powerInfo.name + "</cite></a></li>";
	$("#powerType_"+powerInfo.type).append(initHtml);
}
function initPowerInfo_Q(powerInfo) {
	var initHtml = "<li id='power_"+powerInfo.powerInfoNo+"' class='hidden'><a href='"+getRootUrl()+powerInfo.uri+"' target='frame'>"+powerInfo.name+"</a></li>";
	console.log("#powerType_"+powerInfo.type);
	$("#powerType_"+powerInfo.type).append(initHtml);
}
/**
 * 显示用户拥有的权限项
 * @param account
 * @returns
 */
function showPowerInfo(account) {
	var power_array = getUserPower(account).split(",");
	for(var i in power_array) {
		$("#power_"+$.trim(power_array[i])).removeClass("hidden").parents(".power_type").removeClass("remove_type");
	}
}
/**
 * 获取用户拥有的权限
 * @param account
 * @returns
 */
function getUserPower(account) {
	var info = "";
	$.ajax({//allPower("${LOGINED_USER.account}").split(",");
		url : "http://localhost:8080/evaluationmanager/admin/power/power",
		data : {
			"data" : account
		},
		type : "post",
		async : false,
		success : function(data) {
			//data json字符串
			info = data;
		}
	});
	return info;
}
