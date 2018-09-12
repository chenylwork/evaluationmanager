package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.support.DataDao;

/**
 * 试卷教师关系操作接口
 * @Author 陈彦磊
 * @DateTime 2018年8月19日-下午9:04:11
 * @Description 作用描述
 *
 */
public interface PaperTeacherDao extends DataDao<PaperTeacher>{
	/**
	 * 根据教师编号获取，同事需要测评的试卷
	 * @Author 陈彦磊
	 * @DateTime 2018年8月20日-下午12:53:20
	 * @param teacherNo 教师编号
	 * @return 
	 */
	@Deprecated
	public List<Map<String,String>> getPaperTeacherByTeacherNo(String teacherNo);
	/**
	 * 根据教师编号和试卷编号，获取教师试卷关系视图详细信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-下午1:32:17
	 * @param paperNo 试卷编号
	 * @param teacherNo 教师编号
	 * @return PaperTeacher
	 */
	public PaperTeacher getPaperTeacher(String paperNo,String teacherNo);
	/**
	 * 根据教师编号及专业编号获取同事测评卷
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-上午12:54:49
	 * @Description 作用描述
	 *
	 * @param majorNo  需要获取的试卷对应教师的专业
	 * @param teacherNo 需要剔除的教师编号
	 * @return List<PaperTeacher> PaperTeacher
	 */
	public List<PaperTeacher> getMajorPaperTeacher(String majorNo,String teacherNo);
	/**
	 * 根据系别编号及教师工号获取测评卷
	 * 本方法将会返回deptNo对应的教师需要测评的试卷视图
	 * 若teacherNo存在具体的值，将从查询的试卷视图中剔除该参数对应的教师试卷视图
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-下午11:37:54
	 *
	 * @param deptNo 系别编号
	 * @param teacherNo 教师编号
	 * @return List<PaperTeacher> 教师对应的试卷关系视图
	 */
	public List<PaperTeacher> getDeptPaperTeacher(String deptNo,String teacherNo);
	/**
	 * 获取全部范围的教师试卷关系视图
	 * 若teacherNo参数存在具体的值，将剔除该教师对应的教师试卷视图信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-下午11:40:49
	 *
	 * @param teacherNo 教师编号
	 * @return List<PaperTeacher> 教师对应的试卷关系视图
	 */
	public List<PaperTeacher> getAllPaperTeacher(String teacherNo);
	/**
	 * 根据教师编号获取教师试卷视图信息
	 * 若teacherNos可接受多个值，即教师编号数组，获取某些教师的试卷关系视图信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月22日-下午11:57:22
	 *
	 * @param teacherNos 需要获取试卷视图信息的教师编号
	 * @return List<PaperTeacher>
	 */
	public List<PaperTeacher> getPaperTeacherByTeacherNo(String... teacherNos);

}
