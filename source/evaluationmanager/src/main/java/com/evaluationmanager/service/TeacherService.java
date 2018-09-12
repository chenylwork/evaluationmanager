package com.evaluationmanager.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Teacher;
import com.evaluationmanager.entiy.User;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-上午11:10:58
 * @Description 描述信息：教师信息业务操作接口
 *
 */
public interface TeacherService {
	
	/**
	 * 添加教师，用户，关系表
	 * @return
	 */
	public boolean add(User u,Teacher t);
	
	/**
	 * 修改老师信息
	 * @param t
	 * @return
	 */
	public boolean update(User u,Teacher t);
	
	/**
	 * 删除老师信息
	 * @param t
	 * @return
	 */
	public boolean delete(Teacher t);
	
	/**
	 * 查询全部老师
	 * @return
	 */
	public List<Teacher> getAll();
	
	/**
	 * 根据Id查询老师
	 * @param id
	 * @return
	 */
	public Teacher getTeacherByID(long id);
	
	/**
	 * 查询全部老师(连外键)
	 * @return
	 */
	public List<Map<String, Object>> teacherListbyMap();
	
	/**
	 * 根据teacherNo查询教师（连外键）
	 * @param teacherNo
	 * @return
	 */
	public Map<String, Object> teacherNobyMap(String teacherNo);
	
	/**
	 * 老师批量删除
	 * @param params
	 * @return
	 */
	public int BatchDelete(String[] params);
	/**
	 * 分页多条件查询
	 * @param pagin
	 * @param teacher
	 * @param user
	 * @return
	 */
	public List<Map<String, Object>> paginSearchTeacher(Pagin<Map<String, Object>> pagin,Teacher teacher,User user);
	
	/**
	 * 上传文件
	 * @param file
	 * @return
	 */
	public List<Map<String, String>> importTeacher(File file);
}
