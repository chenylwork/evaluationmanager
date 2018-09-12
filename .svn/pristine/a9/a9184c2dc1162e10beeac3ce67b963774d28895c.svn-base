/**
 * 公用的js方法文件
 */

/**
 * 获取url根路径
 */
function getRootUrl() {
	return  "http://"+window.location.host+"/evaluationmanager/";
}
/**
 * 清除元素内容
 * @param id 元素对应的ID
 */
function clean(id) {
	$("#"+id).html("");
}
/**
 * 将表单数据转换为json对象
 * @param $
 */
(function($){  
	$.fn.serializeJson=function(){  
		var serializeObj={};  
		var array=this.serializeArray();  
		var str=this.serialize();  
		$(array).each(function(){  
			if(serializeObj[this.name]){  
				if($.isArray(serializeObj[this.name])){  
					serializeObj[this.name].push(this.value);  
				}else{  
					serializeObj[this.name]=[serializeObj[this.name],this.value];  
				}  
			}else{  
				serializeObj[this.name]=this.value;   
			}  
		});  
		return serializeObj;  
	};  
})(jQuery);
/**
 * 获取url参数
 * @param para 
 * @returns 获取url参数
 */
function param(para){
    var paraArr = location.search.substring(1).split('&');
    for(var i = 0;i < paraArr.length;i++){
        if(para == paraArr[i].split('=')[0]){
            return paraArr[i].split('=')[1];
        }
    }
    return '';
}
//替换指定传入参数的值,paramName为参数,replaceWith为新值
function replaceParamVal(paramName,replaceWith) {
    var oUrl = this.location.href.toString();
    var re=eval('/('+ paramName+'=)([^&]*)/gi');
    var nUrl = oUrl.replace(re,paramName+'='+replaceWith);
    this.location = nUrl;
    window.location.href=nUrl
}