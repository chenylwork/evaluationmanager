package com.evaluationmanager.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.PowerUserDao;
import com.evaluationmanager.entiy.PowerUser;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月16日-上午10:09:38
 * @Description 描述信息：用户权限操作实现
 *songyixue
 */
@Repository("PowerUserDao")
public class PowerUserDaoImpl extends AbstractDataDao<PowerUser> implements PowerUserDao {

	@Override
	public List<Map<String,Object>> getInfoByUser(String user) {
		String hqlH ="this.user = ? and t4.codeNo = 'H'";
		String hqlQ = "this.user = ? and t4.codeNo = 'Q'";
		
		
		List<Map<String, Object>> mapDatas = super.getMapDatas(hqlH, user);
		return mapDatas;
	}

}
