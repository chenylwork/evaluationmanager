package com.evaluationmanager.service;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Class;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午2:21:36
 * @description 班级信息业务操作接口
 */
public interface ClassService {
   /**
    * 添加班级信息
    * @param 参数：classes
    * @return 返回值 class
    */
   public Class add(Class classes);
   /**
    * 批量添加班级信息
    * @return 
    */
   public Map<String, Collection<Class>> batchAdd();
   /**
    * 修改班级信息
    * @param 参数：classes
    * @return 返回值class 
    */
   public Class update(Class classes);
   /**
    * 删除,批量删除班级信息
    * @param 参数：classes
    * @return 返回值class
    */
   public int delete(Class classes);
   public int BatchDelete(String[] params);
   /**
    * 查询全部班级信息
    * @return list
    */
   public List<Class> classList();
   /**
    * 查询全部班级信息（外键）
    * @return list
    */
   public List<Map<String, Object>> classMapList();
   /**
    * 根据系别编号查询班级信息
    * @param majorNo
    * @return list
    */
   public List<Map<String, Object>> classListbyMajor(String majorNo);
   /**
    * 根据ID查询班级信息
    * @param id
    * @return class
    */
   public Map<String, Object> classById(long id);
   /**
    * 根据classNo查询班级信息
    * @param classNo
    * @return class
    */
   public Map<String, Object> classbyNo(String classNo);
   /**
    * 根据专业查班级
    * @param major
    * @return
    */
   public List<Map<String, Object>> classByMajor(String major);
   /**
    * 班级编号重名验证
    * @param classNo
    * @return
    */
   public boolean renameClassbyNo(String classNo);
   /**
    * 分页查询class的数据信息
    * @param pagin 分页对象
    * @param conditions 查询条件
    * @param params 为查询条件赋值的参数
    * @return 查询到的pagin对象对应的，一页数据
    */
   public List<Map<String, Object>> paginGet(Pagin<Map<String,Object>> pagin,String hql,String... params);
   /**
    * 多条件查询分页
    * @param pagin 分页对象
    * @param classes 模糊查询的对象
    * @return
    */
   public List<Map<String, Object>> paginSearch(Pagin<Map<String,Object>> pagin,Class classes);
 }
