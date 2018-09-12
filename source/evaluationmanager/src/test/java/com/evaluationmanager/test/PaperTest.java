package com.evaluationmanager.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.PaperService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PaperTest{
	
	@Autowired
	private PaperService paperService;
	
	@Test
	public void teacher() throws DataException {
		List<PaperTeacher> paperTeachers = paperService.getPaperTeachers("songyixue");
		paperTeachers.forEach(data -> {
			System.out.println(data);
		});
	}
	@Test
	public void student() throws DataException {
		List<PaperTeacher> paperTeachers = paperService.getPaperTeachers("1635050104");
		paperTeachers.forEach(data -> {
			System.out.println(data);
		});
	}
	@Test
	public void info() throws DataException {
		List<PaperView> paper = paperService.getPaper("1159268356");
		paper.forEach(data -> {
			System.out.println(data);
		});
	}
	@Test
	public void paperTeacher() {
		PaperTeacher paperTeacher = paperService.getPaperTeacher("1159268356", "gaobaihe");
		System.err.println(paperTeacher);
	}
	
	
}
