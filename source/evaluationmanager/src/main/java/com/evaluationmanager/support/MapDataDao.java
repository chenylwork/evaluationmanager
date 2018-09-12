package com.evaluationmanager.support;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;

/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月25日-下午5:22:33
 * @Description 数据查询的接口
 */
public interface MapDataDao<T> {
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月25日-下午5:24:55
	 * @Description 根据数据Id获取数据信息
	 * @param id 数据ID
	 * @return Map<String,Object> 查询出的数据map信息
	 */
	public Map<String,Object> getMapDataById(long id);
	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年7月25日-下午5:24:55
	 * @Description 根据数据no获取数据信息
	 * @param id 数据no
	 * @return Map<String,Object> 查询出的数据map信息
	 */
	public Map<String,Object> getMapDataByNo(String no);
	/**
	 * 根据condition约束条件获取数据信息的map类型对象
	 * @Author 陈彦磊
	 * @DateTime 2018年8月25日-下午11:54:28
	 *
	 * @param conditions 查询约束条件
	 * @param params 为约束条件中占位符赋值的参数数组
	 * @return Map<String,Object>
	 */
	public Map<String,Object> getMapData(String hql,String... params);
	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年7月25日-下午5:32:01
	 * @Description 根据查询条件获取数据
	 * @param hql hql查询语句
	 * @param params 为条件语句占位符赋值的参数
	 * @return List<Map<String,Object>> 查询出的数据map信息list集合
	 */
	public List<Map<String,Object>> getMapDatas(String hql,String... params);
	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年7月30日-上午10:57:10
	 * @Description 分页获取Map类型的数据 
	 * @param pagin 分页对象
	 * @param hql 查询约束条件
	 * @param params 为查询约束条件占位符赋值的参数
	 * @return
	 */
	public List<Map<String,Object>> paginGetMapDatas(Pagin<Map<String,Object>> pagin,String hql, String... params);
	
	

}
