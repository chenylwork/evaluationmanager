package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.entiy.Role;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-下午4:18:26
 * @Description 描述信息：
 *
 */
public interface RoleDao extends DataDao<Role>{
	
	/**
	 * 查询教师角色
	 * @Author 韩笑
	 * @return
	 */
	public List<Role> getTeacherRole();
	
	
	
}
