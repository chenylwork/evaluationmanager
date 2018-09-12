package com.evaluationmanager.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.PowerTypeDao;
import com.evaluationmanager.entiy.PowerType;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月16日-上午10:06:37
 * @Description 描述信息：权限类别操作实现
 *
 */
@Repository("PowerTypeDao")
public class PowerTypeDaoImpl extends AbstractDataDao<PowerType> implements PowerTypeDao {
	
	@Override
	public Map<String, Object> getInfoByType(String type) {
		Map<String, Object> InfoByType = null;
		try {
			InfoByType = super.getMapDataByNo(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return InfoByType;
	}
	

}
