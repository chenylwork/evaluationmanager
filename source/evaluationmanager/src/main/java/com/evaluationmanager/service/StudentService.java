package com.evaluationmanager.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.*;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-上午9:41:23
 * @Description 描述信息：
 *
 */ 
public interface StudentService {
	
	/**
	 * 添加学生
	 * @param student
	 * @param user
	 * @return
	 */
	public boolean add(Student student,User user);
	/**
	 * 导入添加
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午6:14:04
	 * @Description 作用描述
	 *
	 * @param file
	 * @return
	 */
	public boolean batchInsert(File file,HttpServletRequest request);
	/**
	 * 学生单条、批量删除
	 * @param params
	 * @return
	 */
	public int delete(String[] params);
	/**
	 * 修改学生
	 * @param student
	 * @return
	 */
	public boolean update(Student student,User user);
	/**
	 * 根据ID查学生
	 * @param id
	 * @return
	 */
	public Student getStudentByID(long id);
	/**
	 * 根据stuNo查学生-外键
	 * @param stuNo
	 * @return
	 */
	public Map<String, Object> stuNobyMap(String stuNo);
	/**
	 * 根据classNo查学生-外键
	 * @param classNo
	 * @return
	 */
	public List<Map<String, Object>> classNobyMap(String classNo);
	/**
	 * 查询全部、多条件查询
	 * @param pagin
	 * @param student
	 * @param user
	 * @return
	 */
	public List<Map<String, Object>> paginSearchStudent(Pagin<Map<String, Object>> pagin, Student student, User user);
	/**
	 * 数据导出
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午2:48:08
	 * @Description 作用描述
	 *
	 * @return
	 */
	public InputStream export();
	/**
	 * 数据导入
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午3:43:14
	 * @Description 作用描述
	 *
	 * @param file
	 * @return
	 */
	public List<Map<String, String>> importStduent(File file,HttpServletRequest request);
	/**
	 * 根据班级编号获取本班学生信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-下午10:37:34
	 * @Description 作用描述
	 *
	 * @param classNo
	 * @return
	 */
	public List<Map<String,Object>> getStudentsByClass(String classNo);
	

}
