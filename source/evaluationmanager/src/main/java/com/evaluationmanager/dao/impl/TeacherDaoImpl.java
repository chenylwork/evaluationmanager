package com.evaluationmanager.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.TeacherDao;
import com.evaluationmanager.entiy.Teacher;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.entiy.view.TeacherView;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.support.AbstractDataDao;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-上午11:10:05
 * @Description 描述信息：教师操作实现类
 *
 */
@Repository("teacherDao")
public class TeacherDaoImpl extends AbstractDataDao<Teacher> implements TeacherDao {
	@Autowired
	private TeacherViewDao teacherViewDao; 
	
	@Override
	public int BatchDelete(List<String[]> params) {
		String sql = "delete from teacher where teacherNo = ?";
		try {
			return batchModification(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Map<String, Object>> teacherListbyMap() {
		List<Map<String, Object>> teacherMapList = null;
		try {
			teacherMapList = super.getMapDatas("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return teacherMapList;
	}

	@Override
	public Map<String, Object> teacherNobyMap(String teacherNo) {
		Map<String, Object> teacherbyNo = null;
		try {
			teacherbyNo = super.getMapDataByNo(teacherNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return teacherbyNo;
	}
	
	@Override
	public List<Map<String, Object>> paginSearchTeacher(Pagin<Map<String, Object>> pagin, Teacher teacher, User user) {
		String sql = "1=1";
		List<String> paramsList = new ArrayList<>();
		if(teacher !=null && user.getName() != null && !"".equals(user.getName())) {
			sql += " and this.name like ? ";
			paramsList.add("%"+user.getName()+"%");
		}
		if(teacher !=null && teacher.getState() !=null && !"".equals(teacher.getState())){
			sql +=" and this.state = ? ";
			paramsList.add(teacher.getState());
		}
		if(teacher !=null && teacher.getRole() !=null && !"".equals(teacher.getRole())){
			sql +=" and this.roleNo = ?";
			paramsList.add(teacher.getRole());
		}
		if(teacher !=null && teacher.getMajor() !=null && !"".equals(teacher.getMajor())){
			sql +=" and this.majorNo = ?";
			paramsList.add(teacher.getMajor());
		}
		String[] array = paramsList.toArray(new String[]{});
		pagin.setCount(teacherViewDao.size(sql, array));
		return this.teacherViewDao.paginGetMapDatas(pagin, sql, array);
	}

	@Override
	public TeacherView getTeacher(String teacherNo) {
		try {
			return teacherViewDao.getDataByNo(teacherNo);
		} catch (DataException e) {
			e.printStackTrace();
			return null;
		}
	}
	public Map<String, Object> getTeacherMap(String teacherNo) {
		return teacherViewDao.getMapDataByNo(teacherNo);
	}
	@Repository("teacherViewDao")
	private class TeacherViewDao extends AbstractDataDao<TeacherView> implements DataDao<TeacherView>{} 
}
