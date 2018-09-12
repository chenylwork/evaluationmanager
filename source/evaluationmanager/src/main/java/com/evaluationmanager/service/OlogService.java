package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.exception.DataException;

/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午2:11:03
 * @Description 描述信息：操作日志接口 OlogService
 *
 */
public interface OlogService {
	/**
	 * 
	 * @param request
	 * @param operationLog
	 * @return
	 * @throws DataException
	 */
	public boolean add(HttpServletRequest request, OperationLog operationLog) throws DataException;

	// 修改操作日志
	public boolean update(OperationLog operationLog);

	// 删除操作日志
	public boolean delete(OperationLog operationLog);

	// 查询全部操作日志
	public List<OperationLog> getAll();

	// 根据ID查操作日志
	public OperationLog getOperationLogByID(long id);

	/**
	 * 分页数据查询
	 * 
	 * @param pagin
	 * @param conditions
	 * @param params
	 * @return
	 */
	// public List<Map<String,Object>> paginGet(Pagin<Map<String,Object>>
	// pagin,String conditions,String... params);
	public String paginSearch(Pagin<Map<String, Object>> pagin, OperationLog oLog);

	public int batchDelete(String[] params);
}
