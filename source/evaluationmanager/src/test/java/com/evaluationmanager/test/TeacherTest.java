package com.evaluationmanager.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.TeacherDao;
import com.evaluationmanager.entiy.Teacher;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.entiy.view.TeacherView;
import com.evaluationmanager.service.TeacherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TeacherTest{
	
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private TeacherDao teacherDao;
	
	@Test
	public void test() {
		List<Map<String, Object>> paginSearchTeacher = teacherService.paginSearchTeacher(new Pagin<Map<String, Object>>(1,10),new Teacher(),new User());
		paginSearchTeacher.forEach(data -> {
			System.err.println(data);
		});
	}
	@Test
	public void test1() {
		TeacherView teacher = teacherDao.getTeacher("songyixue");
		System.out.println(teacher);
	}
	@Test
	public void test2() {
		Map<String, Object> teacherMap = teacherDao.getTeacherMap("songyixue");
		System.out.println(teacherMap);
	}
	public static void main(String[] args) {
		
	}
}
