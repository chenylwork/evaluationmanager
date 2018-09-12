package com.evaluationmanager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.RoleDao;
import com.evaluationmanager.entiy.Role;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-下午4:20:32
 * @Description 描述信息：
 *
 */
@Repository("roleDao")
public class RoleDaoImpl  extends AbstractDataDao<Role> implements RoleDao{

	@Override
	public List<Role> getTeacherRole() {
		return getDatas("type = ?","R01");
	}


}
