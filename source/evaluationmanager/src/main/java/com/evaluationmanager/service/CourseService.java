package com.evaluationmanager.service;

import java.util.List;

import com.evaluationmanager.entiy.Course;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月7日-上午9:51:52
 * @Description 描述信息：课程信息业务操作接口
 *
 */
public interface CourseService {
	/**
	 * 查询全部课程
	 * @return
	 */
	public List<Course> getAllCourse();
}
