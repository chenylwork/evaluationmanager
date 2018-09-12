package com.evaluationmanager.dao.impl;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.CourseDao;
import com.evaluationmanager.entiy.Course;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月7日-上午9:50:16
 * @Description 描述信息：课程信息操作实现
 *
 */
@Repository("courseDao")
public class CourseDaoImpl extends AbstractDataDao<Course> implements CourseDao{

}
