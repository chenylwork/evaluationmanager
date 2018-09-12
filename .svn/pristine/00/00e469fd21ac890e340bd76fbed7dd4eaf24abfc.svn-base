package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Teacher;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.entiy.view.TeacherView;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-上午11:07:54
 * @Description 描述信息：教师信息操作接口
 *
 */
public interface TeacherDao extends DataDao<Teacher> {
	/**
	 * 老师批量删除
	 * @param params
	 * @return
	 */
	public int BatchDelete(List<String[]> params);
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
	 * 分页多条件查询
	 * @param pagin
	 * @param major
	 * @return
	 */
	public List<Map<String, Object>> paginSearchTeacher(Pagin<Map<String, Object>> pagin, Teacher teacher, User user);
	/**
	 * 根据教师编号查询教师详情视图信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-下 午3:59:44
	 * @param teacherNo 教师编号
	 * @return
	 */
	public TeacherView getTeacher(String teacherNo);
	
	public Map<String, Object> getTeacherMap(String teacherNo);

}
