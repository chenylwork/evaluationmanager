package com.evaluationmanager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.EvaluationDao;
import com.evaluationmanager.entiy.Evaluation;
import com.evaluationmanager.entiy.view.EvaluationView;
import com.evaluationmanager.service.EvaluationService;
import com.evaluationmanager.support.AbstractService;
/**
 * 测评操作业务实现类
 * @Author 陈彦磊
 * @DateTime 2018年8月24日-上午2:35:21
 * @Description 作用描述
 *
 */
@Service("evaluationService")
public class EvaluationServiceImpl extends AbstractService<Evaluation> 
	implements EvaluationService{
	@Autowired
	private EvaluationDao evaluationDao;

	@Override
	@Transactional
	public boolean insertEvaluation(Evaluation evaluation) {
		return evaluationDao.add(evaluation);
	}

	@Override
	public List<Map<String, Object>> paginSearchEvaluation(Pagin<Map<String, Object>> pagin, EvaluationView ev) {
		return this.evaluationDao.paginSearchResults(pagin, ev);
	}
	@Override
	public List<Evaluation> getUserEvaluation(String userNo) {
		return evaluationDao.getUserEvaluation(userNo);
	}

}
