package com.evaluationmanager.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.PaperTeacherDao;
import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 试卷教师关系视图查询实现类
 * @Author 陈彦磊
 * @DateTime 2018年8月19日-下午9:08:06
 * @Description 作用描述
 *
 */
@Repository("paperTeacherDao")
public class PaperTeacherDaoImpl extends AbstractDataDao<PaperTeacher>
	implements PaperTeacherDao
{

	@Override
	@Deprecated
	public List<Map<String,String>> getPaperTeacherByTeacherNo(String teacherNo) {
		List<Map<String,String>> result = new ArrayList<Map<String,String>>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		if(teacherNo != null && !teacherNo.equals("")) {
			connection = getJdbcCOnnection();
			String sql = "SELECT * FROM "
					+" paper_teacher a ,"
					+" (SELECT teacherNo,USER,u.role userRole,major,state,PASSWORD,NAME,sex,age,t.role teacherRole,pid"
					+" FROM teacher t,USER u WHERE t.teacherNo = u.account AND t.major = (SELECT major FROM teacher WHERE teacherNo = ?)) b ,"
					+" paper c"
					+" WHERE a.teacher = b.teacherNo AND a.paper = c.paperNo";
			try {
				prepareStatement = connection.prepareStatement(sql);
				prepareStatement.setString(1, teacherNo);
				ResultSet resultSet = prepareStatement.executeQuery();
				while(resultSet.next()) {
					Map<String,String> map = new HashMap<>();
					map.put("paper", resultSet.getString("paper"));
					map.put("teacher", resultSet.getString("teacher"));
					map.put("startTime", resultSet.getString("startTime"));
					map.put("endTime", resultSet.getString("endTime"));
					map.put("user", resultSet.getString("user"));
					map.put("userRole", resultSet.getString("userRole"));
					map.put("major", resultSet.getString("major"));
					map.put("state", resultSet.getString("state"));
					map.put("password", resultSet.getString("password"));
					map.put("name", resultSet.getString("name"));
					map.put("sex", resultSet.getString("sex"));
					map.put("age", resultSet.getString("age"));
					map.put("teacherRole", resultSet.getString("teacherRole"));
					map.put("pid", resultSet.getString("pid"));
					map.put("paperNo", resultSet.getString("paperNo"));
					map.put("type", resultSet.getString("type"));
					map.put("description", resultSet.getString("description"));
					result.add(map);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					prepareStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return result;
	}
	@Override
	public PaperTeacher getPaperTeacher(String paperNo, String teacherNo) {
		List<PaperTeacher> datas = getDatas("this.id.paperNo = ? and this.id.teacherNo = ?",paperNo,teacherNo);
		return (datas != null && datas.size() > 0) ? datas.get(0) : null ;
	}
	/**
	 * 根据学生学号获取需要测评的试卷
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-上午12:45:10
	 * @Description 作用描述
	 *
	 * @param teacherNo
	 * @return
	 */
	public List<PaperTeacher> getPaperTeacherByStudentNo(String teacherNo) {
		return null;
	}
	@Override
	public List<PaperTeacher> getMajorPaperTeacher(String majorNo,String teacherNo){
		return (teacherNo != null && !teacherNo.equals(teacherNo)) ? 
				getDatas("this.major = ? and this.id.teacherNo NOT IN (?)",majorNo,teacherNo):
					getDatas("this.major = ?",majorNo);
	}
	@Override
	public List<PaperTeacher> getDeptPaperTeacher(String deptNo,String teacherNo) {
		return (teacherNo != null && !teacherNo.equals("")) ?
				getDatas("this.dept = ? and this.id.teacherNo NOT IN (?)", deptNo,teacherNo) :
					getDatas("this.dept = ?", deptNo);
	}
	@Override
	public List<PaperTeacher> getAllPaperTeacher(String teacherNo) {
		return (teacherNo != null && !teacherNo.equals("")) ? 
				getDatas("this.id.teacherNo NOT IN (?)", teacherNo):
					getDatas("");
	}
	@Override
	public List<PaperTeacher> getPaperTeacherByTeacherNo(String... teacherNos){
		if(teacherNos.length <= 0) return null;
		StringBuffer conditions = new StringBuffer("");
		for(int i=0; i<teacherNos.length; i++) {
			conditions.append((i>0) ? ",?" : "?");
		}
		return getDatas("this.id.teacherNo in ("+conditions+")", teacherNos);
	}
}
