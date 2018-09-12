package com.evaluationmanager.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.common.ExcelHead;
import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.service.StudentService;
import com.evaluationmanager.unit.ExcelUnit;
import com.evaluationmanager.unit.NoMap;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ExcelTest {
	
	@Autowired
	private StudentService studentService;
	
	public static void main(String[] args) {
//		String title = "一个测试的导出Excel文件";
		//String[] headNames = {"学号","名称","性别","年龄","身份证号","专业","入学日期","毕业日期","现状态","所属班级"};
		String[] headNames = ExcelHead.getImportHeadNames(ExcelHead.STUDENT_FILE);
		//	
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("D:/test.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String, String>> load = ExcelUnit.load(inputStream, headNames);
		load.forEach(data -> {
			System.err.println(data);
		});
		
	}
	@SuppressWarnings("unchecked")
	@Test
	public void export() {
		String title = "一个测试的导出Excel文件";
		String[] headNames = ExcelHead.getExportHeadNames(ExcelHead.STUDENT_FILE);
		System.err.println(Arrays.asList(headNames));
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File("D:/test.xls"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<NoMap<String,String>> dataList = new ArrayList<>(); 
		List<Map<String, Object>> paginSearchStudent = studentService.paginSearchStudent(new Pagin<Map<String, Object>>(1,10), null, null);
		paginSearchStudent.forEach(dataRow -> {
			NoMap<String,String> map = new NoMap<String,String>();
			map.put("学号", (String)dataRow.get("stuNo"));
			map.put("姓名", (String)((Map<String,Object>)dataRow.get("user")).get("name"));
			Map<String,Object> user = ((Map<String,Object>)dataRow.get("user"));
			Map<String,Object> sex = (Map<String,Object>)user.get("sex");
			map.put("性别", (String)sex.get("name"));
			map.put("年龄", String.valueOf(user.get("age")));
			map.put("身份证号", (String)user.get("pid"));
			map.put("专业", (String)((Map<String,Object>)dataRow.get("major")).get("name"));
			map.put("入学日期", (String)dataRow.get("joinTime"));
			map.put("结业日期", (String)dataRow.get("overTime"));
			map.put("现状态", (String)((Map<String,Object>)dataRow.get("state")).get("name"));
			map.put("班级", (String)((Map<String,Object>)dataRow.get("classNo")).get("name"));
			System.err.println(""+map);
			dataList.add(map);
		});
		ExcelUnit.export(outputStream, title, headNames, dataList);
	}
	@Test
	public void importT() {
		String[] headNames = ExcelHead.getImportHeadNames(ExcelHead.STUDENT_FILE);
		//	
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("D:/test.xls"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String, String>> load = ExcelUnit.load(inputStream, headNames);
		load.forEach(data -> {
			System.err.println(data);
		});
	}


}
