package com.evaluationmanager.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.dao.PaperTeacherDao;
import com.evaluationmanager.entiy.Student;
import com.evaluationmanager.entiy.view.PaperTeacher;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TypeTest extends Student{
	@Autowired
	private PaperTeacherDao paperTeacherDao;
	@Test
	public void test() {
		List<PaperTeacher> paperTeacherByTeacherNo = paperTeacherDao.getAllPaperTeacher("");
		paperTeacherByTeacherNo.forEach(action -> {
			System.err.println(action);
		});
	}
	
	
}
