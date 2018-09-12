package com.evaluationmanager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.dao.PowerInfoDao;
import com.evaluationmanager.dao.PowerRoleDao;
import com.evaluationmanager.dao.PowerTypeDao;
import com.evaluationmanager.dao.PowerUserDao;
import com.evaluationmanager.dao.UserDao;
import com.evaluationmanager.entiy.PowerInfo;
import com.evaluationmanager.entiy.PowerRole;
import com.evaluationmanager.entiy.PowerType;
import com.evaluationmanager.entiy.PowerUser;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.PowerService;
import com.evaluationmanager.support.AbstractService;
/**
 * 权限管理业务实现类
 * @Author 韩笑
 * @DateTime 2018年8月19日-下午11:57:15
 * @Description 作用描述
 *
 */
@Service("powerService")
public class PowerServiceImpl extends AbstractService<PowerInfo> implements PowerService{

	@Autowired
	private PowerTypeDao powerTypeDao;
	@Autowired
	private PowerInfoDao powerInfoDao;
	@Autowired
	private PowerRoleDao powerRoleDao;
	@Autowired
	private PowerUserDao powerUserDao;
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public List<PowerType> getAllPowerType() {
		return this.powerTypeDao.getDatas("");
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<PowerInfo> getAllPower() {
		return this.powerInfoDao.getDatas("");
	}

	@Override
	@Transactional
	public boolean savePowerRole(PowerRole powerRole) {
		return powerRoleDao.savePowerRole(powerRole) > 0;
	}

	@Override
	@Transactional
	public boolean savePowerUser(PowerUser powerUser) {
		int successSize = 0;
		String[] powerNoArray = powerUser.getPowerInfoNo().split(",");
		String user = powerUser.getUser();
		for(int i=0; i<powerNoArray.length; i++) {
			String powerInfoNo = powerNoArray[i].trim();
			successSize = powerUserDao.add(new PowerUser(powerInfoNo,user)) ? successSize++ : successSize;
		}
		return successSize == powerNoArray.length;
	}

	@Override
	public Map<String, Object> getTypeByInfo(String type) {
		return this.powerTypeDao.getInfoByType(type);
	}

	@Override
	public List<PowerInfo> getAllPowerInfo() {
		return this.powerInfoDao.getDatas("");
	}
	
	@Override
	public List<Map<String,Object>> getInfoByUser(String user) {
		Map<String, Object> userInfo = null;
		userInfo = userDao.getMapDataByNo(user);
		@SuppressWarnings("unchecked")
		Map<String,Object> role = (Map<String, Object>) userInfo.get("role");
		String roleNo = (String)role.get("no");
		System.err.println(roleNo);
		return this.powerUserDao.getInfoByUser(user);
	}

	@Override
	@Transactional
	public int remove(PowerRole powerRole) {
		powerRole = powerRoleDao.getPowerRole(powerRole);
		return powerRoleDao.delete(powerRole) ? SUCCESS : FAIL;
	}
	@Override
	public PowerRole getPowerRole(PowerRole powerRole) {
		return powerRoleDao.getPowerRole(powerRole);
	}
	@Override
	public String getPowerByUser(String userNo) throws DataException {
		User user = userDao.getDataByNo(userNo);
		PowerRole powerRole = powerRoleDao.getPowerRole(user.getRole());
		return (powerRole != null) ? powerRole.getPowerInfoNo() : "";
	}

}
