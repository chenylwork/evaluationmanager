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

import com.evaluationmanager.dao.QuestionOptionDao;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.entiy.QuestionOption;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月27日-下午3:46:42
 * @Description 作用描述：试题-试题选项 关系操作实现类
 *
 */
@Repository("questionOptionDao")
public class QuestionOptionDaoImpl extends AbstractDataDao<QuestionOption> implements QuestionOptionDao{

	@Override
	/**
	 * 该方法实现降低了程序的可移植性，和可扩展性
	 * 需要后期将添加的sql语句提出来为配置文件。
	 */
	public int insert(QuestionOption... questionOptions) {
		String sql = "insert into question_option (question, letter, ratio, optionNo) "
				+ "values(?,?,?,?)";
		List<String[]> paramsList = new ArrayList<>(); 
		for(QuestionOption questionOption : questionOptions) {
			List<String> params = new ArrayList<>();
			params.add(questionOption.getQuestion());
			params.add(questionOption.getLetter());
			params.add(String.valueOf(questionOption.getRatio()));
			params.add(questionOption.getOption());
			paramsList.add(params.toArray(new String[]{}));
		}
		try {
			return super.batchModification(sql, paramsList);
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
	public int update(QuestionOption... questionOptions) {
		String sql = "update question_option set ratio = ? ,optionNo = ? where question = ? and letter = ?";
		List<String[]> paramsList = new ArrayList<>(); 
		for(QuestionOption questionOption : questionOptions) {
			List<String> params = new ArrayList<>();
			params.add(String.valueOf(questionOption.getRatio()));
			params.add(questionOption.getOption());
			params.add(questionOption.getQuestion());
			params.add(questionOption.getLetter());
			paramsList.add(params.toArray(new String[]{}));
		}
		try {
			return super.batchModification(sql, paramsList);
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
	public int delete(String... questionNos) {
		String sql = "delete from question_option where question = ?";
		List<String[]> paramList = new ArrayList<>();
		for(String param : questionNos) {
			paramList.add(new String[]{param});
		}
		try {
			return batchModification(sql, paramList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public Map<String, Object> getDataByQuestionNo(String questionNo) {
		String sql = " SELECT a.question questionNo ,a.letter letter,a.ratio ratio,a.optionNo optionNo , c.optionNo optionInfo, b.question questionInfo ,b.description description"
    +" FROM question_option a ,question b ,optionInfo c "
    +" WHERE a.question = b.questionno AND b.`questionNO` = ?  AND a.`optionNo` = c.optionNO order by a.question,a.optionNo ";
		return getQuestionOption(sql,questionNo).get(0);
	}
	@Override
	public Map<String, Object> getDataByQuestionNoName(String questionNo) {
		String sql = " SELECT a.question questionNo ,a.letter letter,a.ratio ratio,a.optionNo optionNo , c.info optionInfo, b.question questionInfo ,b.description description"
				+" FROM question_option a ,question b ,optionInfo c "
				+" WHERE a.question = b.questionno AND b.`questionNO` = ?  AND a.`optionNo` = c.optionNO order by a.question,a.optionNo";
		return getQuestionOption(sql,questionNo).get(0);
	}
	@Override
	public List<Map<String, Object>> randomGetQo(int randomSize) {
		String sql = "SELECT a.question questionNo ,a.letter letter,a.ratio ratio,a.optionNo optionNo , c.info optionInfo, b.question questionInfo ,b.description description"
				+" FROM question_option a , (SELECT * FROM question ORDER BY RAND() LIMIT "+randomSize+") b ,optionInfo c "+
     " WHERE a.question = b.questionno AND a.`optionNo` = c.optionNO ORDER BY b.questionNo,a.optionNo;";
		return getQuestionOption(sql);
	}
	/**
	 * 该方法查询出后的返回值，没有paper对象相关信息，需要修改
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午9:36:27
	 * @Description 作用描述
	 *
	 * @param paperNo
	 * @return
	 */
	public List<Map<String, Object>> getDataByPaperNo(String paperNo){
		String sql = "SELECT d.paper paperNo,d.number number,d.score score,a.question questionNo ,a.letter letter,a.ratio ratio,a.optionNo optionNo , c.info optionInfo, b.question questionInfo ,b.description description"+
     " FROM paper_question d ,question_option a ,question b ,optionInfo c "+ 
     " WHERE d.question = a.`question` AND a.question = b.questionno  AND a.`optionNo` = c.optionNO AND d.paper = ? ORDER BY d.number,a.question,a.optionNo";
		return getQuestionOption(sql,paperNo);
	}
	/**
	 * 获取试题信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午3:02:31
	 * @param sql
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> getQuestionOption(String sql,String... params) {
		List<Map<String, Object>> result = null;
		Connection connection = getJdbcCOnnection();
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(sql);
			for(int i=0; i<params.length; i++) {
				prepareStatement.setString(i+1, params[i]);
			}
			ResultSet resultSet = prepareStatement.executeQuery();
			result = new ArrayList<>();
			Map<String, Object> questionMap = null;
			String questionNo = "";
			List<QuestionOption> questionOptions = null;
			while(resultSet.next()) {
				String newNo = resultSet.getString("questionNo");
				if (!questionNo.equals(newNo)	|| questionNo == null) {
					questionNo = newNo;
					questionMap = new HashMap<>();
					Question question = new Question();
					questionOptions = new ArrayList<>();
					question.setQuestionNo(questionNo);
					question.setQuestion(resultSet.getString("questionInfo"));
					question.setDescription(resultSet.getString("description"));
					questionMap.put("question", question);
					questionMap.put("options", questionOptions);
					result.add(questionMap);
				}
				QuestionOption questionOption = new QuestionOption();
				questionOption.setQuestion(questionNo);
				questionOption.setOption(resultSet.getString("optionInfo"));
				questionOption.setLetter(resultSet.getString("letter"));
				questionOption.setRatio(resultSet.getInt("ratio"));
				questionOptions.add(questionOption);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Map<String, Object>> getQuestionOptionByPaper(String sql,String... params) {
		List<Map<String, Object>> result = null;
		Connection connection = getJdbcCOnnection();
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(sql);
			for(int i=0; i<params.length; i++) {
				prepareStatement.setString(i+1, params[i]);
			}
			ResultSet resultSet = prepareStatement.executeQuery();
			result = new ArrayList<>();
			Map<String, Object> questionMap = null;
			String questionNo = "";
			List<QuestionOption> questionOptions = null;
			while(resultSet.next()) {
				String newNo = resultSet.getString("questionNo");
				if (!questionNo.equals(newNo)	|| questionNo == null) {
					questionNo = newNo;
					questionMap = new HashMap<>();
					Question question = new Question();
					questionOptions = new ArrayList<>();
					question.setQuestionNo(questionNo);
					question.setQuestion(resultSet.getString("questionInfo"));
					question.setDescription(resultSet.getString("description"));
					questionMap.put("question", question);
					questionMap.put("options", questionOptions);
					result.add(questionMap);
				}
				QuestionOption questionOption = new QuestionOption();
				questionOption.setQuestion(questionNo);
				questionOption.setOption(resultSet.getString("optionInfo"));
				questionOption.setLetter(resultSet.getString("letter"));
				questionOption.setRatio(resultSet.getInt("ratio"));
				questionOptions.add(questionOption);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
