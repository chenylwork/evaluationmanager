<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改权限</title>
	<link rel="shortcut icon" href="/favicon.ico" type="../../image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
</head>
<body>
	<div class="x-body">
        	<form id="power_save_form" action="${pageContext.request.contextPath}/admin/power/savePowerRole" method="post" class="layui-form layui-form-pane">
        		<input type="hidden" id="power_hidden_id" name="${empty powerRole.id ? '' : 'powerRole.id'}" value="${powerRole.id}" />
               	<input type="hidden" name="powerRole.role" value="${roleMap.no}" readonly="readonly"/>
	            <div class="layui-form-item">
	                <label for="name" class="layui-form-label">
	                    	角色名
	                </label>
	                <div class="layui-input-inline">
	                	<select>
	                		<option value="">请选择</option>
	                		<c:forEach var="r" items="${roleList}">
	                			<c:choose>
	                				<c:when test="${r.no == roleMap.no}">
	                					<option value="${r.no}" selected="selected">${r.name}</option>
	                				</c:when>
	                				<c:otherwise>
	                					<option value="${r.no}">${r.name}</option>
	                				</c:otherwise>
	                			</c:choose>
	                		</c:forEach>
	                	</select>
	                </div>
	            </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">
                                                                      拥有权限
                    </label>
                    <table  class="layui-table layui-input-block">
                        <tbody>
							<tr>
								<td>
									<div class="layui-input-block">
										<c:forEach var="i" items="${powerList}">
											<script type="text/javascript">
												console.log("${fn:contains(powerRole.powerInfoNo,i.powerInfoNo)}");
											</script>
											<c:choose>
												<c:when test="${fn:contains(powerRole.powerInfoNo,i.powerInfoNo)}">
													<input name="powerRole.powerInfoNo" lay-skin="primary" type="checkbox" title="${i.name}" value="${i.powerInfoNo}" checked="checked" >
												</c:when>
												<c:otherwise>
													<input name="powerRole.powerInfoNo" lay-skin="primary" type="checkbox" title="${i.name}" value="${i.powerInfoNo}" >
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</div>
								</td>
							</tr>
                        </tbody>
                    </table>
                </div>
                <div class="layui-form-item">
                <button type="button" class="layui-btn" id="power_save_btn" lay-submit="" lay-filter="保存">确定</button>
              </div>
            </form>
    </div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#power_save_btn").click(function(){
		console.log($("#power_save_form").serialize());
		$.ajax({
			url:$("#power_save_form").attr("action"),
			data:$("#power_save_form").serialize(),
			type:"post",
			success:function(data) {
				if(/^\d+$/.test(data)) { // 正整数+0
					if(data == "0") {
						alert("保存失败");
					} else {
						alert("保存成功");
						$("#power_hidden_id").val(data).attr("name","powerRole.id");
					}
				}
			},
			error:function() {
				alert("服务器出错了\我们正在全力抢修中！！！");
			}
		});
	});
});
</script>
</html>