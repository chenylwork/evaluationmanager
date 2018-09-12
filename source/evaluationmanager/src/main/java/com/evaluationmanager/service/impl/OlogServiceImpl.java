package com.evaluationmanager.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.MajorDao;
import com.evaluationmanager.dao.OlogDao;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.support.AbstractService;
import com.google.gson.Gson;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午2:19:46
 * @Description 描述信息：操作日志OlogServicImpl
 *
 */
@org.springframework.stereotype.Service("ologService")
public class OlogServiceImpl extends AbstractService<OperationLog> implements OlogService {
	@Autowired
	private OlogDao ologDao;
	@Autowired
	private Gson gson;
	public void setOlogDao(OlogDao ologDao) {
		super.setDataDao(this.ologDao = ologDao);
	}

	@Override
	@Transactional
	public boolean add(HttpServletRequest request,OperationLog operationLog) throws DataException{
		User user = (User) request.getSession().getAttribute("LOGINED_USER");
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(user);
		operationLog.setUser(user.getAccount());
		operationLog.setOperationTime(df.format(day));
		String operation = operationLog.getOperation();
		String state = operationLog.getState();
		if(operation == null || operation.equals("")) {
			try {
				throw new DataException("没有操作信息");
			} catch (DataException e) {
				e.printStackTrace();
			}
		}
		if(state == null || state.equals("")) {
			try {
				throw new DataException("没有操作状态");
			} catch (DataException e) {
				e.printStackTrace();
			}
		}
		return ologDao.add(operationLog);
	}
	@Override
	@Transactional
	public boolean update(OperationLog operationLog) {
		// TODO Auto-generated method stub
		return ologDao.update(operationLog);
	}

	@Override
	@Transactional
	public boolean delete(OperationLog operationLog) {
		// TODO Auto-generated method stub
		return ologDao.delete(operationLog);
	}

	@Override
	@Transactional
	public List<OperationLog> getAll() {
		// TODO Auto-generated method stub
		List<OperationLog> operationLog=ologDao.getDatas("");
		return operationLog;
	}

	@Override
	@Transactional
	public OperationLog getOperationLogByID(long id) {
		// TODO Auto-generated method stub
		return ologDao.getDataByID(id);
	}

	/**@Override
	public List<Map<String, Object>> paginGet(Pagin<Map<String, Object>> pagin, String conditions, String... params) {
		// 获取总个数
		pagin.setCount(ologDao.size(conditions, params));
		// 获取数据
		return ologDao.paginGetMapDatas(pagin, conditions, params);
	}**/
	@Override
	@Transactional()
	public String paginSearch(Pagin<Map<String, Object>> pagin,OperationLog oLog) {
		pagin.setCount(ologDao.size(oLog));
		ologDao.paginSearchMajor(pagin, oLog);
		return gson.toJson(pagin);
	}
	
	@Override
	public int batchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			System.out.println(string);
			paramList.add(new String[]{string});
		}
		return ologDao.batchDelete(paramList);
	}
	
}
