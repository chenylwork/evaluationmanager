package com.evaluationmanager.dao.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.QuestionDao;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月26日-上午10:26:50
 * @Description 问题操作实现类
 */
@Repository("questionDao")
public class QuestionDaoImpl extends AbstractDataDao<Question> implements QuestionDao {
	
	private String conditions;
	private String[] params;
	@Override
	/**
	 * 该方法实现降低了程序的可移植性，和可扩展性
	 * 需要后期将添加的sql语句提出来为配置文件。
	 */
	public int insert(Question... questions) {
		List<String[]> paramsList = new ArrayList<String[]>();
		String sql = "insert into question(questionNo,question,description)"
				+ "values(?,?,?)";
		for(Question question : questions) {
			String[] params = new String[3];
			params[0] = question.getQuestionNo();
			params[1] = question.getQuestion();
			params[2] = question.getDescription();
			paramsList.add(params);
		}
		try {
			return batchModification(sql, paramsList);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	/**
	 * 该方法实现降低了程序的可移植性，和可扩展性
	 * 需要后期将添加的sql语句提出来为配置文件。
	 */
	public int update(Question... questions) {
		List<String[]> paramsList = new ArrayList<String[]>();
		String sql = "update question set question = ?, description = ? "
				+ " where questionNo = ?";
		for(Question question : questions) {
			String[] params = new String[3];
			params[1] = question.getQuestion();
			params[2] = question.getDescription();
			params[0] = question.getQuestionNo();
			paramsList.add(params);
		}
		try {
			return batchModification(sql, paramsList);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	/**
	 * 该方法实现降低了程序的可移植性，和可扩展性
	 * 需要后期将添加的sql语句提出来为配置文件。
	 */
	public int delete(String... params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			paramList.add(new String[]{string});
		}
		String sql = "delete from question where questionNo = ?";
		try {
			return batchModification(sql, paramList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean ishas(String questionInfo) {
		String conditions = "this.question = ?";
		String[] params = {questionInfo};
		return isHas(conditions, params);
	}

	@Override
	public List<Question> paginSearchQuestion(Pagin<Question> pagin, Question question) {
		initSearchConditions(question);
		return super.paginSearchData(pagin,conditions,params);
	}

	@Override
	public long size(Question question) {
		initSearchConditions(question);
		return super.size(conditions,params);
	}
	/**
	 * 初始化查询条件
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-上午2:48:47
	 * @param question question 对象
	 */
	private void initSearchConditions(Question question) {
		StringBuffer conditions = new StringBuffer(" 1=1 ");
		List<String> paramsList = new ArrayList<>();
		if (question !=null) {
			if (question.getQuestionNo() !=null && !"".equals(question.getQuestionNo())) {
				conditions.append(" and this.questionNo = ? ");
				paramsList.add(question.getQuestionNo());
			}
			if(question.getQuestion() != null && !"".equals(question.getQuestion())) {
				conditions.append(" and this.question like ? ");
				paramsList.add("%"+question.getQuestion()+"%");
			}
		}
		this.conditions = conditions.toString();
		this.params = paramsList.toArray(new String[]{});
	}

	@Override
	public boolean check(String questionName) {
		return super.isHas("this.question = ?", questionName);
	}

	
}
