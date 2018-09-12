package com.evaluationmanager.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.dao.StudentDao;
import com.evaluationmanager.entiy.view.StudentView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentTest{
	
	@Autowired
	private StudentDao studentDao;
	
	@Test
	public void test() {
		StudentView student = studentDao.getStudent("1635050219");
		System.out.println(student);
	}
}
