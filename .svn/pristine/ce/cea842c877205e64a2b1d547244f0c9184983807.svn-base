/**
 * excel导入使用示例
 */
function excelImportLoad() {
	// 文件改变时间
	$("#file").change(function(){
		var tes;
		readExcelShowData(this,{
			// 正确数据填充到的table的tbody的id属性值
			successBodyID : "successBodyID",
			// 错误数据填充到的table的tbody的id属性值
			failBodyID : "failBodyID",
			// 成功数id
			successSizeID : "successSize",
			// 失败数id
			failSizeID : "failSize",
			success : function(data) {
				submit(data);
			},
			// 页面表格字段集合对象
			fields : { 
				student : {
					// 对应的Excel文件的列名称
					name : "学生",
					// Excel中对应的该数据的检查，必须返回true或false,确保方法有返回值，
					// 若无返回值将按照返回false处理
					check : function(checkChar) {
						if(checkChar != "") {
							return true;
						}
					},
					// 数据检查错误提示信息
					message : "学生名称不能为空"
				},
				class : {
					name : "班级"
				},
				major :{
					name : "专业",
				},
				dept : {
					name : "系别"
				},
				age :{
					name : "年龄"
				},
				pp : {
					name : "屁"
				}
			}
		});
	});
	$("#chooseFileBtn").click(function(){
		$("#file").click();
	});
}
/**
 * 
 */
function submit(subData) {
	$.ajax({
		url : "http://localhost:8080/evaluationmanager/question/batchImport",
		data: {"data":subData},
		type: "post",
		success : function(result) {
			console.log(result);
		}
	});
}
