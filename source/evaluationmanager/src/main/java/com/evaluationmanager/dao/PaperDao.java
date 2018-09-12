package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Paper;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.view.PaperView;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月30日-上午10:38:46
 * @Description 描述信息：试卷信息操作接口
 *
 */
public interface PaperDao extends DataDao<Paper> {
	/**
	 * 随机抽取试题信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-上午2:13:42
	 * @Description 作用描述
	 *
	 * @return
	 */
	public List<Question> getRand();
	/**
	 * 获取试题信息详情
	 * @Author 陈彦磊
	 * @DateTime 2018年8月23日-上午2:14:22
	 *
	 * @param paperNo 试题编号
	 * @return List<Map<String, Object>>
	 */
	public List<PaperView> getPaperInfo(String paperNo);
	
	/**
	 * 分页条件查询试卷
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午10:53:35
	 * @param pagin
	 * @param paper
	 * @return
	 */
	public List<Map<String, Object>> paginGetPaper(Pagin<Map<String, Object>> pagin,Paper paper);
	/**
	 * 获取试卷个数
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午11:14:54
	 * @param paper
	 * @return
	 */
	public long size(Paper paper);
	
}
