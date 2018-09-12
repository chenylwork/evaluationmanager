package com.evaluationmanager.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.StudentDao;
import com.evaluationmanager.entiy.Student;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.entiy.view.StudentView;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.support.AbstractDataDao;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-上午9:36:14
 * @Description 描述信息：
 *
 */
@Repository("studentDao")
public class StudentDaoImpl extends AbstractDataDao<Student> implements StudentDao{
	@Autowired
	private StudentViewDao studentViewDao;
	
	@Repository("studentViewDao")
	private class StudentViewDao extends AbstractDataDao<StudentView> implements DataDao<StudentView>{}
	/**
	 * 学生单条、批量删除
	 */
	@Override
	public int delete(List<String[]> params) {
		String sql = "delete from student where stuNo = ?";
		try {
			return batchModification(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 查询全部、多条件查询
	 */
	@Override
	public List<Map<String, Object>> paginSearchStudent(Pagin<Map<String, Object>> pagin, Student student, User user) {
		String sql = "1=1";
		List<String> paramsList = new ArrayList<>();
		if(student !=null && student.getStuNo() !=null && !"".equals(student.getStuNo())){
			sql +=" and this.no = ?";
			paramsList.add(student.getStuNo());
		}
		if(student !=null && user.getName() != null && !"".equals(user.getName())) {
			sql += " and this.name like ?";
			paramsList.add("%"+user.getName()+"%");
		}
		if(student !=null && student.getMajor() !=null && !"".equals(student.getMajor())){
			sql +=" and this.majorNo = ?";
			paramsList.add(student.getMajor());
		}
		if(student !=null && student.getClassNo() !=null && !"".equals(student.getClassNo())){
			sql +=" and this.classNo = ?";
			paramsList.add(student.getClassNo());
		}
		if(student !=null && student.getState() !=null && !"".equals(student.getState())){
			sql +=" and this.state = ? ";
			paramsList.add(student.getState());
		}
		if(student !=null && student.getJoinTime()!=null && !"".equals(student.getJoinTime())){
			sql +=" and this.joinTime = ? ";
			paramsList.add(student.getJoinTime());
		}
		String[] array = paramsList.toArray(new String[]{});
		pagin.setCount(studentViewDao.size(sql, array));
		return this.studentViewDao.paginGetMapDatas(pagin, sql, array);
	}
	
    /**
     * 根据学生学号获取学生详细信息视图
     */
	@Override
	public StudentView getStudent(String stuNo) {
		try {
			return studentViewDao.getDataByNo(stuNo);
		} catch (DataException e) {
			e.printStackTrace();
		}
		return null;
	} 
	public Map<String, Object> getStudentMap(String studentNo) {
		return studentViewDao.getMapDataByNo(studentNo);
	}

}
