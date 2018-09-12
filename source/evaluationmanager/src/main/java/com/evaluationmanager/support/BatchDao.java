package com.evaluationmanager.support;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 批量数据操作接口
 * @author chenyl
 * @Date 2018年7月12日
 * @Description  
 *
 */
public interface BatchDao<T> {
	/**
	 * 批量数据操作
	 * @Author 陈彦磊
	 * @DateTime 2018年8月7日-上午3:22:00
	 * @param sql 执行的sql语句
	 * @param params 为sql语句中的占位符赋值的参数集合
	 * @return 成功记录数
	 * @throws SQLException
	 */
	public int batchModification(String sql,List<String[]> params) throws SQLException;

}
