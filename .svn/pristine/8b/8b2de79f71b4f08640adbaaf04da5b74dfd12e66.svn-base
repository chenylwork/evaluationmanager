package com.evaluationmanager.dao;


import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.support.DataDao;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午1:34:51
 * @Description 描述信息：登录日志接口
 *
 */
public interface LogDao  extends DataDao<LoginLog>{
	/**
	 * 批量删除方法
	 * @return
	 */
	public int batchDelete(List<String[]> params);
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin, LoginLog loginLog);
	public long size(LoginLog loginLog);
}
