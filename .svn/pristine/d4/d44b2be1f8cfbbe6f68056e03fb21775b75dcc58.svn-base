package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.*;
import com.evaluationmanager.entiy.view.StudentView;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-上午9:13:39
 * @Description 描述信息：
 *
 */
public interface StudentDao extends DataDao<Student>{
	/**
	 * 学生单条、批量删除
	 * @param params
	 * @return
	 */
	public int delete(List<String[]> params);
	/**
	 * 查询全部、多条件查询
	 * @param pagin
	 * @param student
	 * @param user
	 * @return
	 */
	public List<Map<String, Object>> paginSearchStudent(Pagin<Map<String, Object>> pagin, Student student, User user);
	/**
	 * 根据学生学号获取学生详细信息视图
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-下午11:16:41
	 *
	 * @param stuNo 学生编号
	 * @return StudentView 视图实体对象
	 */
	public StudentView getStudent(String stuNo);
	
	public Map<String, Object> getStudentMap(String studentNo);


}
