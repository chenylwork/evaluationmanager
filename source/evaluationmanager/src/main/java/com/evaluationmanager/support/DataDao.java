package com.evaluationmanager.support;

/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月30日-下午2:27:24
 * @Description 数据操作总接口
 */
public interface DataDao<T> extends BasicDao<T>,PaginDao<T>,BatchDao<T>,MapDataDao<T> {
	
}
