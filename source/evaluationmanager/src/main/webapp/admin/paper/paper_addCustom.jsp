<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自定义组装试卷</title>
	<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<h3>自定义组装试卷</h3>
			<hr>
			<div class="col-md-3 column"></div>
				<div class="col-md-6 column">
					<form role="form">
						<div class="form-group">
							 <label>试卷名称：</label>
							 <input class="form-control" type="text" />
						</div>
						<div class="form-group">
							 <label >试卷类型：</label>
							 <select class="form-control">
							 	<option>请选择</option>
							 	<option>常规测评</option>
							 	<option>统一测评</option>
							 </select>
						</div>
						<div class="form-group">
							 <label>试卷描述：</label>
							 <textarea class="form-control"></textarea>
						</div>
						 <a class="btn" id="modal-966176" role="button" href="#questions" data-toggle="modal">
						 选择试卷问题
						 </a><br>
						<div class="modal fade" id="questions" role="dialog" aria-hidden="true" aria-labelledby="myModalLabel">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										 <button class="close" aria-hidden="true" type="button" data-dismiss="modal">×</button>
										<h4 class="modal-title" id="myModalLabel">
											选择试卷问题（20道）
										</h4>
									</div>
									<div class="modal-body">
										<table class="table table-striped">
											<thead>
												<tr>
													<th><input type="checkbox" ></th>
													<th>编号</th>
													<th>产品</th>
													<th>交付时间</th>
													<th>状态</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="q" items="${questionList}">
													<tr>
														<td><input type="checkbox" ></td>
														<td>${q.id}</td>
														<td>${q.questionNo}</td>
														<td>${q.question}</td>
														<td>${q.description}</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>

									</div>
									<div class="modal-footer">
										 <button class="btn btn-default" type="button" data-dismiss="modal">取消</button> 
										 <button class="btn btn-primary" type="button">确定</button>
									</div>
								</div>
								
							</div>
						</div>
						<button class="btn btn-primary" type="submit">添加试卷</button>
					</form>
				</div>
			<div class="col-md-3 column"></div>
		</div>
	</div>
</body>
</html>