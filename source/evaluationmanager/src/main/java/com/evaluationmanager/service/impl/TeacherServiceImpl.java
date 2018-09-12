package com.evaluationmanager.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.ExcelHead;
import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.TeacherDao;
import com.evaluationmanager.dao.UserDao;
import com.evaluationmanager.entiy.Teacher;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.service.TeacherService;
import com.evaluationmanager.support.AbstractService;
import com.evaluationmanager.unit.ExcelUnit;
import com.evaluationmanager.unit.Md5Unit;
import com.evaluationmanager.unit.NoMap;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-上午11:12:30
 * @Description 描述信息：教师信息操作业务实现类
 *
 */
@org.springframework.stereotype.Service("teacherService")
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {
	
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private UserDao userDao;
	

	/**
	 * 添加教师信息
	 * 同时添加教师、用户、以及教师课程关系
	 */
	@Override
	@Transactional
	public boolean add(User u,Teacher t) {
		return (this.userDao.add(u) && this.teacherDao.add(t));
	}

	/**
	 * 修改教师信息
	 */
	@Override
	@Transactional
	public boolean update(User u,Teacher t) {
		return (this.userDao.update(u) && this.teacherDao.update(t));
	}

	/**
	 * 删除教师信息
	 */
	@Override
	@Transactional
	public boolean delete(Teacher t) {
		return this.teacherDao.delete(t);
	}

	/**
	 * 获取全部教师信息
	 */
	@Override
	@Transactional
	public List<Teacher> getAll() {
		return this.teacherDao.getDatas("");
	}
	
	/**
	 * 根据Id查找教师
	 */
	@Override
	@Transactional
	public Teacher getTeacherByID(long id) {
		return this.teacherDao.getDataByID(id);
	}


	/**
	 * 查询全部老师(连外键)
	 */
	@Override
	@Transactional(readOnly=true)
	public List<Map<String, Object>> teacherListbyMap() {
		return this.teacherDao.teacherListbyMap();
	}
	
	/**
	 * 根据teacherNo查询教师（连外键）
	 */
	@Override
	@Transactional(readOnly=true)
	public Map<String, Object> teacherNobyMap(String teacherNo){
		return this.teacherDao.teacherNobyMap(teacherNo);
	}

	/**
	 * 老师批量删除
	 */
	@Override
	@Transactional
	public int BatchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			//System.out.println(string);
			paramList.add(new String[]{string});
		}
		return this.teacherDao.BatchDelete(paramList);
	}

	/**
	 * 分页多条件查询
	 */
	@Override
	@Transactional
	public List<Map<String, Object>> paginSearchTeacher(Pagin<Map<String, Object>> pagin,Teacher teacher,User user) {
		return this.teacherDao.paginSearchTeacher(pagin,teacher,user);
	}
	
	/**
	 * 数据导出
	 * @Author 陈彦磊
	 * @DateTime 2018年8月17日-下午4:51:03
	 * @Description 作用描述
	 * @param pagin
	 * @param student
	 * @param serchUser
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public InputStream export(List<Map<String, Object>> data) {
		String title = "一个测试的导出Excel文件";
		String[] headNames = ExcelHead.getExportHeadNames(ExcelHead.TEACHER_FILE);
		System.err.println(Arrays.asList(headNames));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		List<NoMap<String,String>> dataList = new ArrayList<>(); 
		data.forEach(dataRow -> {
			NoMap<String,String> map = new NoMap<String,String>();
			map.put("教职工号", (String)dataRow.get("stuNo"));
			map.put("名称", (String)((Map<String,Object>)dataRow.get("user")).get("name"));
			Map<String,Object> user = ((Map<String,Object>)dataRow.get("user"));
			Map<String,Object> sex = (Map<String,Object>)user.get("sex");
			map.put("性别", (String)sex.get("name"));
			map.put("年龄", String.valueOf(user.get("age")));
			map.put("身份证号", (String)user.get("pid"));
			/**************/
			map.put("专业", (String)((Map<String,Object>)dataRow.get("major")).get("name"));
			map.put("入学日期", (String)dataRow.get("joinTime"));
			map.put("结业日期", (String)dataRow.get("overTime"));
			map.put("现状态", (String)((Map<String,Object>)dataRow.get("state")).get("name"));
			map.put("班级", (String)((Map<String,Object>)dataRow.get("classNo")).get("name"));
			System.err.println(""+map);
			dataList.add(map);
		});
		// 产生POI输出流
		ExcelUnit.export(outputStream, title, headNames, dataList);
		return new ByteArrayInputStream(outputStream.toByteArray());
	}
	/**
	 * 导入excel文件
	 * @Author 陈彦磊
	 * @DateTime 2018年8月17日-下午4:50:53
	 * @Description 作用描述
	 * @param file
	 */
	public List<Map<String, String>> importTeacher(File file) {
		String[] headNames = ExcelHead.getImportHeadNames(ExcelHead.STUDENT_FILE);
		//	
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String, String>> load = ExcelUnit.load(inputStream, headNames);
		load.forEach(data -> {
			System.err.println(data);
		});
		return load;
	}

}
