package com.evaluationmanager.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.LogDao;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午1:36:47
 * @Description 描述信息：登录日志LogDaoImpl
 *
 */
@Repository("LogDao")
public class LogDaoImpl extends AbstractDataDao<LoginLog> implements LogDao{
	
	public int batchDelete(List<String[]> params) {
		String sql = "delete from login_log where id = ?";
		try {
			return batchModification(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin, LoginLog loginLog) {
		String moditions = "1=1 ";
		List<String> paramsList = new ArrayList<>();
		if(loginLog !=null && loginLog.getUser() != null 
				&& !"".equals(loginLog.getUser())) {
			moditions += " and this.user like ? ";
			paramsList.add("%"+loginLog.getUser()+"%");
		}
		if(loginLog !=null && loginLog.getLoginTime() !=null && !"".equals(loginLog.getLoginTime())){
			
			moditions += " and this.loginTime = ? ";
			paramsList.add(loginLog.getLoginTime());
		}
		System.err.println(loginLog);
		return super.paginGetMapDatas(pagin, moditions, paramsList.toArray(new String[]{}));
			
	}
	@Override
	public long size(LoginLog loginLog) {
		String moditions = "1=1 ";
		System.err.println(loginLog);
		List<String> paramsList = new ArrayList<>();
		if(loginLog !=null && loginLog.getUser() != null 
				&& !"".equals(loginLog.getUser())) {
			moditions += " and this.user like ? ";
			paramsList.add("%"+loginLog.getUser()+"%");
		}
		if(loginLog !=null && loginLog.getLoginTime() !=null && !"".equals(loginLog.getLoginTime())){
			
			moditions += " and this.loginTime = ? ";
			paramsList.add(loginLog.getLoginTime());
		}
		return super.size(moditions, paramsList.toArray(new String[]{}));
	}
}
