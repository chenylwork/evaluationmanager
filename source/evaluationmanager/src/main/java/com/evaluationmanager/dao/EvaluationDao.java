package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Evaluation;
import com.evaluationmanager.entiy.view.EvaluationView;
import com.evaluationmanager.support.DataDao;
/**
 * 测评操作接口
 * @Author 陈彦磊
 * @DateTime 2018年8月24日-上午2:28:45
 * @Description 作用描述
 *
 */
public interface EvaluationDao extends DataDao<Evaluation>{
	
	/**
	 * 多条件分页查询(测评数据信息)
	 * @Author 韩笑
	 * @param pagin
	 * @param ev
	 * @return
	 */
	public List<Map<String, Object>> paginSearchResults(Pagin<Map<String, Object>> pagin,EvaluationView ev);

	public EvaluationView getEvaluation(String teacherAccount);
	
	public Map<String, Object> getEvaluationMap(String teacherAccount);
	/**
	 * 根据用户账户查询该用户已评教信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月27日-下午9:49:59
	 * @Description 作用描述
	 *
	 * @param userNo
	 * @return
	 */
	public List<Evaluation> getUserEvaluation(String userNo);
	
	
}
