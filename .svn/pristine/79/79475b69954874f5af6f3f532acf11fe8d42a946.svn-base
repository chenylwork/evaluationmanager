package com.evaluationmanager.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.OptionDao;
import com.evaluationmanager.dao.QuestionDao;
import com.evaluationmanager.dao.QuestionOptionDao;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.QuestionOption;
import com.evaluationmanager.service.QuestionService;
import com.evaluationmanager.unit.NoEnum;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @Author 陈彦磊
 * @DateTime 2018年7月26日-上午10:32:36
 * @Description 问题信息操作业务实现类
 */
@org.springframework.stereotype.Service("questionService")
public class QuestionServiceImpl implements QuestionService {
	
	private Logger logger = Logger.getLogger(QuestionServiceImpl.class);
	
	@Autowired
	private QuestionDao questionDao;
	@Autowired
	private OptionDao optionDao;
	@Autowired
	private QuestionOptionDao questionOptionDao;
	@Autowired
	private Gson gson;
	
	private List<Question> questionList ;
	private List<QuestionOption> questionOptionList;
	
	private int questionSuccessSize;
	private int questionOptionSuccessSize;
	@Override
	@Transactional
	public int add(String data) {
		try {
			batchHandle(data);
			questionSuccessSize = questionDao.insert(questionList.toArray(new Question[]{}));
			questionOptionSuccessSize = questionOptionDao.insert(questionOptionList.toArray(new QuestionOption[]{}));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (questionSuccessSize == questionList.size() 
				&& questionOptionSuccessSize == questionOptionList.size()) 
				? SUCCESS : FAIL;
	}
	@Override
	@Transactional
	public int update(String data) {
		batchHandle(data);
		questionSuccessSize = questionDao.update(questionList.toArray(new Question[]{}));
		questionOptionSuccessSize = questionOptionDao.update(questionOptionList.toArray(new QuestionOption[]{}));
		return batchCheck();
	}
	@Override
	@Transactional
	public int delete(String... questionNos){
		// 删除关系表信息
		questionOptionDao.delete(questionNos);
		// 删除question表信息并返回
		return questionDao.delete(questionNos);
	}
	/**
	 * 批量操作结果检查
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午9:14:27
	 * @return 需要添加的问题数与添加成功的数据数相等时返回SUCCESS 否则返回FAIL
	 */
	private int batchCheck() {
		return (questionSuccessSize == questionList.size() 
				&& questionOptionSuccessSize == questionOptionList.size()) 
				? SUCCESS : FAIL;
	}
	/**
	 * 批量操作的数据解析，将客户端传来的json格式数据进行转换
	 * 存储在各操作集合中用于后续的批量操作。
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午9:16:01
	 * @param data 需要解析的json格式的数据信息，该信息应该是字符串类型的
	 */
	private void batchHandle(String data) {
		questionList = new ArrayList<>();
		questionOptionList = new ArrayList<>();
		try {
			Map<String,Object> map = gson.fromJson(data, new TypeToken<Map<String,Object>>(){}.getType());
			Question question = new Question();
			// 问题编号处理
			String questionNo = (String)map.get("questionNo");
			if (questionNo == null || "".equals(questionNo)) {
				questionNo = NoEnum.Question.getNo();
			}
			question.setQuestionNo(questionNo);
			question.setQuestion((String)map.get("question"));
			questionList.add(question);
			List<?> options = (ArrayList<?>) map.get("options");
			
			for(int i=0; i < options.size(); i++) {
				@SuppressWarnings("unchecked")
				Map<String, Object> info = (Map<String, Object>) options.get(i);
				QuestionOption questionOption = new QuestionOption();
				questionOption.setLetter((String)info.get("letter"));
				questionOption.setQuestion(questionNo);
				questionOption.setOption((String)info.get("option"));
				questionOption.setRatio(Integer.parseInt((String)info.get("ratio")));
				questionOptionList.add(questionOption);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
	@Override
	public int check(Question question) {
		return questionDao.ishas(question.getQuestion()) ? SUCCESS : FAIL;
	}
	@Override
	@Transactional(readOnly=true)
	public String paginSearch(Pagin<Question> pagin,Question question) {
		pagin.setCount(questionDao.size(question));
		questionDao.paginSearchQuestion(pagin, question);
		return gson.toJson(pagin);
	}
	@Override
	@Transactional(readOnly=true)
	public String getQuestionByNo(String no) {
		return gson.toJson(questionOptionDao.getDataByQuestionNo(no));
	}
	@Override
	@Transactional(readOnly=true)
	public String getQuestionByNoName(String no) {
		return gson.toJson(questionOptionDao.getDataByQuestionNoName(no));
	}
	@Override
	public String randomGetQuestionO(int randomSize) {
		List<Map<String, Object>> randomGetQo = questionOptionDao.randomGetQo(randomSize);
		return gson.toJson(randomGetQo);
	}
	@Override
	public String getAllQuestion() {
		return gson.toJson(questionDao.getDatas(""));
	}
	@Override
	public String getQuestionByPaperNo(String paperNo) {
		return gson.toJson(questionOptionDao.getDataByPaperNo(paperNo));
	}
}
