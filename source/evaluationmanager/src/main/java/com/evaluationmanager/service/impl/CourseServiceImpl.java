package com.evaluationmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.dao.CourseDao;
import com.evaluationmanager.entiy.Course;
import com.evaluationmanager.service.CourseService;
import com.evaluationmanager.support.AbstractService;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月7日-上午9:54:08
 * @Description 描述信息：课程信息业务操作实现
 *
 */
@org.springframework.stereotype.Service("courseService")
public class CourseServiceImpl extends AbstractService<Course> implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourse() {
		return this.courseDao.getDatas("");
	}

}
