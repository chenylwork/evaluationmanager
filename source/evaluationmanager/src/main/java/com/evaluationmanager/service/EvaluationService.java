package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Evaluation;
import com.evaluationmanager.entiy.view.EvaluationView;

/**
 * 测评操作服务接口
 * @Author 陈彦磊
 * @DateTime 2018年8月24日-上午2:31:48
 * @Description 作用描述
 *
 */
public interface EvaluationService {
	
	/**
	 * 添加测评信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月24日-上午2:33:46
	 *
	 * @param evaluation 测评实体类
	 * @return boolean 成功返回 SUCCESS 失败返回FAIL
	 */
	public boolean insertEvaluation(Evaluation evaluation);
	
	/**
	 * 多条件分页查询
	 * @Author 韩笑
	 * @param pagin
	 * @param ev
	 * @return
	 */
	public List<Map<String, Object>> paginSearchEvaluation(Pagin<Map<String, Object>> pagin,EvaluationView ev);
	/**
	 * 根据用户账户获取评教结果信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月27日-下午9:51:59
	 * @Description 作用描述
	 *
	 * @param userNo
	 * @return
	 */
	public List<Evaluation> getUserEvaluation(String userNo);

}