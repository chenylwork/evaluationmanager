package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Option;
import com.evaluationmanager.entiy.Paper;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.view.PaperTeacher;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.exception.DataException;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月30日-上午10:41:35
 * @Description 描述信息：试卷信息业务操作接口
 *
 */
public interface PaperService {
	
	/**
	 * 添加试卷信息
	 * 该业务方法，需要添加一条试卷元数据，还有试卷与实体关系多条关系数据
	 * @Author 陈彦磊
	 * @DateTime 2018年8月13日-上午10:44:37
	 * @param data 客户端传送来的json字符串数据
	 * @return 全部添加成功返回true，否则返回false
	 */
	public boolean add(String data);
	/**
	 * 获取试卷详细信息，包括其问题信息，问题选项信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-上午2:16:50
	 *
	 * @param paperNo 试卷编号
	 * @return List<PaperView> 试卷详细信息集合
	 */
	public List<PaperView> getPaper(String paperNo);
	/**
	 * 根据教师编号和试卷编号，获取试卷教师关系信息视图
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-下午2:13:11
	 * 
	 * @param paperNo 试卷编号
	 * @param teacherNo 教师编号
	 * @return PaperTeacher
	 */
	public PaperTeacher getPaperTeacher(String paperNo, String teacherNo);
	
	/**
	 * 修改试卷
	 * @param p
	 * @return
	 */
	public boolean update(Paper p);
	
	/**
	 * 删除试卷
	 * @param p
	 * @return
	 */
	public boolean delete(Paper p);
	/**
	 * 获取试题类型
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午3:55:46
	 * @Description 作用描述
	 *
	 * @return
	 */
	public String getPaperType();
	/**
	 * 分页条件查询试卷 信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午10:45:09
	 * @param pagin
	 * @return
	 */
	public List<Map<String, Object>> paginGetPaper(Pagin<Map<String, Object>> pagin,Paper paper);
	/**
	 * 随机抽取试题
	 * @return
	 */
	public List<Question> getRand();
	/**
	 * 查询全部试题
	 * @return
	 */
	public List<Question> getAllQues();
	/**
	 * 查询全部选项
	 * @return
	 */
	public List<Option> getAllOption();
	/**
	 * 获取全部试卷
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-下午4:23:07
	 * @Description 作用描述
	 *
	 * @return
	 */
	public List<Paper> getAllPaper();
	/**
	 * 根据用户编号查询该用户需要测评的试卷集合
	 * @Author 陈彦磊
	 * @DateTime 2018年8月20日-下午1:13:29
	 * @Description 作用描述
	 * @param account
	 * @return
	 */
	public List<PaperTeacher> getPaperTeachers(String account) throws DataException;
}
