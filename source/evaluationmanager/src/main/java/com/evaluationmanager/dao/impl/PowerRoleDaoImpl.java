package com.evaluationmanager.dao.impl;


import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.PowerRoleDao;
import com.evaluationmanager.entiy.PowerRole;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月16日-上午10:10:47
 * @Description 描述信息：角色权限操作实现
 *
 */
@Repository("PowerRoleDao")
public class PowerRoleDaoImpl extends AbstractDataDao<PowerRole> implements PowerRoleDao {
	@Override
	public int savePowerRole(PowerRole powerRole) {
		try {
			template.saveOrUpdate(powerRole);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public PowerRole getPowerRole(PowerRole powerRole) {
		if(powerRole == null) return new PowerRole();
		return getData("this.role = ?",powerRole.getRole());
	}
	
	public PowerRole getPowerRole(String roleNo) {
		if(roleNo == null || roleNo.equals("")) return new PowerRole();
		return getData("this.role = ?",roleNo);
	}
	

}
