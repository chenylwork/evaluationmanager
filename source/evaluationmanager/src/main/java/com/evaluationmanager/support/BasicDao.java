package com.evaluationmanager.support;

import java.util.List;

import com.evaluationmanager.exception.DataException;
/**
 * 
 * @author chenyl
 * @Date 2018年7月11日
 * @Description  基本数据操作接口，包括单条数据的增删改，获取全部数据和根据主键标识获取数据
 * @param <T>
 */
public interface BasicDao<T> {
	
	/**
	 * 添加信息
	 * @Author chenyl
	 * @param t 需要添加的对象实体
	 * @return
	 */
	public boolean add(T t);
	/**
	 * 修改信息
	 * @Author chenyl
	 * @param t 需要修改的对象实体
	 * @return
	 */
	public boolean update(T t);
	/**
	 * 删除信息
	 * @Author chenyl
	 * @param t 需要删除的对象实体
	 * @return
	 */
	public boolean delete(T t);
	/**
	 * 根据id获取信息
	 * @Author chenyl
	 * @param entityClass 需要查询的对象的class 例：Student.class
	 * @param id 需要查询的数据的ID主键标识
	 * @return
	 */
	public T getDataByID(long id);
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月27日-下午3:08:17
	 * @Description 作用描述
	 * @param entityClass 需要查询的对象的class 例：Student.class
	 * @param no 需要查询的数据的编号no
	 * @return 获取的数据对象，如果该对象不存咋将返回null
	 */
	public T getDataByNo (String no) throws DataException;
	/**
	 * 根据condition约束条件获取数据信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月25日-下午11:54:28
	 *
	 * @param conditions 查询约束条件
	 * @param params 为约束条件中占位符赋值的参数数组
	 * @return T
	 */
	public T getData (String conditions,String... params);
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月31日-下午12:52:06
	 * @Description 作用描述:获取数据基本信息，不包括外键链接数据
	 * @param conditions 查询的约束条件
	 * @param params 为约束条件内的占位符赋值的参数数组
	 * @return 数据基本信息，不包括外键链接数据的List<T>集合
	 */
	public List<T> getDatas(String conditions, String... params);
	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年8月2日-下午1:32:08
	 * @Description 作用描述 : 判断是否含有某数据
	 * @param conditions 查询的约束条件
	 * @param params 为约束条件内的占位符赋值的参数数组
	 * @return 若数据库内有该数据将返回true，若没有将返回false
	 */
	public boolean isHas(String conditions, String... params);
	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年8月2日-下午1:52:45
	 * @Description 作用描述 ：获取数据个数
	 * @param conditions 查询的约束条件
	 * @param params 为约束条件内的占位符赋值的可变个数的String类型参数
	 * @return  返回数据库中与约束条件匹配的数据数
	 */
	public long size(String conditions, String... params);

}
