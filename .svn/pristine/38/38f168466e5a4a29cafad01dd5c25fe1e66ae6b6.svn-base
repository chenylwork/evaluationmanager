package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.User;


/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午1:48:55
 * @Description 描述信息：登录日志Service
 *
 */

public interface LogService {
		//添加登录日志
		public boolean add(User user,HttpServletRequest request);
		//修改登录日志
		public boolean update(LoginLog loginLog);
		//删除登录日志
		public boolean delete(LoginLog loginLog);
		//查询全部登录日志
		public List<LoginLog> getAll();
		//根据ID查登录日志
		public LoginLog getLoginLogByID(long id);
		/**
		 * 分页数据查询
		 * @param pagin
		 * @param conditions
		 * @param params
		 * @return 
		 */
		//public List<Map<String,Object>> paginGet(Pagin<Map<String,Object>> pagin,String conditions,String... params);
		/**
		 * 多条件分页查询loginlog的数据信息
		 * 该方法已将pagin对象中的data属性赋值
		 * @Author 任少华
		 * @DateTime 2018年8月7日-上午3:28:41
		 * @param pagin 分页对象
		 * @return 查询到的pagin对象对应的数据，积分也对象
		 */
		public String paginSearch(Pagin<Map<String, Object>> pagin,LoginLog loginLog);
		/**
		 * @return
		 */
		public int batchDelete(String[] params);
}
