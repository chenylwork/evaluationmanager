package com.evaluationmanager.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.ClassDao;
import com.evaluationmanager.dao.StudentDao;
import com.evaluationmanager.entiy.Class;
import com.evaluationmanager.service.ClassService;
import com.evaluationmanager.support.AbstractService;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午3:15:14
 * @description 班级信息业务操作实现
 */
@org.springframework.stereotype.Service("classService")
public class ClassServiceImpl extends AbstractService<Class> implements ClassService{
     private ClassDao classDao;
     @Autowired
     private StudentDao studentDao;
     @Autowired
	public void setClassDao(ClassDao classDao) {
		this.classDao = classDao;
		super.setDataDao(classDao);
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	@Transactional
	public Class add(Class classes) {
		super.changeData(classes, SAVE);
		return classes;
	}

	@Override
	@Transactional
	public Class update(Class classes) {
		super.changeData(classes, UPDATE);
		return classes;
	}

	@Override
	@Transactional
	public int delete(Class classes) {
		int count=0;
		if (studentDao.getMapDatas("this.classNo = ?", classes.getClassNo()).size()==0) {
			super.changeData(classes, DELETE);
			count=1;
		}else{
			count=0;
		}
		return count;
	}

	@Override
	@Transactional
	public List<Class> classList() {
	 List<Class> list = classDao.getDatas("");
		return list;
	}

	@Override
	@Transactional
	public List<Map<String, Object>> classListbyMajor(String majorNo) {
		String hql=" major=?";
		List<Map<String, Object>> classmapList = classDao.getMapDatas(hql, majorNo);
		return classmapList;
	}


	@Override
	@Transactional
	public Map<String, Object> classById(long id) {
		Map<String, Object> classByID = classDao.getMapDataById(id);
		return classByID;
	}

	@Override
	@Transactional
	public Map<String, Object> classbyNo(String classNo) {
		Map<String, Object> mapClassByNo = classDao.getMapDataByNo(classNo);
		return mapClassByNo;
	}

	@Override
	@Transactional
	public List<Map<String, Object>> classMapList() {
		List<Map<String, Object>> classMapList= classDao.getMapDatas("");
		return classMapList;
	}

	@Override
	@Transactional
	public Map<String, Collection<Class>> batchAdd() {

		return null;
	}

	@Override
	@Transactional
	public boolean renameClassbyNo(String classNo) {
		Class classes = classDao.renameClassbyNo(classNo);
		if (classes!=null) {
			return false;
		}else {			
			return true;
		}
	}

	@Override
	@Transactional
	public List<Map<String, Object>> classByMajor(String major) {
		String hql="major=?";
		return classDao.getMapDatas(hql, major);
	}

	@Override
	@Transactional
	public List<Map<String, Object>> paginGet(Pagin<Map<String, Object>> pagin, String conditions, String... params) {
		// 获取总个数
		pagin.setCount(classDao.size(conditions, params));
		//返回查询结果
		return classDao.paginGetMapDatas(pagin, conditions, params);
	}

	@Override
	@Transactional
	public List<Map<String, Object>> paginSearch(Pagin<Map<String, Object>> pagin, Class classes) {
		//获取总个数
		pagin.setCount(classDao.size(classes));
		//返回查询结果
		List<Map<String,Object>> paginSearchClass = classDao.paginSearchClass(pagin, classes);
		return paginSearchClass;
	}

	@Override
	@Transactional
	public int BatchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			System.out.println(string);
			paramList.add(new String[]{string});
		}
		
		return classDao.BatchDelete(paramList);
	}

}
