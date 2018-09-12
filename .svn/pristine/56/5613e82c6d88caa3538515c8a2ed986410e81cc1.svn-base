/**
 * @Author 陈彦磊
 * @Datetime 2018年8月1日-下午2:41:37
 * @Description excel文件操作的方法方法封装的脚本文件
 */

function a() {}
/**
 * @param file 上传的文件对象
 * @param obj 数据接收显示模板对象
 * @returns 当数据读取完毕并且填充到界面上时，将返回true。
 * 因文件读取为异步读取，可以写一个死循环来判读加载结束
 */
function readExcelShowData(file,obj) {
	var write = function(data) {
		writeTable(data,obj);
	};
	// 替换接送
	var replaceJson = function(jsonArray,obj) {
		var result = [];
		for(var i in jsonArray) {
			var resultObj = {};
			var jsonObj = jsonArray[i];
			var fields =  obj.fields;
			for(var field in fields) {
				var key = obj.fields[field].name;
				var value = (key in jsonObj) ? jsonObj[key] : "";
				resultObj[""+field+""] = value;
			}
			result[i] = resultObj;
		}
		return result;
	}
	readExcelFileToJson(file,write,replaceJson,obj);
}
/**
 * 填充表格信息
 * @param jsonArray json对象数组
 * @param obj 数据接收显示模板对象
 */
writeTable = function(jsonArray,obj) {
	var successSize = 0;
	var failSize = 0;
	var initHtml = "<tr>";
	for(var field in obj.fields) {
		initHtml += "<th>"+obj.fields[field].name+"</th>";
	}
	initHtml += "</tr>";
	$(".table_header").append(initHtml);
	for(var i in jsonArray) {
		var isok = writetr(jsonArray[i],obj,successSize,failSize);
		if(isok) {
			successSize++;
		} else {
			failSize++;
		}
	}
	if(failSize > 0) {
		$("#importBtn").click(function(){
			alert("需要导入的数据，有错误信息请检查修改后重新选择。");
		});
	} else {
		$("#importBtn").click(function(){
			obj.success(obj.data);
		});
	}
	/*
	 * 
	 * 
	 * 
	 * */
};
/**
 * 填充表格tr信息
 * @param json json对象
 * @param obj 数据接收显示模板对象
 */
writetr = function(jsonObj,obj,successSize,failSize) {
	var tdClass = "";
	var initHtml = "<tr>";
	var isSuccess = true;
	for(var field in obj.fields) {
		var key = obj.fields[field].name;
		var value = (key in jsonObj) ? jsonObj[key] : "";
		var message = ("message" in obj.fields[field]) ? obj.fields[field].message : "";
		// 验证数据是否正确
		if(obj.fields[field].check != "" && obj.fields[field].check != null) {
			var checkfun = "obj.fields."+field+".check('"+value+"')";
			var isOk = eval('('+checkfun+')');
			tdClass = isOk ? "" : "error" ;
			isSuccess = isOk ? isSuccess : false ;
		}
		// 拼组html td节点标签
		initHtml += "<td class='cursor_default "+tdClass+"' title='"+message+"'>"+value+"</td>";
		// 初始化 td标签的显示样式
		tdClass = "";
	}
	initHtml += "</tr>";
	if(isSuccess) {
		// 添加成功数据到页面
		$("#"+obj.successBodyID).append(initHtml);
		// 添加成功个数到页面
		$("#"+obj.successSizeID).text(++successSize);
		return true;
	} else {
		// 添加失败数据到页面
		$("#"+obj.failBodyID).append(initHtml);
		// 添加失败个数到页面
		$("#"+obj.failSizeID).text(++failSize);
		return false;
	}
};
/**
 * 读取excel文件，返回为json对象
 * @param obj 需要读取的excel文件
 * @returns 当数据读取完毕并且填充到界面上时，将返回true。
 * 因文件读取为异步读取，可以写一个死循环来判读加载结束
 */
function readExcelFileToJson(file,write,replaceJson,obj) {
	var result = null;
	var wb;//读取完成的数据
    var rABS = false; //是否将文件读取为二进制字符串
    if(!file.files) {
    	readerInfo.isEnd = true;
    	return;
    }
    var f = file.files[0];
    var reader = new FileReader();
    // 异步加载文件
    reader.onload = function(e) {
        var data = e.target.result;
        if(rABS) {
            wb = XLSX.read(btoa(fixdata(data)), {//手动转化
                type: 'base64'
            });
        } else {
            wb = XLSX.read(data, {
                type: 'binary'
            });
        }
        //wb.SheetNames[0]是获取Sheets中第一个Sheet的名字
        //wb.Sheets[Sheet名]获取第一个Sheet的数据
       // document.getElementById("demo").innerHTML= JSON.stringify( XLSX.utils.sheet_to_json(wb.Sheets[wb.SheetNames[0]]) );
        // 获取Excel文件信息json字符串
		var jsonStr = JSON.stringify( XLSX.utils.sheet_to_json(wb.Sheets[wb.SheetNames[0]]));
		var jsonArray = eval('('+jsonStr+')');
		console.log(jsonArray);
		// 填充到页面
		write(jsonArray);
		// 转换json信息
		//obj.success(JSON.stringify(replaceJson(jsonArray,obj)));
		obj.data = JSON.stringify(replaceJson(jsonArray,obj));
    };
    if(rABS) {
        reader.readAsArrayBuffer(f);
    } else {
        reader.readAsBinaryString(f);
    }
}
/**
 * 文件流转BinaryString
 * @param data 需要转换的文件流
 * @returns {String} 转换后的二进制字符串
 */
function fixdata(data) { //文件流转BinaryString
    var o = "",
        l = 0,
        w = 10240;
    for(; l < data.byteLength / w; ++l) o += String.fromCharCode.apply(null, new Uint8Array(data.slice(l * w, l * w + w)));
    o += String.fromCharCode.apply(null, new Uint8Array(data.slice(l * w)));
    return o;
}


